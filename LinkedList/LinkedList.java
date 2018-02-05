class LinkedList{
   public static LinkedNode insertInFront(Node head, int value){
                LinkedNode node = new LinkedNode(null, value);
                node.next = head;
                return node;
        }
}
