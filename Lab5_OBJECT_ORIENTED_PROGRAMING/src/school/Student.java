package school;

import object.Person;

public class Student extends Person {
    public String khoa;
    public String school;
    public String nganhHoc;
    public Student() {
        
    }
    public Student(String hoVaTen,int tuoi,double height,double weigh,String gioiTinh,String khoa,String school,String nganhHoc) {
        super(hoVaTen,tuoi,height,weigh,gioiTinh);
        this.khoa=khoa;
        this.school=school;
        this.nganhHoc=nganhHoc;
    }
    @Override
    public String toString() {
        // return "Ho va ten    :"+hoVaTen+
        //      "\nTuoi         :"+tuoi+
        //      "\nChieu cao    :"+height+
        //      "\nCan nang     :"+weigh+
        //      "\nGioi tinh    :"+gioiTinh+
        return super.toString()+
             "\nTruong hoc   :"+school+
             "\nKhoa         :"+khoa+
             "\nNganh        :"+nganhHoc;
    }
}
