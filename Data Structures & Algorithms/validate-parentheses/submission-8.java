class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<Character>();
        char[] sc = s.toCharArray();

        for (char c : sc) {
            if(c == '[') {
                st.push(']');
            } else  if(c == '{') {
                st.push('}');
            } else if(c == '(') {
                st.push(')');
            } else {
                if(st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
