class ReverseWords{
/*Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

The input string does not contain leading or trailing spaces and the words are always separated by a single space.
For example,
Given s = "the sky is blue",
return "blue is sky the".
*/
        public static String reverse(String str){
                String[] tmp = str.split(" ");
                StringBuilder builder = new StringBuilder();
                for(int i=tmp.length-1; i>=0; i--){
                        builder.append(tmp[i]).append(" ");
                }

                return builder.toString().substring(0,builder.length());
        }

        public static String reverseMinimumMemory(String input){
                StringBuilder str = new StringBuilder(input);
                int k = input.length();
                reverseSubString(str, 0, k-1);
                k=0;
                char prev = str.charAt(0);
                for (int i=1; i<input.length(); i++){
                    if (str.charAt(i)==' ' && str.charAt(i)!=prev){
                                        reverseSubString(str, k, i-1);

                                }else if (str.charAt(i)!=' ' && prev==' '){
                                                k = i;
                                         }
                                prev = str.charAt(i);
                }
                if (str.charAt(input.length()-1)!=' ' && k!=0 ) reverseSubString(str, k, input.length()-1);
                return str.toString();

        }

        public static void reverseSubString(StringBuilder str, int start, int end){
                for (int i=start, j=0; i<=(end+start)/2; i++, j++){
                        reverseChar(str, i, end-j);
                }
        }

        public static void reverseChar(StringBuilder str, int index, int end){
                if (index==end) return;
                char ch1 = str.charAt(index);
                char ch2 = str.charAt(end);
                insertCharIntoStrinBuilder(str, index, ch2);
                insertCharIntoStrinBuilder(str, end, ch1);
        }

        public static void insertCharIntoStrinBuilder(StringBuilder str, int index, char ch){
                str.setCharAt(index, ch);
        }

        public static void main(String...args){
                System.out.println(reverse("What can I do for you?"));
                System.out.println(reverseMinimumMemory("What can I do for you?"));
        }
}
