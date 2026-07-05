class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dups = new HashSet<>();
        int origArraylength =  nums.length;
        for(int i = 0;  i < origArraylength; i++) {
            dups.add(nums[i]);
        }
        System.out.println(nums.length + " " + dups.size());
        return dups.size() != nums.length;
    }
}