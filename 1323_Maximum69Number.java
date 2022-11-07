class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        String ans ="";
        int i=0;
        for(i=0; i<s.length(); i++) {
            if(s.charAt(i)=='6') {
                ans+='9';
                break;
            }
            ans += s.charAt(i);
        }
        if(i<s.length()) ans += s.substring(i+1, s.length());
        return Integer.parseInt(ans);
    }
}