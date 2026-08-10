package Leetcode;

class Q1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        int n = accounts.length;
        for(int i=0;i<n;i++){
           int currcustWealth =0;
            for(int j=0;j<accounts[i].length;j++){
               currcustWealth += accounts[i][j];
            }
            maxWealth=Math.max(maxWealth,currcustWealth);
        }
        return maxWealth;
    }
}
