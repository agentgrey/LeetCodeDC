
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        helper(root, targetSum, list, ans);
        
        return ans;
    }
    
    public void helper(TreeNode root, int targetSum, List<Integer> list, List<List<Integer>> ans){
        if(root == null) return;
        
        if(root.left == null && root.right == null){
            if(targetSum - root.val == 0){
                list.add(root.val);
                ans.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        
        list.add(root.val);
        
        helper(root.left, targetSum - root.val, list, ans);
        helper(root.right, targetSum - root.val, list, ans);
        
        list.remove(list.size() - 1);
    }
}