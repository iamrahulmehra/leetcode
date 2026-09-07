class Solution {
    public static boolean isPalindrome(String s,int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {

        int n = s.length();
        int left = 0 ;
        int right = n-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            } 
            left++;
            right--;  
        }
        return true;
    }
}