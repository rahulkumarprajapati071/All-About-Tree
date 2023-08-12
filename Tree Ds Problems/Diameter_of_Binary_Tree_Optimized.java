class Diameter_of_Binary_Tree_Optimized{
    private int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        heightFinder(root);
        return max;
    }
    public int heightFinder(TreeNode root){
        if(root == null){
            return 0;
        }
        int lH = heightFinder(root.left);
        int rH = heightFinder(root.right);

        max = Math.max(max, lH + rH);

        return Math.max(lH,rH) + 1;

    }
}