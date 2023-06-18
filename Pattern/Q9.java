//Print The Pattern

/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

//0-1 Triangle


public class Q9 {
    public static void main(String[] args) {
        int m=5;
        //Outer Loop
        for(int i=1;i<=m;i++)
        {
            //Inner Loop
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1"+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
