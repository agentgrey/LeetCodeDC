class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        
        for(int i=0; i<spells.length; i++) {
            int a = spells[i];
            int j = binarySearch((long)spells[i], potions, success);
            ans[i] = potions.length-j;
        }
        
        return ans;
    }
    
    public int binarySearch(long spell, int[] potions, long success) {
        int start = 0;
        int end = potions.length;
        while (start < end) {
            int middle = start + (end - start) / 2;
            long productValue = potions[middle] * spell;
            if (success > productValue) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return end;
    }
}