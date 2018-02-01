class TreeNode{
        TreeNode left;
        TreeNode right;
        int var;
        TreeNode(TreeNode left, TreeNode right, int var){
                this.left = left;
                this.right = right;
                this.var = var;
        }
        void setLeft(TreeNode node){
                this.left = node;
        }

        void setRight(TreeNode node){
                this.right = node;
        }

        void setVar(int var){
                this.var = var;
        }

        int getVar(){
                return var;
        }

        TreeNode getRigth(){
                return right;
        }

        TreeNode getLeft(){
                return left;
        }
}
