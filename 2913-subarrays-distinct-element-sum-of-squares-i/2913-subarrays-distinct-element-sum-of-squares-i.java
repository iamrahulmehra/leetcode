class Solution {
   public int sumCounts(List<Integer> nums) {
    int sum = 0;
    int n = nums.size(); // Fixed syntax error

    for (int i = 0; i < n; i++) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int j = i; j < n; j++) {
            uniqueElements.add(nums.get(j)); // Tracks unique values automatically
            int count = uniqueElements.size();
            sum += count * count;
        }
    }
    return sum;
}

}