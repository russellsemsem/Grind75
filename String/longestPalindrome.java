class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0){
            return 0;
        }
        
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(char c: arr){
            if(map.get(c) == null){
                map.put(c, 1);
            }
            else {
                map.put(c, map.get(c) + 1);
            }
        }
        
        int evenTotal = 0;
        int oddTotal = 0;
        int oddCounter = -1;
        for(char c: map.keySet()){
            if(map.get(c) % 2 == 0){
                evenTotal += map.get(c);
            }
            else {
                oddTotal += map.get(c);
                oddCounter++;
            }
        }
        
        if(oddCounter == -1){
            return evenTotal;
        }
        return evenTotal + (oddTotal - oddCounter);
        
    }
}