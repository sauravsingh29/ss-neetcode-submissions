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
        System.out.println(orig);
        char[] chars = orig.toCharArray();
        String rev = "";
        for(int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        System.out.println("Rev "+ rev);
      return rev.equals(orig);
    }
}
