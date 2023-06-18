//Print The Pattern

/*

*
**
***
****

*/

//Half Pyramid

public class Q3 {
    public static void main(String[] args) {
        int m=4;
        //Outer Loop
        for(int i=1;i<=m;i++)
        {
            //Inner Loop
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
