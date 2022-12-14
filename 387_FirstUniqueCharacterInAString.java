class Solution {
    public int firstUniqChar(String s) {
        int[] ch = new int[256];
        for(int i=0; i<s.length(); i++) {
            ch[s.charAt(i)-'0']++;
        }
        
        for(int i=0; i<s.length(); i++) {
            if(ch[s.charAt(i)-'0']==1) return i;
        }
        
        return -1;
    }
}