class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int prod = 1;
        int sum = 0;
        int rem;
        while(temp!=0){
            rem = temp%10;
            temp = temp/10;
            prod = prod * rem;
            sum = sum+rem;
        }
    return prod-sum;
    }
}