class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        if(coins.length == 0){
            return 0;
        }
        int INF = amount+1;
        int[] dp = new int[amount+1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = INF;
        }
        
        dp[0] = 0;
        
        for (int coin : coins) {
            if (coin > amount) {
                continue;
            }
            dp[coin] = 1;
        }
        
        for(int i = 1; i <= amount; i++){
            int min = -1;
            for(int coin : coins){
                if(coin >= i){
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i-coin]+1); 

            }
        }
        
        return dp[amount] >= INF ? -1 : dp[amount];
        
    }
}

