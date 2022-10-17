class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
                
        for(char i='a'; i<='z';) {
            if(sentence.contains(i+"")) i++;
            else return false;
        }
        
        return true;
    }
}