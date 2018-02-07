import java.util.*;
class MergeSort{
    public static void sort(int[] a, int low, int high){
        int N = high - low;
        if (N <= 1) 
            return; 
        int mid = low + N/2;
        // recursively sort 
        sort(a, low, mid);  
        sort(a, mid, high); 
        // merge two sorted subarrays
        merge(a, low, high, mid);        
    }

        public static void merge(int[] a, int low, int high, int middle){
                int N = high-low;
                int[] temp = new int[N];
                int i = low, j = middle;
                for (int k = 0; k < N; k++){
                        if (i == middle)
                                temp[k] = a[j++];
                        else if (j == high)
                                temp[k] = a[i++];
                        else if (a[j]<a[i])
                                temp[k] = a[j++];
                        else
                                temp[k] = a[i++];
                } 
                for (int k = 0; k < N; k++)
                        a[low + k] = temp[k];
        } 
        public static void main(String...args){
                int[] arr = { 3,6,7,1,2,9,5,2,1,1};
                sort(arr, 0, arr.length);
                System.out.println(Arrays.toString(arr));
        }

}
