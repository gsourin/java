//Print The Pattern

/*

*****
*   *
*   *
*****
 */

//Hollow Rectangle


public class Q2 {
    public static void main(String[] args) {
        int m=4;
        int n=5;

        //Ooter Loop
        for(int i=1;i<=m;i++)
        {
            //Inner Loop
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==m || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
}
