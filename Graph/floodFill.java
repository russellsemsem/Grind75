class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //recursively iterate through the adjacent pixels
         
        //if orgin pixel == color, no change
        if(image[sr][sc] == color){
            return image;
        }
          
        //track original value
        int value = image[sr][sc];
        image[sr][sc] = color;
        
        int up = sr - 1;
        int down = sr + 1;
        int left = sc - 1;
        int right = sc + 1;
         
        // if next pixel is IN graph and have same value of original value
        // visit every adjacent and valid pixel
        // iterates similarly to DFS
        if(up != -1 && image[up][sc] == value){
            floodFill(image, up, sc, color);
        }
        if(down != image.length && image[down][sc] == value){
            floodFill(image, down, sc, color);
        }
        if(left != -1 && image[sr][left] == value){
            floodFill(image, sr, left, color);
        }
        if(right != image[0].length && image[sr][right] == value){
            floodFill(image, sr, right, color);
        }
        
        return image;
    }
}