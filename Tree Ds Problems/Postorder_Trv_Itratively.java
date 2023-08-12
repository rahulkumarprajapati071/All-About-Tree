class Postorder_Trv_Itratively {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        Stack<TreeNode> st1 = new Stack();
        Stack<Integer> st2 = new Stack();

        if(root == null)return ans;
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root.val);
            if(root.left != null)st1.push(root.left);
            if(root.right != null)st1.push(root.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop());
        }
        return ans;
    }
}