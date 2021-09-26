package school;

import java.util.ArrayList;
import java.util.List;

import menu.Menu;

public class KhoaCNTT extends Khoa {
    List<QuanLySinhVien> listLopHoc = new ArrayList<>();
    QuanLySinhVien dsSVKhoaCNTT = new QuanLySinhVien();
    QuanLySinhVien dsSinhVien = new QuanLySinhVien();
    Menu menu = new Menu();

    public QuanLySinhVien danhSachSinhVienLopCNTT() {
        dsSinhVien = dsSinhVien.taoDanhSachSinhVienTuFile();
        return dsSVKhoaCNTT = dsSinhVien.dsSVCNTT();
    }

    public KhoaCNTT() {
    }

    public KhoaCNTT(String line) {
        super(line);
    }

    @Override
    public String toString() {
        setTenKhoa("CNTT");
        setThoiGianDaoTao("4 Nam");
        setNgayThanhLap("07/2003");
        return danhSachSinhVienLopCNTT().toString() + super.toString();
    }
}
