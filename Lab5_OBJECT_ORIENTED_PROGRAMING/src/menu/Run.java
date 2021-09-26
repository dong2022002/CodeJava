package menu;

import java.io.BufferedReader;
import java.io.FileReader;

import object.Animal;
import object.Car;
import object.Computer;
import object.Music;
import object.Person;
import object.Plant;
import school.KhoaCNTT;
import school.QuanLyGiangVien;
import school.QuanLySinhVien;

public class Run {
    Menu menu = new Menu();
    Person person = new Person();
    Animal animal = new Animal();
    Car car = new Car();
    Computer computer = new Computer();
    Music music = new Music();
    Plant plant = new Plant();
    QuanLySinhVien dsSinhVien = new QuanLySinhVien();
    QuanLyGiangVien dsGiangVien = new QuanLyGiangVien();
    KhoaCNTT khoaCNTT=new KhoaCNTT();

    private String line = "";

    private String duongDanFile(EnumMenu eMenu) {
        String file = "";
        switch (eMenu) {
            case PERSON:
                file = "D:/Data/person.txt";
                break;
            case ANIMAL:
                file = "D:/Data/animal.txt";
                break;
            case CAR:
                file = "D:/Data/car.txt";
                break;
            case COMPUTER:
                file = "D:/Data/computer.txt";
                break;
            case MUSIC:
                file = "D:/Data/music.txt";
                break;
            case PLANT:
                file = "D:/Data/plant.txt";
                break;

            default:
                break;
        }
        return file;
    }

    private void object(EnumMenu eMenu, String line) {
        switch (eMenu) {
            case PERSON:
                person = new Person(line);
                System.out.println(person);
                break;
            case ANIMAL:
                animal = new Animal(line);
                System.out.println(animal);
                break;
            case CAR:
                car = new Car(line);
                System.out.println(car);
                break;
            case COMPUTER:
                computer = new Computer(line);
                System.out.println(computer);
                break;
            case MUSIC:
                music = new Music(line);
                System.out.println(music);
                break;
            case PLANT:
                plant = new Plant(line);
                System.out.println(plant);
                break;

            default:
                break;
        }
    }

