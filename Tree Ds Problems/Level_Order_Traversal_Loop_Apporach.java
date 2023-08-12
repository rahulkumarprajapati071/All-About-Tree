class Level_Order_Traversal_Loop_Apporach{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null)return ans;
        int level = heightFinder(root);
        for(int i = 1; i <= level; i++){
            ans.add(solution(root,i));
        }
        return ans;
    }
    public List<Integer> solution(TreeNode root, int level){
        List<Integer> list = new ArrayList();
        if(root == null)return list;
        if(level == 1)
        {
            list.add(root.val);
            return list;
        }else if(level > 1){
            list.addAll(solution(root.left,level - 1));
            list.addAll(solution(root.right,level - 1));
        }
        return list;
    }
    public int heightFinder(TreeNode root){
        if(root == null)return 0;
        return Math.max(heightFinder(root.left),heightFinder(root.right)) + 1;
    }
}