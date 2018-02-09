class Tree{
        // Tree problems in java
        // Sizze of the tree
        public static int size(TreeNode node){
                if (node==null) return 0;
                return size(node.left)+size(node.right)+1;
        }

        // Max Depth of the tree
        public static int  maxDepth(TreeNode node){
                if (node==null) return 0;
                return Math.max(maxDepth(node.left)+1, maxDepth(node.right)+1);

        }       

        public static void printInOrder(TreeNode node){
                if (node==null) return;
                printInOrder(node.left);
                System.out.print(node.var+", ");
                printInOrder(node.right);
        }

        public static void printPreOrder(TreeNode node){
                 if (node==null) return;
                System.out.print(node.var+", ");
                printPreOrder(node.left);
                printPreOrder(node.right);
        }

        public static void printPostOrder(TreeNode node){
                if (node==null) return;
                printPostOrder(node.left);
                printPostOrder(node.right);
                System.out.print(node.var+", ");
        }

        public static void insert(TreeNode node, int val){
                if (node==null) return;
                if (node.var<val){
                        if (node.right!=null) insert(node.right, val);
                        else node.right = new TreeNode(null, null, val);
                } else {
                         if (node.left!=null) insert(node.left, val);
                        else node.left = new TreeNode(null, null, val);
                }

        }

        public static TreeNode find(TreeNode node, int var){
                if (node==null) return null;
                if (node.var==var) return node;
                if (node.var<var){ return find(node.right, var);}
                else return find(node.left, var);
        }
        public static void printFindResults(TreeNode node, int var){
                TreeNode tmp = find(node, var);
                if (tmp==null) System.out.println("No results for "+var);
                else System.out.println("Result:"+tmp.var);
        }
        
         public static void main(String...args){
                TreeNode node = new TreeNode(null, null, 5);
                TreeNode node1 = new TreeNode(null, null, 8);
                TreeNode node2 = new TreeNode(node, node1, 4);

                System.out.println("Size="+size(node2));
                System.out.println("Max Depth="+maxDepth(node2));
                System.out.println("InOrder:");
                printInOrder(node2);
                System.out.println("\nPreOrder:");
                printPreOrder(node2);
                System.out.println("\nPostOrder:");
                printPostOrder(node2);
                System.out.println("");
                insert(node2, 9);
                printInOrder(node2);
                System.out.println("");
                printFindResults(node2, 9);
                printFindResults(node2, 10);
        }



}