    private void runObject(EnumMenu eMenu) {
        try {
            FileReader fr = new FileReader(duongDanFile(eMenu));
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                object(eMenu, line);
            }
        } catch (Exception e) {
            System.out.println("Loi doc file: " + e);
        }
        menu.pause();
    }

    public void runPerson() {
        runObject(EnumMenu.PERSON);
    }

    public void runAnimal() {
        runObject(EnumMenu.ANIMAL);
    }

    public void runCar() {
        runObject(EnumMenu.CAR);
    }

    public void runComputer() {
        runObject(EnumMenu.COMPUTER);
    }

    public void runMusic() {
        runObject(EnumMenu.MUSIC);
    }

    public void runPlant() {
        runObject(EnumMenu.PLANT);
    }

    // ==============QUAN_LY_DANH_SACH_SINH_VIEN========================
    public void runDSSinhVien() {
        System.out.println("Du lieu trong file D:/Data/DsSinhVien.txt:\n");
        dsSinhVien = dsSinhVien.taoDanhSachSinhVienTuFile();
        System.out.println(dsSinhVien);
        menu.pause();
    }

    public void runDSSV() {
        System.out.println("==== Danh sach hien tai ====");
        System.out.println(dsSinhVien);
        menu.pause();
    }

    private void runSoft(EnumMenu eMenu) {
        System.out.println("Danh sach ban dau");
        System.out.println(dsSinhVien);
        System.out.println("Danh sach sau khi sap xep:");
        objectSoft(eMenu);
        System.out.println(dsSinhVien);
        menu.pause();
    }

    private void objectSoft(EnumMenu eMenu) {
        switch (eMenu) {
            // TANG
            case SOFTTANGTHEOTEN:
                System.out.println("=== Tang theo ten ===");
                dsSinhVien.sapXepDSTangTheoTen();
                break;
            case SOFTTANGTHEOHOTEN:
                System.out.println("=== Tang theo Ho ten ===");
                dsSinhVien.sapXepDSTangTheoHoTen();
                break;
            case SOFTTANGTHEOCHIEUCAO:
                System.out.println("=== Tang theo chieu cao ===");
                dsSinhVien.sapXepDSTangTheoChieuCao();
                break;
            case SOFTTANGTHEOCANNANG:
                System.out.println("=== Tang theo can nang ===");
                dsSinhVien.sapXepDSTangTheoCanNang();
                break;
            case SOFTTANGTHEONAMSINH:
                System.out.println("=== Tang theo Nam Sinh ===");
                dsSinhVien.sapXepDSTangTheoNamSinh();
                break;
            case SOFTTANGTHEOTINCHI:
                System.out.println("=== Tang theo tin chi ===");
                dsSinhVien.sapXepDSTangTheoTinChi();
                break;
            case SOFTTANGTHEOTUOI:
                System.out.println("=== Tang theo Tuoi ===");
                dsSinhVien.sapXepDSTangTheoTuoi();
                break;
            // GIAM
            case SOFTGIAMTHEOTEN:
                System.out.println("=== Giam theo ten ===");
                dsSinhVien.sapXepDSGiamTheoTen();
                break;
            case SOFTGIAMTHEOHOTEN:
                System.out.println("=== Giam theo Ho ten ===");
                dsSinhVien.sapXepDSGiamTheoHoTen();
                break;
            case SOFTGIAMTHEOCHIEUCAO:
                System.out.println("=== Giam theo chieu cao ===");
                dsSinhVien.sapXepDSGiamTheoChieuCao();
                break;
            case SOFTGIAMTHEOCANNANG:
                System.out.println("=== Giam theo can nang ===");
                dsSinhVien.sapXepDSGiamTheoCanNang();
                break;
            case SOFTGIAMTHEONAMSINH:
                System.out.println("=== Giam theo Nam Sinh ===");
                dsSinhVien.sapXepDSGiamTheoNamSinh();
                break;
            case SOFTGIAMTHEOTINCHI:
                System.out.println("=== Giam theo tin chi ===");
                dsSinhVien.sapXepDSGiamTheoTinChi();
                break;
            case SOFTGIAMTHEOTUOI:
                System.out.println("=== Giam theo Tuoi ===");
                dsSinhVien.sapXepDSGiamTheoTuoi();
                break;

            default:
                break;
        }
    }
    // Tang

    public void runSapXepTangTheoTen() {
        runSoft(EnumMenu.SOFTTANGTHEOTEN);
    }

    public void runSapXepTangTheoHoTen() {
        runSoft(EnumMenu.SOFTTANGTHEOHOTEN);
    }

    public void runSapXepTangTheoTuoi() {
        runSoft(EnumMenu.SOFTTANGTHEOTUOI);
    }

    public void runSapXepTangTheoTinChi() {
        runSoft(EnumMenu.SOFTTANGTHEOTINCHI);
    }

    public void runSapXepTangTheoChieuCao() {
        runSoft(EnumMenu.SOFTTANGTHEOCHIEUCAO);
    }

    public void runSapXepTangTheoCanNang() {
        runSoft(EnumMenu.SOFTTANGTHEOCANNANG);
    }

    public void runSapXepTangTheoNamSinh() {
        runSoft(EnumMenu.SOFTTANGTHEONAMSINH);
    }
    // Giam

    public void runSapXepGiamTheoTen() {
        runSoft(EnumMenu.SOFTGIAMTHEOTEN);
    }

    public void runSapXepGiamTheoHoTen() {
        runSoft(EnumMenu.SOFTGIAMTHEOHOTEN);
    }

    public void runSapXepGiamTheoTuoi() {
        runSoft(EnumMenu.SOFTGIAMTHEOTUOI);
    }

    public void runSapXepGiamTheoTinChi() {
        runSoft(EnumMenu.SOFTGIAMTHEOTINCHI);
    }

    public void runSapXepGiamTheoChieuCao() {
        runSoft(EnumMenu.SOFTGIAMTHEOCHIEUCAO);
    }

    public void runSapXepGiamTheoCanNang() {
        runSoft(EnumMenu.SOFTGIAMTHEOCANNANG);
    }

    public void runSapXepGiamTheoNamSinh() {
        runSoft(EnumMenu.SOFTGIAMTHEONAMSINH);
    }

    public void runAdd1SV() {
        dsSinhVien.themMotSinhVienBangCachNhapDuLieu();
        System.out.println(dsSinhVien);
        menu.pause();
    }

    private void XoaSV(EnumMenu eMenu) {
        System.out.println("Danh sach hien tai:\n" + dsSinhVien);
        objectDelete(eMenu);
        menu.pause();
    }

    private void objectDelete(EnumMenu eMenu) {
        String s = "";
        switch (eMenu) {
            case XOATEN:
                System.out.println("=== Xoa theo ten ===");
                dsSinhVien.xoaSinhVienTheoTen(s);
                System.out.println(dsSinhVien);
                break;
            case XOAHOTEN:
                System.out.println("=== Xoa theo Ho ten ===");
                dsSinhVien.xoaSinhVienTheoHoTen(s);
                System.out.println(dsSinhVien);
                break;
            case XOALOP:
                System.out.println("=== Xoa theo Lop ===");
                dsSinhVien.xoaSinhVienTheoLop(s);
                System.out.println(dsSinhVien);
                break;
            case XOAKHOA:
                System.out.println("=== Xoa theo Khoa ===");
                dsSinhVien.xoaSinhVienTheoKhoa(s);
                System.out.println(dsSinhVien);
                break;
            case XOANAMSINH:
                System.out.println("=== Xoa theo Nam Sinh ===");
                dsSinhVien.xoaSinhVienTheoNamSinh(s);
                System.out.println(dsSinhVien);
                break;

            default:
                break;
        }
    }

    public void runXoaSVtheoTen() {
        XoaSV(EnumMenu.XOATEN);
    }

    public void runXoaSVtheoHoTen() {
        XoaSV(EnumMenu.XOAHOTEN);
    }

    public void runXoaSVtheoLop() {
        XoaSV(EnumMenu.XOALOP);
    }

    public void runXoaSVtheoKhoa() {
        XoaSV(EnumMenu.XOAKHOA);
    }

    public void runXoaSVtheoNamSinh() {
        XoaSV(EnumMenu.XOANAMSINH);
    }

    private void runSuaSVtheoHoVaTen(EnumMenu eMenu) {
        System.out.println("Danh sach ban dau :");
        System.out.println(dsSinhVien);
        kieuSua(eMenu);
        System.out.println("Danh sach KET QUA:");
        System.out.println(dsSinhVien);
        menu.pause();
    }

    private void kieuSua(EnumMenu eMenu) {
        switch (eMenu) {
            case SUATEN:
                dsSinhVien.suaTen();
                break;
            case SUATINCHI:
                dsSinhVien.suaTinChi();
                break;
            case SUANAMSINH:
                dsSinhVien.suaNamSinh();
                break;

            default:
                break;
        }
    }

    public void runSuaTen() {
        runSuaSVtheoHoVaTen(EnumMenu.SUATEN);
    }

    public void runSuaTinChi() {
        runSuaSVtheoHoVaTen(EnumMenu.SUATINCHI);
    }

    public void runSuaNamSinh() {
        runSuaSVtheoHoVaTen(EnumMenu.SUANAMSINH);
    }

    private void runTimSV(EnumMenu eMenu) {
        System.out.println("Danh sach hien tai:");
        System.out.println(dsSinhVien);
        kieuTimSV(eMenu);
        menu.pause();
    }

    private void kieuTimSV(EnumMenu eMenu) {
        switch (eMenu) {
            case TIMTEN:
                dsSinhVien.timSinhVienTheoTen();
                break;
            case TIMTINCHI:
                dsSinhVien.timSinhVienTheoTinChi();
                break;
            case TIMNAMSINH:
                dsSinhVien.timSinhVienTheoNamSinh();
                break;

            default:
                break;
        }
    }

    public void runTimTen() {
        runTimSV(EnumMenu.TIMTEN);
    }

    public void runTimTinChi() {
        runTimSV(EnumMenu.TIMTINCHI);
    }

    public void runTimNamSinh() {
        runTimSV(EnumMenu.TIMNAMSINH);
    }

    public void runDSGiangVien() {
        System.out.println("Du lieu trong file D:/Data/DsGiangVien.txt:\n");
        dsGiangVien = dsGiangVien.taoDanhSachGiangVienTuFile();
        System.out.println(dsGiangVien);
        menu.pause();
    }

    public void runDSSVCNTT(){
        System.out.println(khoaCNTT);
        menu.pause();
    }

}
