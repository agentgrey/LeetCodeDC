class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : paths) {
            String[] arr = s.split("\\ ");
            String dir = arr[0];
            
            for(int i=1; i<arr.length; i++) {
                int j=0;
                String file = "";
                for(j=arr[i].length()-2; j>=0 && arr[i].charAt(j)!='('; j--) {
                    file = arr[i].charAt(j) + file;
                }
                
                String path = arr[i].substring(0,j);
                if(!map.containsKey(file)) {
                    map.put(file, new ArrayList<String>());
                }
                map.get(file).add(dir + "/" + path);
            }
               
        }
        
        for(String s : map.keySet()) {
            if(map.get(s).size() >= 2) {
                ans.add(new ArrayList<>(map.get(s)));
            }
        }
        return ans;
    }
}