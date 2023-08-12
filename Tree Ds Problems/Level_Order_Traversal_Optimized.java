class Level_Order_Traversal_Optimized{
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList();
        List<List<Integer>> ans = new ArrayList();
        if(root == null) return ans;
        qu.offer(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> list = new ArrayList();
            for(int i = 1; i <= size; i++){
                root = qu.peek();
                if(root.left != null)qu.offer(root.left);
                if(root.right != null)qu.offer(root.right);
                list.add(qu.poll().val);
            }
            ans.add(list);
        }
        return ans;
    }
}