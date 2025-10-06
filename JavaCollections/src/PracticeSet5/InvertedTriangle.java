package PracticeSet5;

public class InvertedTriangle {
    public static void main(String[] args) {
        int n=4;
        //Using for loop
     /* for(int i= n; i>0; i--){  //i= 4,3,2

            for(int j =0; j<i; j++){        //j=0 , 0<4          1st iteration i =4 ****
                System.out.print("*");      //j=1, 1<4                       i=3    ***
                                             //j=2 ,2<4                      i=2    **
                                            //j=3  ,3<4                      i=1    *
            }
            System.out.print("\n");
      } */

        //Using while loop

        int i = n;
        while(i>0){

            for(int j =0; j<i; j++){        //j=0 , 0<4          1st iteration  i =4   ****
                System.out.print("*");          //j=1, 1<4                      i=3    ***
                                                //j=2 ,2<4                      i=2    **
                                                //j=3  ,3<4                     i=1    *
            }

            System.out.print("\n");
            i--;
        }




    }
}
