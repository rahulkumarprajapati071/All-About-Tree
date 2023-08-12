class Check_Balanced_Binary_Tree_Optimized {
    public boolean isBalanced(TreeNode root) {
        return heightFinder(root) != -1;
    }
    int heightFinder(TreeNode root){
        if(root == null)return 0;

        int lH = heightFinder(root.left);
        if(lH == -1)return -1;
        int rH = heightFinder(root.right);
        if(rH == -1)return -1;

        if(Math.abs(lH - rH) > 1)return -1;

        return Math.max(lH,rH) + 1;
    }
}