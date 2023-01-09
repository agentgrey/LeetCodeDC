
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList();

        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return ans;
    }
}