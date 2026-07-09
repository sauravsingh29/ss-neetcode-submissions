class Solution {
    public String minWindow(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(tl > sl) {
            return "";
        }
        int[] target = new int[128];
        int[] window = new int[128];

        for(char c : t.toCharArray()) {
            target[c]++;
        }

        int st = 0;
        int l = 0;
        int minLen = Integer.MAX_VALUE;

        for(int r = 0; r < sl; r++) {

            char rc = s.charAt(r);
            window[rc]++;
            if(target[rc] > 0 && window[rc] <= target[rc]) {
                tl--;
            }

            while(tl == 0) {
                if(r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    st = l;
                }

                char lc = s.charAt(l);
                window[lc]--;

                if(target[lc] > 0 && window[lc] < target[lc]) {
                    tl++;
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(st, st + minLen);

    }
}
