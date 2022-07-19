class Solution {
    public boolean isPalindrome(String s) {
        //get only chars
        s = s.toLowerCase();
        //split into array. charToArray
        char[] charArray = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for(char c: charArray){
            if(c >= 'a' && c <= 'z'){ 
                arr.add(c);
            }
            else if (c >= '0' && c <= '9'){
                arr.add(c);
            }
        }
        
        //for loop. check index going forward and back. end at middle
        // check for matches
        while(arr.size() > 1){
            int i = 0;
            if(arr.remove(i) != arr.remove(arr.size() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}