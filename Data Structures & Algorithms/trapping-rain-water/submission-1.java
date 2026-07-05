class Solution {
    public int trap(int[] height) {
        int rightMax = 0;
        int leftMax = 0;
        int i = 0;
        int j = height.length - 1;
        int water = 0;
        while(i < j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            if (leftMax < rightMax) {
                water += leftMax - height[i];
                i++;
            } else {
                water += rightMax - height[j];
                j--;
            }

        }
        return water;
    }
}
