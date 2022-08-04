class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[n] = climbStairsRec(n - 2, arr) + climbStairsRec(n - 1, arr);
        return arr[n];
    }
    
    public int climbStairsRec(int n, int[] arr){
        if(arr[n] != 0){
            return arr[n];
        }
        return arr[n] = climbStairsRec(n - 2, arr) + climbStairsRec(n - 1, arr);
    }
}