class Solution {
    
    Map<Character, Integer> map = new HashMap();
    
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        
        for(int i = 1; i < words.length; i++) {
            if(!order(words[i - 1], words[i])) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean order(String w1, String w2) {
        int i = 0, j = 0;
        
        while(i < w1.length() && j < w2.length()) {
            int wc1 = map.get(w1.charAt(i++));
            int wc2 = map.get(w2.charAt(j++));
            if(wc1 < wc2) {
                return true;
            } else if(wc1 > wc2) {
                return false;
            }
        }
        
        return w1.length() <= w2.length();
    }
}