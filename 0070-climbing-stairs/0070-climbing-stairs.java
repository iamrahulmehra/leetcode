class Solution {
    public int climbStairs(int n) {
        int nums[]=new int[45];
        int a = 1;
        int prev= 2;
        int sum = 3;
        nums[0]=a;
        nums[1]=prev;
        nums[2]=sum;
        
        for(int i = 3 ; i<45;i++){
            int curr = sum;
            sum=curr+prev;
            nums[i]=sum;
            prev = curr;
            
        }
        return nums[n-1];

    }
}