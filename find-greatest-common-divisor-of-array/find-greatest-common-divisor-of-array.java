class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int gcd = 0;
        for(int i = 1;i<=nums[0];i++){
            if(nums[len-1] % i == 0 && nums[0] % i == 0){
                gcd = i;
            }
        }
    return gcd;
    }
}