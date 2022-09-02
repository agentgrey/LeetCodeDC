class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int s = q.size();
            Queue<TreeNode> q2 = new LinkedList<>();
            long sum = 0;
            
            while(!q.isEmpty()) {
                TreeNode x = q.poll();
                sum += (x==null)? 0: x.val;
                q2.offer(x);
            }
            // System.out.println(sum +" " +s);
            ans.add(((double)sum/s));
            while(!q2.isEmpty()) {
                TreeNode x = q2.poll();
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
        }
        
        return ans;
    }
}