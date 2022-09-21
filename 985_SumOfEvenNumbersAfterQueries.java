class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] answer = new int[n];
        
        int Tsum = 0;
        for(int i=0; i<n; i++) 
            if(nums[i]%2==0) 
                Tsum += nums[i];
        
        for(int i=0; i<queries.length; i++) {
            int add = queries[i][0];
            int idx = queries[i][1];
            
            int sum = Tsum;
            if(nums[idx]%2==0) sum -= nums[idx];
            
            int newNums = nums[idx]+add;
            if(newNums%2==0) sum += newNums;
            
            answer[i] = sum;
            nums[idx] = newNums;
            Tsum = sum;
        }
        
        return answer;
    }
}s