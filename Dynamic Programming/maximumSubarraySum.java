/*
    Kadane's Algorithm
    
    starting at very 0, check which sum is greater -->
    1. the current sum of the current subarray
    2. the current value at index i 
    
    if current value is greater, 
        update current sum to equal that value (start new subarray)
        can ignore the subarray/sum before it
        
    if current subarray sum is greater
        update current sum to equal that subarray sum
        
    check if current sum is greater than max sum
        if so uodate max area


*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(currSum + nums[i] > nums[i]){
                currSum = currSum + nums[i];
            } 
            else {
                currSum = nums[i];
            }
            
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;   
    }
}