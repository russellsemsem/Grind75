/*
    if not same length, immediately not an anagram
    
    keep track of the alphabets being used in an Array 
    by adding (add s's letters) and minusing (minus t's letter) 
    
    if s and t are truly anagrams then the counts at 
    each index would be 0
    
    by end of first loop, if theres a count at where it is not zero, 
    then s and t are not anagrams
*/


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ return false; }
        
        int[] charCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            // 'a' - 'a' = 0, first in alaphabet
            // 'z' - 'a' = 25, last in apahabet
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        
        for(int i: charCount){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}