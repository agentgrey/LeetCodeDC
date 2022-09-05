class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>(); 
        
        if (root == null) {
            return res;
        }
        q.add(root);
        
        while (!q.isEmpty()) {
            int s = q.size(); 
            List<Integer> list = new ArrayList<>();
            while (s-- >0) {
                Node temp = q.poll();
                list.add(temp.val); 
                q.addAll(temp.children); 
            }
            res.add(list); 
        }
        return res;
    }
}