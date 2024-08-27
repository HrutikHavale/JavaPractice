package String;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharFromStringWithOccurance {

    public static void main(String[] args) {
        String str = "My name is Hrutik kumar";
        duplicateChar(str);
    }

    public static void duplicateChar(String str){

        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();

       for (int i=0;i<ch.length;i++){
           if (ch[i]==' '){
               continue;
           }
       if (hm.containsKey(ch[i])){
                hm.put(ch[i],hm.get(ch[i])+1);
            }
            else {
                hm.put(ch[i],1);
            }
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
