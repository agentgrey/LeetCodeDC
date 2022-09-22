class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] sArr = s.split(" ");
        
        for(int i=0; i<sArr.length; i++) {
            StringBuilder t = new StringBuilder();
            t.append(sArr[i]);
            t = t.reverse();
            ans += t;
            if(i!=sArr.length-1) 
                ans += " ";
        }
        
        return ans;
    }
}