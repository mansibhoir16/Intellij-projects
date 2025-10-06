package Collections;



public class MethodOverloading {
    static void tellJoke(){
        System.out.println("I have invented Plagarism..!!");
    }
    static void change(int [] arr){
        arr[0] = 78;
    }

    static void foo(){
        System.out.println("This is a general method");
    }
    static void foo(int a){
        System.out.println("This is a general method with an argument"+a);
    }
    static void foo(int a, int b){
        System.out.println("This is a general method with two argument"+a +" and "+b);
    }
    public static void main(String args[]){
        tellJoke();

        //Changing the array

        int [] marks = {21,33,45,54,65};
        change(marks);
        System.out.println("Index of first element is: "+marks[0]);
        foo();
        foo(200);
        foo(300,600);
    }
}

