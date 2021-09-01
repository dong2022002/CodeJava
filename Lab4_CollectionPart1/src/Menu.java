import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);

    public void xuatMenu() {
        System.out.println("=========================================");
        System.out.println("Nhan 0 de thoat chuong trinh");
        System.out.println("Nhan 1 de Giai mot so bai toan");
        System.out.println("Nhan 2 de giai Hinh hoc");
        System.out.println("Nhan 3 de chuyen mot so thanh tien te");
        System.out.println("Nhan 4 de thao tac voi chuoi");
        System.out.println("Nhan 5 de tach chuoi thanh mang");
        System.out.println("Nhan 6 de tao mot HashMap<String,String> roi xuat ra cau truc Json");
        System.out.println("=========================================");
        System.out.print("Chon chuc nang:");
    }

    private void pause() {
        System.out.println("----------------------------------------------");
        System.out.println("\nNhan ky tu bat ky roi nhan ENTER de tiep tuc");
        in.next();
    }

    public EnumMenu chonMenu() {

        int chon = in.nextInt();
        EnumMenu enumMenu = EnumMenu.THOAT;
        for (EnumMenu e : EnumMenu.values()) {
            if (chon == e.value) {
                enumMenu = e;
            }
        }
        return enumMenu;
    }

    public void runToanSo() {
        System.out.print("Nhap vao mot so N=");
        int n = in.nextInt();
        ToanSo toan = new ToanSo(n);
        System.out.println(toan);
        pause();
    }

    public void runHinhHoc() {
        System.out.println("Nhap vao 3 so nguyen duong lien tiep de xac dinh loai tam giac");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        HinhHoc hh = new HinhHoc(x1, x2, x3);
        hh.XuatKetQuaHinhHoc();
        pause();
    }

    public void runCurrency() {
        System.out.println("Nhap vao mot so");
        double currency = in.nextDouble();
        Currency number = new Currency(currency);
        number.chuyenDoi();
        System.out.println(number);
        pause();
    }

    public void runListString() {
        System.out.print("Nhap do dai cua Mang n=");
        int n = in.nextInt();
        ChuoiKyTu chuoi = new ChuoiKyTu();
        chuoi.setStr(chuoi.taoMangKyTu(n));
        chuoi.setC(chuoi.nhapVaoMotKyTu());
        System.out.println(chuoi);
        chuoi.timChuCaiTuMotKyTU();
        pause();
    }

    public void runTachChuoiThanhMang() {
        System.out.println("Chuyen Chuoi 'Hello_I_am_Iron_Man!' Thanh mang nhu sau: ");
        ChuoiKyTu chuoi = new ChuoiKyTu("Hello_I_am_Iron_Man!");
        chuoi.tachChuoiThanhMang();
        System.out.println(chuoi);

        System.out.println("Chuyen mot chuoi thanh mot mang bang dau '_' ");
        System.out.println("Nhap vao mot chuoi");
        String a = in.next();
        chuoi = new ChuoiKyTu(a);
        chuoi.tachChuoiThanhMang();
        System.out.println(chuoi);
        pause();
    }

    public void runHashMapJson() {
        System.out.print("So cap du lieu muon nhap n=");
        int n = in.nextInt();
        System.out.println("Nhap key va value theo thu tu");
        HashMapJson hashMap = new HashMapJson();
        for (int i = 0; i < n; i++) {
            System.out.print("key=");
            String key = in.next();
            System.out.print("value=");
            String value = in.next();
            hashMap.add(key, value);
        }
        System.out.println(hashMap);
        pause();
    }

}
