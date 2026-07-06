class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0;
        int maxLen = 0;
        int maxFrq = 0;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            count[c - 'A']++;
            maxFrq = Math.max(maxFrq,  count[c - 'A']);
            while((r - l + 1) - maxFrq > k) {
                 count[s.charAt(l) - 'A']--;
                 l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
