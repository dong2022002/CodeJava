package object;

public class Computer {
    public String hangMT;
    public int ram;
    public int dungLuong;
    public int tocDoXuLy;    
    public double gia;
    public Computer() {
        
    }
    public Computer(String hangMT, int ram,int dungLuong,int tocDoXuLy,double gia) {
        this.hangMT=hangMT;
        this.ram=ram;
        this.dungLuong=dungLuong;
        this.tocDoXuLy=tocDoXuLy;
        this.gia=gia;
    }
    @Override
    public String toString() {
        return "May tinh    :"+hangMT+
               "\nRam         :"+ram+
               "\nDung Luong  :"+dungLuong+
               "\nToc Do Xu Ly:"+tocDoXuLy+
               "\nGia         :"+gia;
    }

}
