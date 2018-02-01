import java.util.Arrays;

// Rotate for k steps : Memory O(1) and time O(n) 

class ArrayRotation{
        public static void rotate(int[] arr, int k){
                if (k<=0) throw new IllegalArgumentException();
                if (arr==null || arr.length==0 || arr.length==k) return;
                if (k>arr.length) k=k%(arr.length-1);
                int tmp1=0;
                int tmp2=0;
                int i;
                int start = 0;
                int steps;
                if (k<=(arr.length/2)){
                        i=0;
                        System.out.println("k="+k);
                        steps = k;
                        //right
                        tmp1 = arr[i];
                        while(steps>0){
                                i+=k;
                                System.out.println("i="+i);
                                if (i>=arr.length){
                                        i=i%(arr.length-1)-1;
                                        steps--;
                                }
                                tmp2 = arr[i];
                                arr[i] = tmp1;
                                if(i==start && steps!=0){ i++; start++; tmp2=arr[i];}
                                tmp1 = tmp2;
                        }
                }else{
                        i = arr.length-1;
                        k=arr.length-k;
                        steps = k;
                        //left
                        tmp1 = arr[i];
                        while(steps>0){
                                i-=k;
                                if (i<0){ i=arr.length+i; steps--;}
                                tmp2 = arr[i];
                                arr[i] = tmp1;
                                tmp1 = tmp2;
                        }

                }

        }
        public static void main(String...arg){
                int[] arr = {1,2,3,4,5,6,7,8,9};
                rotate(arr,3);
                System.out.println(Arrays.toString(arr));
                int[] arr1 = {1,2,3,4,5};
                rotate(arr1,4);
                System.out.println(Arrays.toString(arr1));
        }
}        
                                                            
