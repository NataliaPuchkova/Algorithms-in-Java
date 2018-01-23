// This example of code shows the situation when if (a==1 && a==2 && a==3) is true in Java
public class ReturnTrue{      
       private volatile int a;

       public void start(){
               new Thread(this::test).start();
               new Thread(this::change).start();
        }

        public void test(){
            while(true) {
                  if (a==1 && a==2 && a==3) System.out.println(“Success”);
               }
        }

        public void change(){
               while(true){
                      for(int i =1; i<4; i++) a=i;
                }
         }

        public static void main(String[] args){
               new ReturnTrue.start();
        }
}
