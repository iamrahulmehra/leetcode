class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0 ,e= 0 ,i=0; 
        
        while(i<nums.length){
            if(nums[e]!=0){
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
            }
            e++; 
            i++;
        }
    }
}