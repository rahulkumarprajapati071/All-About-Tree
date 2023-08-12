class Inorder_Trv_Interativly {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if(root == null)return ans;
        Stack<TreeNode> st = new Stack();
        TreeNode currNode = root;
        while(true){
            if(currNode != null){
                st.push(currNode);
                currNode = currNode.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                currNode = st.pop();
                ans.add(currNode.val);
                currNode = currNode.right;
            }
        }
        return ans;
    }
}