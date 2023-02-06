class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a = 0;
        int b = n;
        int[] arr = new int[2*n];
        for(int i=0; i<2*n; i++) {
            if(i%2==0) {
                arr[i] = nums[a++];
            } else {
                arr[i] = nums[b++];
            }
        }

        return arr;
    }
}