package object;

public class Computer {
    public String hangMT;
    public int ram;
    public int dungLuong;
    public double tocDoXuLy;    
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
    public Computer(String line) {
        String[] s=line.split(",");
        this.hangMT=s[0];
        this.ram=Integer.parseInt(s[1]);
        this.dungLuong=Integer.parseInt(s[2]);
        this.tocDoXuLy=Double.parseDouble(s[3]);
        this.gia=Double.parseDouble(s[4]);
    }
    @Override
    public String toString() {
        return "May tinh    :"+hangMT+
               "\nRam         :"+ram+
               "\nDung Luong  :"+dungLuong+ "GB"+
               "\nToc Do Xu Ly:"+tocDoXuLy+ "Hz"+
               "\nGia         :"+gia;
    }

}
