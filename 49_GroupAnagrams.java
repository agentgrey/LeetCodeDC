class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            
            char[] c = s.toCharArray();
            Arrays.sort(c);
            
            String ss = String.valueOf(c);
            
            if (!map.containsKey(ss)) 
                map.put(ss, new ArrayList<>());
            
            map.get(ss).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}