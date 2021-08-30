package school;

import object.Person;

public class Student extends Person {
    
    public String khoa;
    public int tinChi;
    public String lop;
    public int namSinh;
    
 
    public Student(){}
    public Student(String hoVaTen,int tuoi,double height,double weigh,String gioiTinh,
    String khoa, int tinChi, String lop, int namSinh) {
        super(hoVaTen, tuoi, height, weigh, gioiTinh);
        this.khoa=khoa;
        this.tinChi=tinChi;
        this.lop=lop;
        this.namSinh=namSinh;
    }
    public Student(String line) {
        super(line);
        String[] s=line.split(",");
        this.khoa=s[5];
        this.tinChi=Integer.parseInt(s[6]);
        this.lop=s[7];
        this.namSinh=Integer.parseInt(s[8]);
    }
    
    @Override
    public String toString() {
        String s=super.toString()+String.format("%-10s%-12s%-10s%-12s",khoa,tinChi,lop,namSinh);
        return s;
    }
}
