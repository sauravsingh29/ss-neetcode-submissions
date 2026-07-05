class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        char[] so = s.toCharArray();
        String orig = "";
        for(int i = 0; i < so.length; i++) {
            char ch = so[i];
            if(Character.isLetter(ch) || Character.isDigit(ch)) {
                orig += ch;
            }
        }
        StringBuffer sb = new StringBuffer(orig);
      return sb.reverse().toString().equals(orig);
    }
}
