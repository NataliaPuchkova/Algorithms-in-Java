import java.util.*;
class Words{

        public static String stringParse(String str, ArrayList<String> list){
                StringBuilder builder = new StringBuilder();
                StringBuilder outputString = new StringBuilder();
                for(int i=0; i<str.length(); i++){
                        builder.append(str.charAt(i));
                        if(list.contains(builder.toString())) {
                                outputString.append(builder).append(" ");
                                builder = new StringBuilder();
                        }
                }
                return outputString.toString().substring(0, outputString.length()-1);
        }

        public static void main(String...args){
                String[] arr = {"What", "can", "I","do", "for", "you", "?"};
                ArrayList<String>list = new ArrayList(Arrays.asList(arr));
                System.out.println(stringParse("WhatcanIdoforyou?", list));
        }


}
