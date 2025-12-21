class Solution {
    public String alphabetBoardPath(String target) {
        int col=0,row=0;
        StringBuilder sb=new StringBuilder();

        for(char c:target.toCharArray()){
            int curr_row=(c-'a')/5;
            int curr_col=(c-'a')%5;

            while(row>curr_row){
                sb.append('U');
                row--;
            }

            while(col>curr_col){
                sb.append('L');
                col--;
            }

            while(row<curr_row){
                sb.append('D');
                row++;
            }

             while(col<curr_col){
                sb.append('R');
                col++;
            }

            sb.append('!');

        }

        return sb.toString();
    }
}