package object;

public class Person {
    private String hoVaTen;
    private String hoSV;
    private String tenLot;
    private String ten;
    private int tuoi;
    private double height;
    private double weigh;
    private String gioiTinh;

    public String getGioiTinh() {
        return gioiTinh;
    }

    public double getHeight() {
        return height;
    }

    public String getHoSV() {
        return hoSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getTen() {
        return ten;
    }

    public String getTenLot() {
        return tenLot;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHoSV(String hoSV) {
        this.hoSV = hoSV;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTenLot(String tenLot) {
        this.tenLot = tenLot;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public Person() {

    }

    public Person(String hoVaTen, int tuoi, double height, double weigh, String gioiTinh) {
        this.hoVaTen = hoVaTen;
        String[] str = hoVaTen.trim().split(" ");
        this.hoSV = str[0];
        this.tenLot = str[1];
        this.ten = str[2];
        this.tuoi = tuoi;
        this.height = height;
        this.weigh = weigh;
        this.gioiTinh = gioiTinh;
    }

    public Person(String line) {
        String[] s = line.split(",");
        this.hoVaTen = s[0];
        this.tuoi = Integer.parseInt(s[1]);
        this.height = Double.parseDouble(s[2]);
        this.weigh = Double.parseDouble(s[3]);
        this.gioiTinh = s[4];
        String[] str = hoVaTen.trim().split(" ");
        this.hoSV = str[0];
        this.tenLot = str[1];
        this.ten = str[2];
    }

    @Override
    public String toString() {
        String s = String.format("%-20s%-10s%-12s%-12s%-12s", hoVaTen, tuoi, height, weigh, gioiTinh);
        return s;
    }

}
