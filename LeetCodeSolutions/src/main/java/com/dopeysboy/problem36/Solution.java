package com.dopeysboy.problem36;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //'0' is ASCII code 48, '9' is 57
        //check each 3x3 if it contains each digit once
        //check each 1x9 if it contains each digit once
        //check each 9x1 if it contains each digit once
        
        //each row
        for(int i = 0; i < board.length; i++){
            //9, one for each digit
            int[] rowContains = new int[9];
            //each box in that row
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                } else {
                    int idx = board[i][j] - 49;
                    if(rowContains[idx] == 1){
                        return false;
                    } else {
                        rowContains[idx] = 1;
                    }
                }
            }
        }
        
        //each column in a 9x9
        for(int i = 0; i < 9; i++){
            
            int[] columnContains = new int[9];
            
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.'){
                    continue;
                } else {
                    int idx = board[j][i] - 49;
                    if(columnContains[idx] == 1){
                        return false;
                    } else {
                        columnContains[idx] = 1;
                    }
                }
            }
        }
        
        //search 3x3 grids
        /*[0][0], [0][1], [0][2]    [0][3], [0][4], [0][5]
          [1][0], [1][1], [1][2]    [1][3], [1][4], [1][5]
          [2][0], [2][1], [2][2]    [2][3], [2][4], [2][5] 
          then j + 1
          then i + 1
        */
        
        for(int boxX = 0; boxX < 9; boxX += 3){
            for(int boxY = 0; boxY < 9; boxY += 3){                
                int[] boxContains = new int[9];
                
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(board[i + boxX][j + boxY] == '.'){
                            continue;
                        } else {
                            int idx = board[i + boxX][j + boxY] - 49;
                            if(boxContains[idx] == 1){
                                return false;
                            } else {
                                boxContains[idx] = 1;
                            }
                        }
                    } 
                }
            }
        }
        return true;
    }
}