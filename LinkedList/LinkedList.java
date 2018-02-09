class LinkedList{
  public static LinkedNode insertInFront(LinkedNode head, int value){
                LinkedNode node = new LinkedNode(null, value);
                node.next = head;
                return node;
        }

        public static LinkedNode insertInTail(LinkedNode head, int value){
                LinkedNode node = new LinkedNode(null, value);
                LinkedNode tmp = head;
                while(tmp.next!=null){
                        tmp = tmp.next;
                }
                tmp.next = node;
                return head;

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
                LinkedNode tmp = node.next;
                node=null;
                deleteList(tmp);
        }
public static int pop(LinkedNode head){
                if (head==null) return -1;
                LinkedNode tmp = head;
                int value= head.value;
                head = head.next;
                tmp = null;
                return value;

        }

        public static LinkedNode InsertNth(LinkedNode head, int value, int n){
                if (head==null) return null;
                LinkedNode prev = head;
                LinkedNode tmp = head.next;
                while(n!=0){
                        if (tmp==null) return null;
                        prev = tmp;
                        tmp = tmp.next;
                        n--;
                }
                tmp = new LinkedNode(tmp, value);
                prev.next = tmp;
                return tmp;
        }

        public static LinkedNode deleteDup(LinkedNode head){
                if (head==null || head.next==null) return head;
                LinkedNode tmp = head.next;
                LinkedNode runner = head;
                LinkedNode prev = head;
                while (tmp!=null) {

                        while(runner!=tmp){
                                if (runner.value == tmp.value){
                                        //dup
                                        if (runner!=head)
                                                prev.next = runner.next;
                                        else{
                                                head = head.next;
                                        }
                                        break;
                                }
                                prev = runner;
                                runner = runner.next;
                        }
                        runner = head;
                        tmp = tmp.next;
                }
                return head;

        }

        public static void print(LinkedNode head){
                LinkedNode tmp = head;
                System.out.println("List");
                while(tmp!=null){
                        System.out.println(tmp.value);
                        tmp = tmp.next;
                }
        }
   
   public static boolean checkCircle(LinkedNode head){

                if (head==null || head.next== null) return false;
                LinkedNode runner = head;
                LinkedNode runner2 = head;
                while(runner!=null && runner2 != null){
                        runner = runner.next;
                        if (runner2.next == null) return false;
                        runner2 = runner2.next.next;
                        if (runner == runner2) return true;
                }
                return false;
        }

        public static LinkedNode returnNFromEnd(LinkedNode head, int k){
                LinkedNode runner1 = head;
                LinkedNode runner2 = head;
                int i = k;
                while(runner1!=null && i!=0){
                        runner1 = runner1.next;
                        i--;
                }

                if(runner1==null) return null;
                if (i!=0) return null;

                while(runner1!= null){
                        runner1 = runner1.next;
                        runner2 = runner2.next;
                }
                return runner2;
        }

        public static void main(String...arg){
                LinkedNode n = new LinkedNode(null, 4);
                LinkedNode n1 = new LinkedNode(n,5);
                LinkedNode n2 = new LinkedNode(n1,6);
                LinkedNode n3 = new LinkedNode(n2,7);
                LinkedNode n4 = new LinkedNode(n3,3);
                LinkedNode n5 = new LinkedNode(n4,4);
                LinkedNode n6 = new LinkedNode(n5,5);
                LinkedNode n7 = new LinkedNode(n6,4);
                LinkedNode n8 = new LinkedNode(n7,4);
        //      n.next = n4;
                print(n8);
        //              print(deleteDup(n8));
        //      System.out.println(checkCircle (n8));
                System.out.println("Value="+returnNFromEnd(n8,3).value);

        }



}
