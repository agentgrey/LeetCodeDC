class Solution {
    public String minWindow(String s, String t) {
        if(s=="" || t=="") return "";
        if(s==null || t==null) return "";
        
        int[] freq = new int[128];
        int n = s.length();
        int m = t.length();
        
        for(int i=0; i<m; i++) freq[t.charAt(i)]++;
        
        int st=0,e=0,idx=0;
        int length=m;
        int min = Integer.MAX_VALUE;
        
        while(e<n) {
            if(freq[s.charAt(e)]>0) {
                length--;
            }
            
            if(length==0) {
                while(length==0) {
                    if(min>e-st){
                    min = e-st;
                    idx = st;
                }
                freq[s.charAt(st)]++;
                if(freq[s.charAt(st)]>0){
                    length++;
                }
                st++;
                }
            }
            
            freq[s.charAt(e)]--;
            e++;
            
        }
        
        
        return (min==Integer.MAX_VALUE) ? "" : s.substring(idx,min+idx+1);
    }
}