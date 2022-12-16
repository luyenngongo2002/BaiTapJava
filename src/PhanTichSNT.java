import java.util.Scanner;

public class PhanTichSNT {
    public static int Nhap() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại:");
                sc.nextLine();
            }
        }
        return n;
    }

    //---------------------------------------------------------
    public static int TinhTong(int n) {
        int sum = 0;
        int soDu;
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            sum += soDu;
        }
        return sum;
    }

    //---------------------------------------------------


    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = Nhap();
        System.out.print("Tong cac chu so cua "+n+" la: "+TinhTong(n));

    }

}
