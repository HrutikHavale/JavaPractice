package String;

public class FirstAndLastOccurance {

    public static void main(String[] args) {
        String str ="pomazonaanazzz";
        occurance(str);
    }

    static void occurance(String str){
        int first =-1;
        int last=-1;
        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='a'){
                if (first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.println("first occurrence of a at index "+first);
        System.out.println("last occurrence of a at index "+last);
    }
}
