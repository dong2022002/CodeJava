public class HinhHoc {
    public int sd1, sd2, sd3;

    public HinhHoc() {

    }

    public HinhHoc(int s1, int s2, int s3) {
        sd1 = s1;
        sd2 = s2;
        sd3 = s3;
    }

    public int phanLoaiTamGiac() {
        int a = sd1, b = sd2, c = sd3;

        if (a + b > c && a + c > b && c + b > a) {
            if (a == b || b == c || c == a) {
                if (a == b && b == c && c == a)
                    return 2;
                else if (a * a + b * b == c * c || a * a + c * c == b * b || a * a == b * b + c * c)
                    return 3;

                else
                    return 1;
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || a * a == b * b + c * c)
                return 4;
        }

        else
            return -1;
        return 5;
    }

    public double tinhDienTichTamGiac() {
        double p = ((double) (sd1 + sd2 + sd3) / 2);
        return ((double) Math.sqrt(p * (p - sd1) * (p - sd2) * (p - sd3)));
    }

    public void XuatKetQuaHinhHoc() {
        int x = phanLoaiTamGiac();
        switch (x) {
            case -1:
                System.out.println("khong phai la ba canh cua tam giac");
                break;
            case 1:
                System.out.println("la tam giac can");
                break;
            case 2:
                System.out.println("la tam giac deu");
                break;
            case 3:
                System.out.println("la tam giac vuonn can");
                break;
            case 4:
                System.out.println("la tam giac vuong");
                break;
            case 5:
                System.out.println("la tam giac thuong");
                break;
        }
        if (x != -1)
            System.out.println("Dien tich cua tam giac:" + Math.floor(tinhDienTichTamGiac() * 100) / 100);

    }

}
