package school;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuanLyGiangVien {
    List<Teacher> listGiangVien = new ArrayList<>();

    public QuanLyGiangVien taoDanhSachGiangVienTuFile() {
        QuanLyGiangVien ds = new QuanLyGiangVien();
        try {
            FileReader f = new FileReader("D:/Data/DsGiangVien.txt");
            BufferedReader fr = new BufferedReader(f);
            String line = "";
            while ((line = fr.readLine()) != null) {
                ds.addGV(new Teacher(line));
            }
            fr.close();
        } catch (Exception e) {

            System.out.println("Loi !!!:" + e);
        }
        return ds;
    }

    private void addGV(Teacher teacher) {
        listGiangVien.add(teacher);
    }

    @Override
    public String toString() {
        String tieuDe = String.format("%-20s%-10s%-12s%-12s%-12s%-10s%-10s", "Ho va ten", "Tuoi", "Chieu cao",
                "Can nang", "Gioi tinh", "Bang cap", "Chuc vu");
        if (listGiangVien.isEmpty()) {
            System.out.println("-----------Danh Sach Trong!!!!!!-----------");
        } else {
            System.out.println(tieuDe);
        }
        String st = "";
        for (Teacher s : listGiangVien) {
            st += s + "\n";
        }
        return st;
    }
}
