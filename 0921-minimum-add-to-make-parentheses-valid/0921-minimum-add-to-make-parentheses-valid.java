import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int close=0;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='(') {
                st.push(c);
            } else { 
                if (!st.isEmpty()&&st.peek()=='(') {
                    st.pop();
                } else {
                    close++;
                }
            }
        }
        return close+st.size();
    }
}