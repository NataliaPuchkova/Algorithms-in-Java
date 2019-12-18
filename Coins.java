import java.util.*;

public class Coins{

        public static void main(String...arg){
                Integer[] arr = {1,2,15,20};
                int[] count = {35};

                Arrays.sort(arr, Collections.reverseOrder());
                Arrays.stream(arr).forEach(x->{
                        if (x!= null && count[0]!=0 && x>0) {
                        System.out.println("Denominator:"+x+" qnty:"+count[0]/x);
                        count[0] = count[0]%x;
                        }
                });
        }

}
