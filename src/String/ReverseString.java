package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "My name is Hrutik kumar";
        reverseStringMethod(str);
    }

    public static void reverseStringMethod(String str){
//        for (int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }

//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse());

        char[] ch =str.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
      }

    }
}
