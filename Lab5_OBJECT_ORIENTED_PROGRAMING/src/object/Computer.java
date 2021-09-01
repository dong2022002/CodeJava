package object;

public class Computer {
    private String hangMT;
    private int ram;
    private int dungLuong;
    private double tocDoXuLy;
    private double gia;

    public int getDungLuong() {
        return dungLuong;
    }

    public double getGia() {
        return gia;
    }

    public String getHangMT() {
        return hangMT;
    }

    public int getRam() {
        return ram;
    }

    public double getTocDoXuLy() {
        return tocDoXuLy;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setHangMT(String hangMT) {
        this.hangMT = hangMT;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setTocDoXuLy(double tocDoXuLy) {
        this.tocDoXuLy = tocDoXuLy;
    }

    public Computer() {

    }

    public Computer(String hangMT, int ram, int dungLuong, int tocDoXuLy, double gia) {
        this.hangMT = hangMT;
        this.ram = ram;
        this.dungLuong = dungLuong;
        this.tocDoXuLy = tocDoXuLy;
        this.gia = gia;
    }

    public Computer(String line) {
        String[] s = line.split(",");
        this.hangMT = s[0];
        this.ram = Integer.parseInt(s[1]);
        this.dungLuong = Integer.parseInt(s[2]);
        this.tocDoXuLy = Double.parseDouble(s[3]);
        this.gia = Double.parseDouble(s[4]);
    }

    @Override
    public String toString() {
        return "May tinh    :" + hangMT + "\nRam         :" + ram + "\nDung Luong  :" + dungLuong + "GB"
                + "\nToc Do Xu Ly:" + tocDoXuLy + "Hz" + "\nGia         :" + gia + "\n";
    }

}
