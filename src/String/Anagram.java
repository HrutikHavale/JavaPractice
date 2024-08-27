package String;

public class Anagram {

    public static void main(String[] args) {
        String[] str = {"listene","silentq"};
        char[] c1={};
        char[] c2={};
        int count =0;
        for (int i=0;i<str.length;i++){
             c1 = str[i].toCharArray();
            i++;
             c2 = str[i].toCharArray();
        }

        System.out.println(c1);
        System.out.println(c2);

      for (int i=0;i<c1.length;i++){
          for (int j=0;j<c2.length;j++){
              if (c1[i]==c2[j]){
                  break;
              }
              else {
              count++;
              }
          }
      }
//      if(count<=c1.length*(c2.length-1)){
//          System.out.println("anagram");
//      }
//      else {
//          System.out.println("not anagram");
//      }
        System.out.println(count);
    }
}
