package object;

public class Person{
    public String hoVaTen;
    public String hoSV;
    public String tenLot;
    public String ten;
    public int tuoi;
    public double height;
    public double weigh;
    public String gioiTinh;
    public Person(){
        
    }
    public Person(String hoVaTen,int tuoi,double height,double weigh,String gioiTinh){
        this.hoVaTen=hoVaTen;
        this.tuoi=tuoi;
        this.height=height;
        this.weigh=weigh;
        this.gioiTinh=gioiTinh;
    }
    public Person(String line){
        String[] s=line.split(",");
        this.hoVaTen=s[0];        
        this.tuoi=Integer.parseInt(s[1]);
        this.height=Double.parseDouble(s[2]);
        this.weigh=Double.parseDouble(s[3]);
        this.gioiTinh=s[4];
        String[] s1=hoVaTen.trim().split(" ");
        this.hoSV=s1[0];
        this.tenLot=s1[1];
        this.ten=s1[2];
    }
    public void xuatThanhTieuDe(){
        System.out.format("%-20s%-10s%-12s%-12s%-10s\n---------------------------------------------------------------\n",
        "Ho va ten","Tuoi","Chieu cao","Can nang","Gioi tinh");
       
    }

    @Override
    public String toString() {       
        String s=String.format("%-20s%-10s%-12s%-12s%-12s",hoVaTen,tuoi,height,weigh,gioiTinh);
        return s;
    }
    
}
