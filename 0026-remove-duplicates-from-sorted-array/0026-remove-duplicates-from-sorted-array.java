class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int insertIndex = 1; // Tracks where to put the next unique element
        
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique number
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i]; // Move it forward
                insertIndex++;               // Increment our unique count
            }
        }
        
        return insertIndex;
    }
}
