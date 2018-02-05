class LinkedList{
   public static LinkedNode insertInFront(Node head, int value){
                LinkedNode node = new LinkedNode(null, value);
                node.next = head;
                return node;
        }
   public static LinkedNode search(LinkedNode head, int value){
                if (head==null) return null;
                if (head.value==value) return head;
                LinkedList tmp = head.next;
                while(tmp!=null){
                        search(tmp, value);
                }
        }
}
