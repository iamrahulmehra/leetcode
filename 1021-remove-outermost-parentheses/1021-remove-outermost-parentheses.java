class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        int opened = 0;

        for(int i = 0; i < S.length(); i++) {

            if(S.charAt(i) == '(') {
                // Keep '(' only if it is not the outermost one
                if(opened > 0)
                    ans.append(S.charAt(i));

                opened++;
            }

            if(S.charAt(i) == ')') {
                opened--;

                // Keep ')' only if it is not the outermost one
                if(opened > 0)
                    ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }
}