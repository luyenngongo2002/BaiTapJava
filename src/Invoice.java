

/**
 * Created by nththuy on 7/10/18.
 */
public class Invoice {
    private String maSoHoaDon;
    private int soTien;

    public String getMaSoHoaDon() {
        return maSoHoaDon;
    }

    public void setMaSoHoaDon(String maSoHoaDon) {
        this.maSoHoaDon = maSoHoaDon;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public void inHoaDon() {
        System.out.println(this.maSoHoaDon + "\t" + this.soTien);
    }

    @Override
    public String toString() {
        return "invoice{" +
                "maSoHoaDon='" + maSoHoaDon + '\'' +
                ", soTien=" + soTien +
                '}';
    }
}
