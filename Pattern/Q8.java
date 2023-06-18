//Print The Pattern

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

//Floyd's Triangle


public class Q8 {
    public static void main(String[] args) {
        int m=5;
        int number=1;
        //Outer Loop
        for(int i=1;i<=m;i++)
        {
            //Inner Loop
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
