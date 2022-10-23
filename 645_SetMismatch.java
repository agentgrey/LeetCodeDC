class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int [] ans = new int[2];
        
        for(int i=0;i<n;i++){
            if(arr[nums[i]-1]!=0){
                ans[0]=nums[i]; 
            }
            else{
                arr[nums[i]-1]++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                ans[1]=i+1;
                return ans;
            }
        }
        
        
        return ans;
    }
}