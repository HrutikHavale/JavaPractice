package Array;

import java.util.ArrayList;
import java.util.List;

public class MinimumOperations {

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cabc"};
        char x = 'a';
        System.out.println(minimumOperations(words, x));
       // minimumOperations(words,x);
    }

    public static List<Integer> minimumOperations(String[] words, char x) {
        List<Integer> l1= new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words[i].length(); j++) {
//               if (words[i].charAt(j)==x){
//                   l1.add(i);
//                   break;
//               }
//            }
            if (words[i].indexOf(x)!=-1){
                l1.add(i);
            }
        }
        return l1;
    }
}
