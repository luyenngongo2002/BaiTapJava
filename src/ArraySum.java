import java.util.Scanner;

public class ArraySum {
    public static void main (String [] args){
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            sum += a[i];
        }
        System.out.println("Các phan tu trong mang la " + sum);
    }
}
