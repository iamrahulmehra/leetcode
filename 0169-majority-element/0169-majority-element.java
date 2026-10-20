class Solution {
    public int majorityElement(int[] nums) {
        int candidate =nums[0];
        int vote = 0;
        for(int i :nums){
            if(vote==0){
                candidate=i;
                vote++;
            }
            else{
                vote +=(i==candidate)?1:-1;
            }
            
        }
        return candidate;
    }
}