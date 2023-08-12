class Preorder_Trv_Iteratively {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        Stack<TreeNode> st = new Stack();
        if(root == null)return ans;
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            ans.add(root.val);
            if(root.right != null)st.push(root.right);
            if(root.left != null)st.push(root.left);
        }
        return ans;
    }
}