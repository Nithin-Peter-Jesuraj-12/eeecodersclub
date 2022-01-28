class Stocks {
    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int gain=0,i;
        for(i=0;i<prices.length;i++){
            if(prices[i]<least) least=prices[i];
            else if((prices[i]-least)>gain) gain=prices[i]-least;
        }
        return gain;
    }
}