//Print The Pattern

/*

    *
   **
  ***
 ****

 */

//Inverted Half Pyramid (Rotated By 180 Deg)


public class Q5 {
    public static void main(String[] args) {
        int m=4;
        //Outer Loop
        for(int i=1;i<=m;i++)
        {
            //Inner Loop For Space Print
            for(int j=1;j<=m-i;j++)
            {
                System.out.print(" ");
            }
            //Inner Loop For Star Print
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
