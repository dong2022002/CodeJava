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
    @Override
    public String toString() {
        return "Ho va Ten :"+hoVaTen+
               "\nTuoi      :"+tuoi+
               "\nChieu cao :"+height+
               "\nCan nang  :"+weigh+
               "\nGioi tinh :"+gioiTinh;
        
    }
    
}
