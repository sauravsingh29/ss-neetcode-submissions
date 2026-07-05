class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int len = 1;
        int tempLen = 1;

        for(int i= 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - nums[i] == 1) {
                tempLen++;
                len = Math.max(len, tempLen);
            } else if (nums[i + 1] == nums[i]) {
                continue;
            } else {
                tempLen = 1;
            }

        }
        return len;
    }
}

