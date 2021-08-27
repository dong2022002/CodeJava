package object;

public class Person{
    public String hoVaTen;
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
    }
    @Override
    public String toString() {
        return "Ho va Ten :"+hoVaTen+
               "\nTuoi      :"+tuoi+
               "\nChieu cao :"+height+
               "\nCan nang  :"+weigh+
               "\nGioi tinh :"+gioiTinh;
        
    }
    
}
