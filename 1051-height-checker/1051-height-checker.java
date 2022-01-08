class Solution {
    public int heightChecker(int[] heights) {
        int[] original = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            original[i] = heights[i];
        }
        
        int counter = 0;
        Arrays.sort(heights);
        for(int i =0;i<original.length;i++){
            if(heights[i] != original[i]){
                counter++;
            }
        }
        
        
    return counter;
    }
}