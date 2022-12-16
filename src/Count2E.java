import java.util.Arrays;
import java.util.Scanner;


class Couter {
    int number;
    int times;
}
public class Count2E {
    public static void main(String[] args) {
        System.out.println("Nhập số phần từ của mảng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số  phần tử thứ " + (i + 1) + ": ");
            System.out.println();
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));

         // xử lý
        int newArr[] = new int[n/2];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count+=1;
                }
            }
            if (count == 2) {
                newArr[index] = arr[i];
                index += 1;

            }

        }
        System.out.println(Arrays.toString(newArr));
        System.out.println("các số lặp lại 2 lần là: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+"  ;  ");
        }

    }
    }



