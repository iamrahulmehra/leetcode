class Solution {

    public boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public int countSubstrings(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);
                if (isPalindrome(str))
                    result++;
            }
        }

        return result;
    }
};