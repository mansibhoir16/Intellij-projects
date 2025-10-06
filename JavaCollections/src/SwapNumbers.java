public class SwapNumbers {
    public static void main(String[] args) {
        //Swap without temp
        int a =5; int b= 10;  int c =10; int d =5;
        a = a+b;  //5+10=15
        b= a-b; //15-10 =5
        a = a-b; //15-5=10
        System.out.println("a: "+a + " " + "b: "+b);

        c = c-d; //10-5 =5
        d = c + d; // 5+5 =10
        System.out.println("c: "+c + " " + "d: "+d);
    }
}
