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

        public static void main(String...args){
        TreeNode node = new TreeNode(null, null, 5);
        TreeNode node1 = new TreeNode(null, null, 8);
        TreeNode node2 = new TreeNode(node, node1, 4);
        System.out.println("Size="+size(node2));
        System.out.println("Max Depth="+maxDepth(node2));
        }
}
