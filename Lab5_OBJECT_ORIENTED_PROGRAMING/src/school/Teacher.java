package school;

import object.Person;

public class Teacher extends Person {
    private String chucVu;
    private String bangCap;

    public String getBangCap() {
        return bangCap;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Teacher() {
    }

    public Teacher(String hoVaTen, int tuoi, double height, double weigh, String gioiTinh, String chucVu,
            String bangCap) {
        super(hoVaTen, tuoi, height, weigh, gioiTinh);
        this.chucVu = chucVu;
        this.bangCap = bangCap;
    }

    @Override
    public String toString() {
        return super.toString() + "\nChuc vu hien tai    :" + chucVu + "\nBang cap            :" + bangCap;
    }

}
