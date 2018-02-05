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
    public static int count(LinkedNode node){
                if (node==null) return 0;
                else return count(node.next)+1;
        }
     public static LinkedNode getNth(LinkedList node, int k){
                if (k==0) return node;
                if (node==null) return null;
                return getNth(node.next, k-1);
        }
   public static LinkedNode getNthfromEnd(LinkedList node, int k){
                LinkedNode tmp = node;
                LinkedNode tmp2 = node;
                while (k!=0){
                        if (tmp1.next==null) return null;
                        tmp1 = tmp1.next;
                        k--;
                }
                while(tmp1.next!=null){
                        tmp1 = tmp1.next;
                        tmp2 = tmp2.next;
                }
                return tmp2;
        }
}
