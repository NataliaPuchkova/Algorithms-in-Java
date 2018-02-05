class LinkedList{
   public static LinkedNode insertInFront(LinkedNode head, int value){
                LinkedNode node = new LinkedNode(null, value);
                node.next = head;
                return node;
        }

        public static LinkedNode search(LinkedNode head, int value){
                if (head==null) return null;
                if (head.value==value) return head;
                LinkedNode tmp = head.next;
                return search(tmp, value);
        }
        public static int count(LinkedNode node){
                if (node==null) return 0;
                else return count(node.next)+1;
        }

        public static LinkedNode getNth(LinkedNode node, int k){
                if (k==0) return node;
                if (node==null) return null;
                return getNth(node.next, k-1);
        }

        public static LinkedNode getNthfromEnd(LinkedNode node, int k){
                LinkedNode tmp1 = node;
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
   public static void deleteList(LinkedNode node){
                if (node==null) return;
                LinkedList tmp = node.next;
                node=null;
                deleteList(tmp);
        }
public static int pop(LinkedList head){
                if (head==null) return -1;
                LinkedList tmp = head;
                int value= head.value;
                head = head.next;
                tmp = null;
                return value;

        }

}
