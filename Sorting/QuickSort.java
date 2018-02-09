import java.util.Arrays;
class QuickSort{
// QuickSort
        public static void  sorted(int[] arr, int i, int j){
                if(i>=j) return;
                int p = privot(arr, i, j);
                sorted(arr, i,p-1);
                sorted(arr, p+1, j);
        }

        public static int  privot(int[] a, int low, int high){
                int privot = a[high];
                int k=low-1;
                for(int i=low; i<high; i++){
                        if (a[i]<=privot){
                                int temp = a[++k];
                                a[k] = a[i];
                                a[i] = temp;
                        }
                }
                int temp = a[k+1];
                a[k+1] = a[high];
                a[high] = temp;
                return k+1;
        }
        public static void main(String...arg){
                int[] a = {4,8,9,0,-1,5,2,0};
                sorted(a, 0, a.length-1);
                System.out.println(Arrays.toString(a));
        }
}
