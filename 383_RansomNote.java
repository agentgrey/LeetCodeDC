class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        
        int[] arr = new int[26];
        for(int i=0; i<magazine.length(); i++) {
            char ch = magazine.charAt(i);
            arr[ch-'a']++;
        }
        
        for(int i=0; i<ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            arr[ch-'a']--;
            if(arr[ch-'a']<0) return false;
        }
        
        return true;
    }
}