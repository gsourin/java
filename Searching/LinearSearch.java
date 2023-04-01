import java.util.*;

public class LinearSearch {
    public static int searching(int l, int arr[], int f) {
        for (int i = 0; i < l; i++) {
            if (arr[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find out: ");
        int f = sc.nextInt();
        int x = searching(l, arr, f);
        {
            if (x == -1) {
                System.out.println("Element not found: ");
            } else {
                System.out.println("Element found at potion: " + x);
            }
        }
        sc.close();
    }
}