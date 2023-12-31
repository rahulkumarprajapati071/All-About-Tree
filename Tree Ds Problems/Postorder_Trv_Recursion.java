class Postorder_Trv_Rec{
    List<Integer> ans = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return ans;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }
}