

public class ChuoiKyTu {
    private String[] str;
    private char c;
    private String s;
    Menu menu =new Menu();

    public char getC() {
        return c;
    }

    public String getS() {
        return s;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public ChuoiKyTu(String s) {
        this.s = s;
    }

    public ChuoiKyTu(String[] str, String s) {
        this.str = str;
        c = s.toUpperCase().charAt(0);
    }

    public ChuoiKyTu() {
    }

    public void tachChuoiThanhMang() {
        str = s.split("_");
    }

    public String[] taoMangKyTu(int n) {
        String[] str = new String[n];
        System.out.println("Nhap vao du lieu cua mang theo tung dong:");
        for (int i = 0; i < str.length; i++) {
            str[i] = menu.in.nextLine();
        }
        return str;
    }

    public char nhapVaoMotKyTu() {
        System.out.println("Nhap vao mot ky tu");
        String s = menu.in.next();
        c = s.toUpperCase().charAt(0);
        return c;
    }

    public void timChuCaiTuMotKyTU() {
        System.out.println("Cac chu cai dau tien xuat hien tu ky tu " + c);
        for (String s : str) {
            char t = s.trim().toUpperCase().charAt(0);
            if (t == c)
                System.out.println(s);
        }
    }

    @Override
    public String toString() {
        String s1 = "";
        System.out.println("=================================");
        System.out.println("Mang hien tai:");
        for (String s : str) {
            s1 += s + '\t';
        }
        return s1 + "\n=================================";
    }

}