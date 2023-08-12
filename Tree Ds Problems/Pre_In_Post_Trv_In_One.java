class Pre_In_Post_Trv_In_One{
    private void printInPreAndPostTraversal(Node root) {
        Stack<Pair> stack = new Stack();
        stack.push(new Pair(root,1));
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        while(!stack.isEmpty()){
            Pair pair = stack.pop();
            if(pair.num == 1){
                //preorder
                preorder.add(pair.root.data);
                //++
                pair.num++;
                stack.push(pair);
                //left
                if(pair.root.left != null){
                    stack.push(new Pair(pair.root.left,1));
                }
            }else if(pair.num == 2){
                //inorder
                inorder.add(pair.root.data);
                //++
                pair.num++;
                stack.push(pair);
                //right
                if(pair.root.right != null){
                    stack.push(new Pair(pair.root.right,1));
                }
            }else{
                //postorder
                postorder.add(pair.root.data);
            }
        }
        System.out.println("Preorder: "+preorder);
        System.out.println("Inorder: "+inorder);
        System.out.println("Postorder: "+postorder);
    }
    class Pair{
        int num;
        Node root;
        public Pair(Node root, int num){
            this.root = root;
            this.num = num;
        }
    }
}