import java.util.*;

public class BinarySearch {
    public static int binarysearch(int e, int arr[], int f, int s) {
        int l = s, h = e;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == f)
                return mid;
            else if (arr[mid] < f)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1; 
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enetr the element of the Array: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int f = sc.nextInt();
        int s = 0;
        int x = binarysearch(l - 1, arr, f, s);
        if (x == -1) {
            System.out.println("Element not found: ");
        } else {
            System.out.println("Element found at potion: " + x);
        }
        sc.close();
    }
}