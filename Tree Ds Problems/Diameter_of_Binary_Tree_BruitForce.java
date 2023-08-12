class Diameter_of_Binary_Tree_BruitForce{
    private int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        service(root);
        return max;
    }
    public void service(TreeNode root){
        if(root == null){
            return;
        }
        int lH = heightFinder(root.left);
        int rH = heightFinder(root.right);

        max = Math.max(max, lH + rH);

        service(root.left);
        service(root.right);

    }
    public int heightFinder(TreeNode root){
        if(root == null)return 0;
        return Math.max(heightFinder(root.left),heightFinder(root.right)) + 1;
    }
}