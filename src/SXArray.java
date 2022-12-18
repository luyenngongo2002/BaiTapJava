import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SXArray {
    private static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> nhapMangA() {
        System.out.println("Nhập kích thước của mảng:");
        int n = sc.nextInt();

        var list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = ");
            list.add(sc.nextInt());
        }
        return list;
    }

    public static void sortArrASC(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    var temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void insert(ArrayList<Integer> list, int num) {
        for (var i = 0; i < list.size(); i++) {
            if (num < list.get(i)) {
                list.add(i, num);
                return;
            }
        }
    }
    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList(1,4,7,9,8,6));
        sortArrASC(list);
        System.out.println("Dãy số được sắp xếp tăng dần: " + list);

        System.out.println("Nhap phan tu can chen: ");
        var num = sc.nextInt();
        insert(list, num);
        System.out.println("Dãy số sau khi chen: " + list);
    }
}
