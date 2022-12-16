import java.util.Scanner;

public class Helloword {
//import java.util.Scanner;


        public static int nhap()
        {
            Scanner input = new Scanner(System.in);
            boolean check= false;
            int n=0;
            while(!check){
                System.out.print(" ");
                try{
                    n= input.nextInt();
                    check= true;
                }catch(Exception e){
                    System.out.println("Ban phai nhap so! hay nhap lai...");
                    input.nextLine();
                }
            }
            return (n);
        }
        public static int UCLN(int a, int b){

//            phương pháp tìm UCLN băng phep tru-------------------
//            while(a!= b){
//                if(a>b) a= a-b;
//                else b= b-a;
//            }
//            return (a);
//            phương pháp tìm UCLN băng phep chia--------------------

//            while (a*b != 0){
//                if (a > b){
//                    a %= b;
//                }else{
//                    b %= a;
//                }
//            }
//            return a + b;

            int gcd = 1;
            for (int i = 1; i <= a && i <= b; i++) {
                System.out.print(i +";;;;;;;;;;"+a +";;;;;;;;;;;;;"+b );
                System.out.println(" ");
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
        public static void main(String[] args) {
            for (int i = 0; i < 9; i++) {
                System.out.println("Nhap a");
                int a = nhap();
                System.out.println("Nhap b");
                int b= nhap();
                System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
                System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
            }
        }

    }


