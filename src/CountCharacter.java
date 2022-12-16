import java.util.Scanner;

public class CountCharacter {
    public static int DemSoTu(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i)==' '){ // nếu kí tự i là dấu cách
                count+=1;
                System.out.print(s.charAt(i));
            }
        }
        if (s.charAt(0)!= ' '){
            count+=1;
        }
//        System.out.println(count);
        return count;
    }
    public static void main(String []args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi:");
        s=sc.nextLine();
        System.out.println("So ki tu của "+ s + "la "+  DemSoTu(s));

    }


}
