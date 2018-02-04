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
                                        getPaths( builder.toString(), end, dict,list, result);
                                }
                        }
                }
                return result;
        }

        public static void getPaths(String start, String end, ArrayList<String> dict, ArrayList<String> list, ArrayList<ArrayList<String>> result){
                ArrayList<String> list1 = new ArrayList<String>();
                StringBuilder str = new StringBuilder(start);
                for(char ch='a'; ch<='z'; ch++){
                        for(int i = 0; i<start.length(); i++){
                                StringBuilder builder = new StringBuilder(str);
                                builder.setCharAt(i,ch);
                                if (builder.toString().equals(end)){ list.add(end); if (list.contains(end)) result.add(list);}
                                if (dict.contains(builder.toString()) && !list.contains(builder.toString())){
                                        list1 = new ArrayList<String>(list);
                                        list1.add(builder.toString());
                                        getPaths( builder.toString(), end, dict,list1, result);
                                }
                        }
                }
        }

         public static ArrayList<ArrayList<String>> getPaths(ArrayList<ArrayList<String>> list){
                ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
                int size = Integer.MAX_VALUE;
                for(ArrayList<String> itemList: list){
                        if (itemList.size()<size) size = itemList.size();
                }
                for(ArrayList<String> itemList: list){
                        if (itemList.size()==size) result.add(itemList);
                }
                return result;

        }


}
