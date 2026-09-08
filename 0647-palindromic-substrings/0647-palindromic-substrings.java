class Solution {
    public boolean isPalindrome(String str){
        int left = 0 ;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int result = 0 ;
        
        for(int i = 0 ; i< s.length();i++){
            String str="";
            for(int j = i ; j<s.length();j++){
                str += s.charAt(j);
                if(isPalindrome(str)){
                    result++;
                }
            }
        }
        return result;
    }
}