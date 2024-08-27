package Array;

public class MaxWords {
    public static void main(String[] args) {
        String[] str = {"my name is", "hrutik is my name", "im from karnataka state now in"};
      //  System.out.println(Arrays.toString(a));
       // int[] a =display();
      //  System.out.println(Arrays.toString(display()));
        int res=words(str);
        System.out.println(res);
    }
   static int words(String[] str) {
      int max=0;
       for (int i=0;i<str.length;i++){
           int count=0;
           char[] ch=str[i].toCharArray();
           for (int j=0;j<ch.length;j++){
               if(ch[j]==' '){
                   count++;
               }
               if (count>max){
                   max = count;
               }
           }
       }
       return max+1;
   }

}
