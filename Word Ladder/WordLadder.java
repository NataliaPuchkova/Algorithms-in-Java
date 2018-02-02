import java.util.*;
/*
Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that only one letter can be changed at a time and each intermediate word must exist in the dictionary. For example, given:

start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]
One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5.
*/
class WordLadder{

        static HashSet<String> set = new HashSet<String>();

        public static int getDepth(String start, String end, ArrayList<String> list, int i){
                if(start.length()!=end.length()) return 0;
                set.add(start.toLowerCase());
                int count = getDepth(start, end, list);
                if (count!=0) return count+1; else return 0;
        }
        public static int getDepth(String str, String end,  ArrayList<String> list){

                int count=str.length();
                for(char ch='a'; ch<='z'; ch++){
                    for(int i=0; i<str.length(); i++){
                                String tmp = setCharAtIndex(str, ch, i);
                                if (tmp.equals(end)) return 1;
                                if (list.contains(tmp) && ! set.contains(tmp)) {
                                  set.add(tmp); 
                                  System.out.println(tmp);  
                                  return 1+getDepth(tmp, end, list);
                                 }
                     }
                }
                return 0;
        }

        public static  String setCharAtIndex(String str, char ch, int index){
                StringBuilder tmp = new StringBuilder(str.toLowerCase());
                tmp.setCharAt(index, ch);
                return tmp.toString();
        }

        public static void main(String...args){

                String[] array = {"hot","dot","dog","lot","log"};
                ArrayList<String>list1 = new ArrayList(Arrays.asList(array));
                String start = "hit";
                String end = "cog";
                System.out.println(getDepth(start, end, list1, 1));

        }


}
