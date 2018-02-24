class Zigzag{

        public static String getZigZag(String str, int k){
                int i=0;
                int r = 0;
                StringBuilder[] arr = new StringBuilder[k];
                while(i<str.length()){
                        if (r>=(k*2-2)) r=r%(k*2-2);
                        if (r<=(k-1)){System.out.println("r="+r+" i="+i+" str.charAt(i)="+str.charAt(i));if (arr[r]==null) arr[r] = new StringBuilder();  arr[r].append(str.charAt(i));}
                        else {
                                int n = r%(k-1);
                                System.out.println("n="+n+" r="+r+" i="+i+" str.charAt(i)="+str.charAt(i));
                                if (arr[k-1-n]==null) arr[k-1-n] = new StringBuilder();
                                arr[k-1-n].append(str.charAt(i));
                        }
                        r++;i++;
                }
                 for(i=0; i<arr.length; i++) System.out.println(arr[i].toString());
                for(i=1; i<arr.length; i++)
                        arr[0].append(arr[i]);
                return arr[0].toString();


        }
        public static void main(String...arg){
                System.out.println("ABCDEFGHIJKLMNOPRST "+getZigZag("ABCDEFGHIJKLMNOPRST", 5));
        }

}
