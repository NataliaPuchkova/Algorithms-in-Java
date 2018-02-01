import java.util.*;

class IsomorphicString{
/* DDgg ffkk true
 * Fgfg gghh false
 * fgh fgg false
 * ffggh llmm false
 */
        public static boolean isIsomorphic(String str1, String str2){
                if (str1==null || str2 == null || str1.length()!=str2.length()) return false;
                if (str1.length()==0 && str2.length()==0) return true;
                HashMap<Character, Character> map = new HashMap<Character, Character>();
                for(int i=0; i<str1.length(); i++){
                        char ch1 = str1.charAt(i);
                        char ch2 = str2.charAt(i);
                        if (map.containsKey(ch1)){
                                char ch3 = map.get(ch1);
                                if (ch3!=ch2) return false;
                        } else {
                                if (map.containsValue(ch2)) return false;
                                map.put(ch1, ch2);
                        }
                }
                return true;
        }

        public static void main(String...arg){
                String str1="DDgg";
                String str2 = "ffkk";
                System.out.println(str1+" "+str2+" "+isIsomorphic(str1, str2));
                str1="Fgfg";
                str2 = "gghh";
                System.out.println(str1+" "+str2+" "+isIsomorphic(str1, str2));
                str1="fgh";
                str2 = "fgg";
                System.out.println(str1+" "+str2+" "+isIsomorphic(str1, str2));
                str1="ffggh";
                str2 = "llmm";
                System.out.println(str1+" "+str2+" "+isIsomorphic(str1, str2));
        }

}
