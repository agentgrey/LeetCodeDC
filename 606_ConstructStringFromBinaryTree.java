class Solution {
    StringBuilder sb;
    
    public String tree2str(TreeNode t) {
        sb = new StringBuilder();
        help(t);
        return sb.toString();
    }
    
    public void help(TreeNode root){
        if(root == null)return;
        if(root.left == null && root.right==null){
            sb.append(root.val);
            return;
        }
        sb.append(root.val);
        sb.append('(');
        
        help(root.left);
        sb.append(')');
        
        if(root.right!=null){
            sb.append('(');
            
            help(root.right);
            sb.append(')');
        }
        
        return;
    }
}