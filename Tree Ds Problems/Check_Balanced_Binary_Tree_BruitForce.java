class Check_Balanced_Binary_Tree_BruitForce{
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int lH = heightFinder(root.left);
        int rH = heightFinder(root.right);

        if(Math.abs(lH - rH) > 1){
            return false;
        }

        boolean leftCheck = isBalanced(root.left);
        boolean rightCheck = isBalanced(root.right);

        if(!leftCheck || !rightCheck){
            return false;
        }
        return true;
    }
    int heightFinder(TreeNode root){
        if(root == null)return 0;
        return 										Math.max(heightFinder(root.left),heightFinder(root.right)) + 1;
    }
}