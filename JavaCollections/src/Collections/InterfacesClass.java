package Collections;


interface Bicycle{
    void applybreak(int dec);
    void speedup(double speed);
}
 class Avoncycle implements Bicycle{
    public void applybreak(int dec){
         System.out.println("Apply break");
     }

     @Override
     public void speedup(double speed) {
         System.out.println("Speed");
     }
 }
public class InterfacesClass {

    public static void main(String args[]){

        Avoncycle cycle = new Avoncycle();
        cycle.applybreak(1);
        cycle.speedup(50);

    }
}
