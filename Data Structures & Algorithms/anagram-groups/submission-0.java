
 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        if(len == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> outputMap = new HashMap<>();
        for(String s: strs) {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            outputMap.putIfAbsent(key, new ArrayList<>());
            outputMap.get(key).add(s);
        }
        return new ArrayList<>(outputMap.values());
    }
}
