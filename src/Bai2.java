import java.util.Scanner;

public class Bai2 {
    public static final Scanner sc = new Scanner(System.in);

//--------------------Tính tổng của dãy số nguyên
public static void Cau3(){
        int n, r, s = 0;
        System.out.println("Nhập vào số nguyên dương bất kỳ:");
        n = sc.nextInt();
        while (n>0){
            r = n%10;
            n = n/10;
            s+= r;
        }
        System.out.println("Tong cac chu so:"+ s);
    };
//------------------Tìm số nguyên tố đến n
    public static void Cau4(){
        int n;
        System.out.println("Nhập n:");
        n= sc.nextInt();
        System.out.println("Cac so nguyen to của" + n+"là:");
        for (int i = 0; i < n; i++) {
            if (SoNguyenTo(i)){
                System.out.print(i+",");
            }

        }
    }
//    Hàm tính số nguyên tố
    public static Boolean SoNguyenTo(int n){
        if (n < 2){ //Bé hơn 2(0, 1)
            return false;
        }
        for (int i = 2; i<= n/2; i++){ //Duyệt một nửa
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    //---------------Câu 5 Fibonacci
    public static void Cau5(){
        int n;
        System.out.println("Nhap n:");
        n = sc.nextInt();
        System.out.println("So n la"+SoFibonacci(n));

    }
    public static int SoFibonacci(int n){
        int f0=1;
        int f1=1;
        int fn =2;// fn = f0+f1
        if (n<=1){
            return -1;
        } else if (n==0 || n==1) {
            return 1;
        }else{
            for (int i = 2; i <n ; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0+f1;
            }
        }
        return fn;

    }
//  ---------------Câu 6:
    public static void Cau6(){
        int n;
        System.out.println("Nhap n:");
        n = sc.nextInt();
        System.out.println("US của "+ n +" la"+ CountUocSo(n));
        System.out.println("Số NT "+ n +" la"+ SNTUocSo(n));



        }

//    Đếm các ước số của n
    public static int CountUocSo(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if (n% i==0){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static int SNTUocSo(int n){
        int count =0;
        for (int i = 1; i <= n; i++) {
            if (n% i==0){
                if (SoNguyenTo(i)){
                    System.out.print(i+",");
                }
                count++;
            }
        }
        return count;
    }
    public static void Cau10(){
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        String [] ptu = name.split("\\..", 0);
        if (ptu.length == 3) {
            System.out.println("Ten la: " + ptu[2] + "..." + ptu[0] + "..." + ptu[1]);
        } else if (ptu.length == 2) {
            System.out.println("Ten la: " + ptu[1] + "..." + ptu[0]);
        }
    }
}

