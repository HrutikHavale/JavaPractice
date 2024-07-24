public class SwapNumbers {

    public static void main(String[] args) {
        int x =555;
        int y =888;
        swapNum(x,y);
    }

    static void swapNum( int x, int y){
        x = x+y;
        y =x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);
    }
}
