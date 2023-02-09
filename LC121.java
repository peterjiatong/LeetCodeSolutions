public class LC121 {
    public int maxProfit(int[] prices) {
        //CC
        if (prices == null || prices.length == 1) return 0;

        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            maxProfit = prices[i] - min > maxProfit ? prices[i] - min : maxProfit;
        }
        return maxProfit;
    }
}