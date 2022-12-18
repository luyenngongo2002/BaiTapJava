import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private static int diemChuanCNTT, diemChuanDTVT, diemChuanDT;

    public static String getStudentInfoAndResults(Student std) {
        return String.format("%s %f, %s, %s, %s",
                std.getHoTen(),
                std.getTongdiem(),
                std.isPassedUniversity(diemChuanCNTT),
                std.isPassedUniversity(diemChuanDTVT),
                std.isPassedUniversity(diemChuanDT));
    }

    public static String hienThi(Student std) {
        return String.format("%s %d, %f", std.getHoTen(), std.getTuoi(), std.diemTB());
    }

    private String hoTen;
    private int tuoi;
    private double diemToan, diemLy, diemHoa;
    private double tongdiem;

    public Student() {
    }

    public Student(String hoTen, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        tongDiem3Mon();
    }

    public void tongDiem3Mon() {
        tongdiem = diemToan + diemLy + diemHoa;
    }

    public double diemTB() {
        return tongdiem / 3;
    }

    public String isPassedUniversity(double diemChuan) {

        return this.tongdiem >= diemChuan ? "Y" : "N";
    }

    @Override
    public String toString() {
        return "hoTen" + this.hoTen + "Tuoi" + this.tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
        tongDiem3Mon();
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
        tongDiem3Mon();
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
        tongDiem3Mon();
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        System.out.println("Nhập số sinh viên:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Sinh viên thứ: " + (i + 1) + ": ");
            sc.nextLine();
            System.out.println("Nhập họ tên sinh viên: ");
            student.setHoTen((sc.nextLine()));
            System.out.println("Nhập tuổi: ");
            student.setTuoi(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập điểm toán: ");
            student.setDiemToan(sc.nextDouble());
            System.out.println("Nhập điểm lý: ");
            student.setDiemLy(sc.nextDouble());
            System.out.println("Nhập điểm hóa: ");
            student.setDiemHoa(sc.nextDouble());
            listStudent.add(student);
        }
        for (var std : listStudent) {
            System.out.println(getStudentInfoAndResults(std));
        }
        for (var std : listStudent) {
            System.out.println(hienThi(std));
        }
        sc.close();
    }
}