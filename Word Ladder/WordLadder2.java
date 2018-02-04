class WordLadder2.java{
/*
 LeetCode – Word Ladder II (Java)
 

Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that: 
1) Only one letter can be changed at a time, 
2) Each intermediate word must exist in the dictionary.

For example, given: start = "hit", end = "cog", and dict = ["hot","dot","dog","lot","log"], return:
  [
    ["hit","hot","dot","dog","cog"],
    ["hit","hot","lot","log","cog"]
  ]
  */
 
  public static ArrayList<ArrayList<String>> getPaths(String start, String end, ArrayList<String> dict){
                // bounders
                if (start==null || end==null || start.length()!=end.length()|| dict==null || dict.size()==0) return null;
                if (start.equals(end)) return null;

                ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
                StringBuilder str = new StringBuilder(start);
                for(char ch='a'; ch<='z'; ch++){
                        for(int i = 0; i<start.length(); i++){
                                StringBuilder builder = new StringBuilder(str);
                                builder.setCharAt(i,ch);
                                if (builder.toString().equals(end)) {
                                        ArrayList<String> list = new ArrayList<String>();
                                        list.add(start);
                                        list.add(end);
                                        result.add(list);
                                }
                                if (dict.contains(builder.toString())){
                                        ArrayList<String> list = new ArrayList<String>();
                                        list.add(start);
                                        list.add(builder.toString());
                                        int k = getPaths( builder.toString(), end, dict,list);
                                        if (k==100){
                                                list.add(end);
                                                result.add(list);
                                        }
                                }
                        }
                }
                return result;
        }

        public static int  getPaths(String start, String end, ArrayList<String> dict, ArrayList<String> list){
                StringBuilder str = new StringBuilder(start);
                for(char ch='a'; ch<='z'; ch++){
                        for(int i = 0; i<start.length(); i++){
                                StringBuilder builder = new StringBuilder(str);
                                builder.setCharAt(i,ch);
                                if (builder.toString().equals(end)) return 100;
                                if (dict.contains(builder.toString()) && !list.contains(builder.toString())){
                                        list.add(builder.toString());
                                        //System.out.println(Arrays.toString(list.toArray()));
                                        return getPaths( builder.toString(), end, dict,list);
                                }
                        }
                }
                return 0;
        }

        public static void main(String...arg){
                String[] ar = {"hot","dot","dog","lot","log"};
                ArrayList<String> arr = new ArrayList(Arrays.asList(ar));
                ArrayList<ArrayList<String>> list = getPaths("hit", "cog", arr);
                for(ArrayList<String> ll : list){
                        for(String str: ll){
                                System.out.print(str+",");
                        }
                        System.out.println();
                }

        }

}
