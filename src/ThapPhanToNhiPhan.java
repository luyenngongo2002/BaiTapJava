import java.lang.reflect.Array;
import java.util.Arrays;

public class ThapPhanToNhiPhan {

    public  void   ThapToNhi(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index] = num%2;//15
            num = num/2;//7
            index +=1;
        }
        for (int i = index-1; i>=0;i--) { //duyệt từng phần tử trong mảng từ dưới lên
            System.out.print(binary[i]);
        }
    }
    public static void main(String[] args) {
        ThapPhanToNhiPhan objec = new ThapPhanToNhiPhan();
        System.out.println("Giá trị nhị phân của 245 là: ");
        objec.ThapToNhi(245);

    }
}
