package school;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import menu.Menu;

public class QuanLySinhVien {
    List<Student> dsSinhVien = new ArrayList<>();
    Menu menu = new Menu();

    Boolean kt;

    private void addSV(Student st) {
        dsSinhVien.add(st);
    }

    // sort
    // tang
    public void sapXepDSTangTheoTen() {
        SapXep(EnumSoft.TANGTHEOTEN);
    }

    public void sapXepDSTangTheoHoTen() {
        SapXep(EnumSoft.TANGTHEOHOTEN);
    }

    public void sapXepDSTangTheoTuoi() {
        SapXep(EnumSoft.TANGTHEOTUOI);
    }

    public void sapXepDSTangTheoChieuCao() {
        SapXep(EnumSoft.TANGTHEOCHIEUCAO);
    }

    public void sapXepDSTangTheoCanNang() {
        SapXep(EnumSoft.TANGTHEOCANNANG);
    }

    public void sapXepDSTangTheoTinChi() {
        SapXep(EnumSoft.TANGTHEOTINCHI);
    }

    public void sapXepDSTangTheoNamSinh() {
        SapXep(EnumSoft.TANGTHEONAMSINH);
    }

    // giam
    public void sapXepDSGiamTheoHoTen() {
        SapXep(EnumSoft.GIAMTHEOHOTEN);
    }

    public void sapXepDSGiamTheoTen() {
        SapXep(EnumSoft.GIAMTHEOTEN);
    }

    public void sapXepDSGiamTheoTuoi() {
        SapXep(EnumSoft.GIAMTHEOTUOI);
    }

    public void sapXepDSGiamTheoChieuCao() {
        SapXep(EnumSoft.GIAMTHEOCHIEUCAO);
    }

    public void sapXepDSGiamTheoCanNang() {
        SapXep(EnumSoft.GIAMTHEOCANNANG);
    }

    public void sapXepDSGiamTheoTinChi() {
        SapXep(EnumSoft.GIAMTHEOTINCHI);
    }

    public void sapXepDSGiamTheoNamSinh() {
        SapXep(EnumSoft.GIAMTHEONAMSINH);
    }

