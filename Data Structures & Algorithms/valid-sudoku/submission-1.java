class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
                HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j] == '.')
                    continue;
                if(set.contains(board[i][j]))
                    return false;
                else
                    set.add(board[i][j]);
            }    
        }

        for(int i=0;i<board.length;i++){
                HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i] == '.')
                    continue;
                if(set.contains(board[j][i]))
                    return false;
                else
                    set.add(board[j][i]);
            }    
        }

        for(int i=0;i<board.length;i=i+3){
                HashSet<Character> set = new HashSet<>();
                HashSet<Character> set1 = new HashSet<>();
                HashSet<Character> set2 = new HashSet<>();
                for(int k=0;k<=2;k++){
                    for(int j=0;j<board.length;j++){
                        if(board[j][i+k] == '.')
                            continue;
                        if(j/3==0){
                            if(set.contains(board[j][i+k]))
                                return false;
                            else
                                set.add(board[j][i+k]);
                        }
                        if(j/3==1){
                            if(set1.contains(board[j][i+k]))
                                return false;
                            else
                                set1.add(board[j][i+k]);
                        }
                        if(j/3==2){
                            if(set2.contains(board[j][i+k]))
                                return false;
                            else
                                set2.add(board[j][i+k]);
                        }
                    }
                }
            set.clear();
            set1.clear();
            set2.clear();    
        }
    return true;
    }
}
