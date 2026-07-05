class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
         char[] tArr = t.toCharArray();
         Arrays.sort(sArr);
         Arrays.sort(tArr);
         System.out.println(Arrays.toString(sArr));
         System.out.println(Arrays.toString(tArr));
         return Arrays.equals(sArr, tArr);
    }
}
