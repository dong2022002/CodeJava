package school;

import object.Person;

public class Teacher extends Person{
    public String chucVu;
    public String bangCap;
    public Teacher() {}
    public Teacher(String hoVaTen,int tuoi,double height,double weigh,String gioiTinh,String chucVu,String bangCap) {
        super(hoVaTen,tuoi,height,weigh,gioiTinh);
        this.chucVu=chucVu;
        this.bangCap=bangCap;
    }
    @Override
    public String toString() {
        return super.toString()+
        "\nChuc vu hien tai    :"+chucVu+
        "\nBang cap            :"+bangCap;
    }
    
}
