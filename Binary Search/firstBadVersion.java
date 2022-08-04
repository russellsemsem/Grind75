/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//uses binary search 
//1 2 3 4 5
//f f f t t
//
//1 2
//f t
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)){
            return 1;
        }
        
        int low = 1;
        int high = n;
        while(low <= high){
            int middle = low + (high - low) / 2;
            int previous = middle - 1;
            if(previous == 0){
                previous = 1;
            }
            if(isBadVersion(middle) && !isBadVersion(previous)){
                return middle;
            }
            
            if(isBadVersion(middle)){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return n;
    }
}