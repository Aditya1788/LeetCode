class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        alt[0] = 0;
        for(int i =1;i<gain.length+1;i++){
            alt[i] = alt[i-1] + gain[i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int j = 0; j<alt.length;j++){
            if(alt[j] > max){
                max = alt[j];
            }
        }
    return max;
    }
}