class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

        dp[0][0]=true;

        for(int j=1;j<=m;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int pc=p.charAt(j-1);
                int sc=s.charAt(i-1);

                if(pc==sc || pc=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(pc=='*'){
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
}