import java.util.ArrayList;
import java.util.Scanner;

public class Computer {
    private String name;
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static void main(String[] args) {
        ArrayList<Computer> listComputer = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số máy tính: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Computer cp = new Computer();
            System.out.println("Máy tính thứ " + (i+1)+ ": ");
            sc.nextLine();

            System.out.print("Name: ");
            String nameCP = sc.nextLine();

            System.out.print("Type (1,2,3): ");
            int typeCP = sc.nextInt();
            while (typeCP < 1 || typeCP > 3 ){
                System.out.println("Lỗi. Nhập lại !");
                typeCP= sc.nextInt();
            }
            cp.setName(nameCP);
            cp.setType(typeCP);
            listComputer.add(cp);

        }
        System.out.println("Thông tin danh sách máy vừa nhập là: ");
        for (int i = 0; i < listComputer.size(); i++) {
            System.out.print("Name:"+listComputer.get(i).getName() + " Type: " + listComputer.get(i).getType()+", ");


        }


    }
}
