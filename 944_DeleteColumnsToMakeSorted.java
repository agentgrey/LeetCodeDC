class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        char[][] ch = new char[strs.length][strs[0].length()];

        for(int i=0; i<strs.length; i++) {
            ch[i] = strs[i].toCharArray();
        }

        for(int j=0; j<ch[0].length; j++) {
            boolean check = true;
            char prev = ch[0][j];
            for(int i=1; i<ch.length; i++) {
                if(prev<=ch[i][j]) prev=ch[i][j];
                else {
                    check = false;
                    break;
                }
            }
            if(!check) count++;
        }

        return count;
    }
}s