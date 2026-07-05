class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int area = 0;
        while(i < j) {
            int w = j - i;
            int h = Math.min(heights[i], heights[j]);
            area = Math.max(area, (w * h));
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}