package String;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s="  hello world  ";
       // System.out.println(reverseWords(s));
       // reverseWords(s);
//        System.out.println(reverseWords1(s));
        System.out.println(reverseWords2(s));
    }
    public static String reverseWords(String s) {
      String[] str=s.split(" ");
      String string="";
      for (int i=str.length-1;i>=0;i--){
          string+=str[i];
          if(i!=0){
              string+=" ";
          }
      }
      return string.trim();
    }

    public static String reverseWords1(String s){
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();

        for (char c:s.toCharArray()){
            if (c==' '){
                if(temp.length()>0){
                    words.add(temp.toString());
                    temp=new StringBuilder();
                }
            }
            else {
                temp.append(c);
            }
        }
        if (temp.length()>0){
            words.add(temp.toString());
        }
        for (int i=words.size()-1;i>=0;i--){
            res.append(words.get(i));
            if(i!=0)
                res.append(" ");
        }
        return res.toString();
    }

    public static String reverseWords2(String s) {
        StringBuilder res = new StringBuilder();
        List<String> tempWords = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (!temp.isEmpty()) {  //or temp.length() > 0
                    tempWords.add(temp.toString());
                    temp = new StringBuilder();
                }
            } else {
                temp.append(c);
            }
        }

//        if (!temp.isEmpty()) {
//            tempWords.add(temp.toString());
//        }

        for (int i = tempWords.size() - 1; i > 0; i--) {
            res.append(tempWords.get(i)).append(" ");
        }
        res.append(tempWords.get(0));

        return res.toString();
    }
}