    private void SapXep(EnumSoft eMenu) {
        dsSinhVien.sort(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {

                return kieuSapXep(eMenu, o1, o2);
            }

        });
    }

    private int kieuSapXep(EnumSoft eMenu, Student o1, Student o2) {
        switch (eMenu) {
            // tang
            case TANGTHEOTEN:
                return o1.getTen().compareTo(o2.getTen());
            case TANGTHEOHOTEN:
                return o1.getHoSV().compareTo(o2.getHoSV());
            case TANGTHEOTUOI:
                return o1.getTuoi() > o2.getTuoi() ? 1 : -1;
            case TANGTHEOCHIEUCAO:
                return o1.getHeight() > o2.getHeight() ? 1 : -1;
            case TANGTHEOCANNANG:
                return o1.getWeigh() > o2.getWeigh() ? 1 : -1;
            case TANGTHEOTINCHI:
                return o1.getTinChi() > o2.getTinChi() ? 1 : -1;
            case TANGTHEONAMSINH:
                return o1.getNamSinh() > o2.getNamSinh() ? 1 : -1;

            // giam
            case GIAMTHEOTEN:
                return o2.getTen().compareTo(o1.getTen());
            case GIAMTHEOHOTEN:
                return o2.getHoSV().compareTo(o1.getHoSV());
            case GIAMTHEOTUOI:
                return o1.getTuoi() < o2.getTuoi() ? 1 : -1;
            case GIAMTHEOCHIEUCAO:
                return o1.getHeight() < o2.getHeight() ? 1 : -1;
            case GIAMTHEOCANNANG:
                return o1.getWeigh() < o2.getWeigh() ? 1 : -1;
            case GIAMTHEOTINCHI:
                return o1.getTinChi() < o2.getTinChi() ? 1 : -1;
            case GIAMTHEONAMSINH:
                return o1.getNamSinh() < o2.getNamSinh() ? 1 : -1;
        }
        return -1;
    }
    //

    // doc file
    public QuanLySinhVien taoDanhSachSinhVienTuFile() {
        QuanLySinhVien ds = new QuanLySinhVien();
        try {
            FileReader f = new FileReader("D:/Data/DsSinhVien.txt");
            BufferedReader fr = new BufferedReader(f);
            String line = "";
            while ((line = fr.readLine()) != null) {
                ds.addSV(new Student(line));
            }
            fr.close();
        } catch (Exception e) {

            System.out.println("Loi !!!:" + e);
        }
        return ds;
    }

    //
    public void themMotSinhVienBangCachNhapDuLieu() {
        Student st = new Student();
        System.out.print("Nhap vao Ho va Ten:");
        st.setHoVaTen(menu.in.nextLine());
        System.out.print("Nhap vao tuoi sv:");
        st.setTuoi(menu.in.nextInt());
        System.out.print("Nhap vao chieu cao:");
        st.setHeight(menu.in.nextDouble());
        System.out.print("Nhap vao can nang:");
        st.setWeigh(menu.in.nextDouble());
        System.out.print("Nhap vao GioiTinh:");
        st.setGioiTinh(menu.in.next());
        System.out.print("Nhap vao Khoa:");
        st.setKhoa(menu.in.next());
        System.out.print("Nhap vao Tin Chi:");
        st.setTinChi(menu.in.nextInt());
        System.out.print("Nhap vao lop:");
        st.setLop(menu.in.next());
        System.out.print("Nhap vao nam Sinh:");
        st.setNamSinh(menu.in.nextInt());
        addSV(st);
    }

    // Xoa
    private void removeSV(List<Student> st) {
        Boolean kt = dsSinhVien.removeAll(st);
        if (kt == true)
            System.out.println("XOA THANH CONG!!!!!");
        else
            System.out.println("ko co doi tuong trung khop de xoa!!!");

    }

    private void xoaSV(EnumStudent ktst, String s) {
        List<Student> dsXoa = new ArrayList<>();
        dsSinhVien.forEach(st -> {
            if (kiemTraDieuKien(ktst, s, st)) {
                dsXoa.add(st);
            }
        });

        removeSV(dsXoa);

    }

    public void xoaSinhVienTheoTen(String s) {
        System.out.print("Nhap vao noi dung can xoa: ");
        s = menu.in.next();
        xoaSV(EnumStudent.TEN, s);
    }

    public void xoaSinhVienTheoHoTen(String s) {
        s = menu.in.next();
        xoaSV(EnumStudent.HOTEN, s);
    }

    public void xoaSinhVienTheoKhoa(String s) {
        s = menu.in.next();
        xoaSV(EnumStudent.KHOA, s);
    }

    public void xoaSinhVienTheoLop(String s) {
        s = menu.in.next();
        xoaSV(EnumStudent.LOP, s);
    }

    public void xoaSinhVienTheoNamSinh(String s) {
        s = menu.in.next();
        xoaSV(EnumStudent.NAMSINH, s);
    }

    private boolean kiemTraDieuKien(EnumStudent ktst, String s, Student st) {

        switch (ktst) {
            case TEN:
                if (s.compareTo(st.getTen()) == 0)
                    return true;
                break;
            case HOTEN:
                if (s.compareTo(st.getHoSV()) == 0)
                    return true;
                break;
            case KHOA:
                if (s.compareTo(st.getKhoa()) == 0)
                    return true;
                break;
            case LOP:
                if (s.compareTo(st.getLop()) == 0)
                    return true;
                break;
            case NAMSINH:
                int namSinh = Integer.parseInt(s);
                if (namSinh == st.getNamSinh())
                    return true;
                break;
            default:
                break;
        }
        return false;
    }

    private void suaThongTinSV(EnumStudent eStudent) {
        System.out.print("Nhap vao ho va Ten SV can sua: ");
        menu.in = new Scanner(System.in);
        String hoVaTen = menu.in.nextLine();
        kt = true;
        dsSinhVien.forEach(sv -> {
            if (hoVaTen.compareTo(sv.getHoVaTen()) == 0) {
                kieuSua(eStudent, sv);
                kt = false;
            }
        });
        if (kt) {
            System.out.println("Khong tim thay ho va ten tuong ung !!!!!!!!!!!");
        }

    }

    private void kieuSua(EnumStudent eStudent, Student sv) {
        switch (eStudent) {
            case TEN:
                System.out.print("Sua ten: " + sv.getTen() + " lai thanh:");
                String ten = menu.in.next();
                sv.setTen(ten);
                sv.setHoVaTen(sv.getHoSV() + " " + sv.getTenLot() + " " + sv.getTen());
                System.out.println("SUA THANH CONG !!!");
                break;
            case TINCHI:
                System.out.print("Sua tin chi lai thanh :");
                int tinChi = menu.in.nextInt();
                sv.setTinChi(tinChi);
                System.out.println("SUA THANH CONG !!!");
                break;
            case NAMSINH:
                System.out.print("sua nam sinh lai thanh :");
                int namSinh = menu.in.nextInt();
                sv.setNamSinh(namSinh);
                System.out.println("SUA THANH CONG !!!");
            default:
                break;
        }
    }

    public void suaTen() {
        suaThongTinSV(EnumStudent.TEN);
    }

    public void suaTinChi() {
        suaThongTinSV(EnumStudent.TINCHI);
    }

    public void suaNamSinh() {
        suaThongTinSV(EnumStudent.NAMSINH);
    }

    private void timSinhVien(EnumStudent eStudent, String s) {
        QuanLySinhVien dsSV = new QuanLySinhVien();
        dsSinhVien.forEach(sv -> {
            if (kieuTimSinhVien(eStudent, sv, s)) {
                dsSV.addSV(sv);
            }

        });
        System.out.println("Danh sach ket qua :"); 
        System.out.println(dsSV);
    }

    private boolean kieuTimSinhVien(EnumStudent eStudent, Student sv, String s) {
        switch (eStudent) {
            case TEN:
                if (sv.getTen().compareTo(s) == 0) {
                    return true;
                } else {
                    return false;
                }
            case TINCHI:
                int tinChi = Integer.parseInt(s);
                if (sv.getTinChi() == tinChi) {
                    return true;
                } else {
                    return false;
                }
            case NAMSINH:
                int namSinh = Integer.parseInt(s);
                if (sv.getNamSinh() == namSinh) {
                    return true;
                } else {
                    return false;
                }

            default:
                return false;
        }
    }

    public void timSinhVienTheoTen() {
        System.out.print("Nhap vao Ten can tim kiem: ");
        String ten = menu.in.next();
        timSinhVien(EnumStudent.TEN, ten);
    }

    public void timSinhVienTheoTinChi() {
        System.out.print("Nhap vao Tin chi can tim kiem: ");
        String tinChi = menu.in.next();
        timSinhVien(EnumStudent.TINCHI, tinChi);
    }

    public void timSinhVienTheoNamSinh() {
        System.out.print("Nhap vao Nam Sinh can tim kiem: ");
        String namSinh = menu.in.next();
        timSinhVien(EnumStudent.NAMSINH, namSinh);
    }

    @Override
    public String toString() {
        String tieuDe = String.format("%-20s%-10s%-12s%-12s%-12s%-10s%-12s%-10s%-12s\n", "Ho va ten", "Tuoi",
                "Chieu cao", "Can nang", "Gioi tinh", "Khoa", "Tin chi", "lop", "Nam Sinh");
        if (dsSinhVien.isEmpty())
            System.out.println("-----------Danh Sach Trong!!!!!!-----------");
        else
            System.out.println(tieuDe);
        String st = "";
        for (Student s : dsSinhVien) {
            st += s + "\n";
        }
        return st;
    }

}
