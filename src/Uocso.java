import java.util.Scanner;

public class Uocso {
    public static int Nhap() {
        Scanner sc = new Scanner(System.in);
        boolean check= false;
        int n = 0;
        while (!check){
            System.out.print("");
            try {
                n = sc.nextInt();
                check = true;
            }catch (Exception e){//bắt được lỗi
                System.out.print("Bạn phải nhập só, vui lòng nhap lai:");
                sc.nextLine();
            }
        }
        return (n);
    }

    public static boolean CheckSNT(int n) {
        if (n == 2) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void LietkeUS(int n) {
        int count = 0;
        System.out.print("Cac uoc cua "+n+" la:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
                count++;
            }
        }
        System.out.print("\nSố US của " + n + " là: " + count);
    }

    public static void LietkeUSNT(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (CheckSNT(i)){
                    System.out.print(i);
                }
                count++;
            }
        }
         System.out.println("\nCo "+count+" uoc la so nguyen to");
    }

    public static void main(String[] args) {
        System.out.print("Nhập số n: ");
        int n = Nhap();
        LietkeUS(n);
        LietkeUSNT(n);

        }
}
