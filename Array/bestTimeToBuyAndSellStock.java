/*
    Break the array into segements
    A new segement is created when min is updated
        max is reset to zero
    If a new segment's profit (max - min) is greater than the 
    greatest profit of a previous/current segement
        update the max and profit
    
    Example:
    prices: 6 7 8 9 | 4 10 5 | 0 2 3
    
    6 7 8 9: profit 3
    4 10 5: profit 6 (updated profit)
    0 2 3: profit 6 (this segments greatest profit of 3 is not greater 
    than a previous segment's profit, never updates profit)
    
    return profit 6
*/

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++){
            
            if(prices[i] < min){
                min = prices[i];
                max = 0;
            }
            else if(prices[i] > max && prices[i] - min > profit){
                max = prices[i];
                profit = max - min;
            }
        }
        return profit;
        
    }
}