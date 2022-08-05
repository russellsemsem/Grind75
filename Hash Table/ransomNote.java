/*

    Checking if ransomNote is a subset of magazine
        ransomNote must have same or less amount of characters
        ransonNote each character must be used same or 
            less amount of magazine's same character
        ransomNote must only use the letters found in magazine
        
    Another solution:
        compare lengths
        
        using one complete hashmap of magazine
        go through each of ransom's character
            if character not used return false
            if character is used subtract value by 1.
                if character's value = -1 return false (ransom uses a
                character more times than magazine)

*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ranArr = ransomNote.toCharArray();
        char[] magArr = magazine.toCharArray();
        
        if(ranArr.length > magArr.length){
            return false;
        }
        
        HashMap<Character, Integer> magMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> ranMap = new HashMap<Character, Integer>();
            
        for(char i: magArr){
            if(magMap.get(i) == null){
                magMap.put(i, 1);
            }
            else {
                magMap.put(i, magMap.get(i) + 1);
            }
        }
        
        
        //return false if...
        // ransom uses a letter not in magazine
        // ransom uses a letter more times than magazine
        for(char i: ranArr){
            
            if(magMap.get(i) == null){
                return false;
            }
            else if (ranMap.get(i) == null){
                ranMap.put(i, 1);
            }
            else {
                ranMap.put(i, ranMap.get(i) + 1);
                if(ranMap.get(i) > magMap.get(i)){
                    return false;
                }
            }
        }
        return true;
        
    }
}