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

    public Teacher(String line) {
        super(line);
        String[] s=line.split(",");
        this.chucVu = s[5];
        this.bangCap = s[6];
    }

    @Override
    public String toString() {
       
        return super.toString() + String.format("%-10s%-10s", bangCap, chucVu);
    }

}
