
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.FileNotFoundException;

import menu.Menu;
import menu.ThaoTacMenu;
import object.Animal;
import object.Car;
import object.Computer;
import object.Music;
import object.Person;
import object.Plant;
import school.QuanLySinhVien;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        // Goi cac doi tuong
        Menu menu = Menu.THOAT;
        ThaoTacMenu ttMenu = new ThaoTacMenu();
        ThaoTacMenu t = new ThaoTacMenu();
        QuanLySinhVien dsSinhVien = new QuanLySinhVien();
        Animal animal;
        Person person = new Person();
        Car car;
        Computer computer;
        Music music;
        Plant plant;

        while (true) {
            // Menu
            t.XuatDuongKe();
            System.out.println("Nhan 0 de thoat chuong trinh!");
            System.out.println("Nhan 1 de xem thong tin ve nguoi trong file D:/Text/person.txt : ");
            System.out.println("Nhan 2 de xem thong tin ve dong vat trong file D:/Text/person.txt : ");
            System.out.println("Nhan 3 de xem thong tin ve xe hoi trong file D:/Text/car.txt : ");
            System.out.println("Nhan 4 de xem thong tin ve may tinh trong file D:/Text/computer.txt : ");
            System.out.println("Nhan 5 de xem thong tin ve am nhac trong file D:/Text/music.txt : ");
            System.out.println("Nhan 6 de xem thong tin ve thuc vat trong file D:/Text/thucvat.txt : ");
            System.out.println("===============================QUAN LY SINH VIEN===================================");
            System.out.println("Nhan 7 de xem thong tin ve Danh Sach Sinh vien trong file D:/Text/DsSinhVien.txt : ");
            System.out.println("CAC CHUC NANG SAP XEP:");
            System.out.println("SAP XEP TANG:");
            System.out.println("Nhap 8 de Sap xep danh sach sinh vien TANG theo TEN");
            System.out.println("Nhap 9 de Sap xep danh sach sinh vien TANG theo HO TEN");
            System.out.println("Nhap 10 de Sap xep danh sach sinh vien TANG theo TUOI");
            System.out.println("Nhap 11 de Sap xep danh sach sinh vien TANG theo CHIEU CAO");
            System.out.println("Nhap 12 de Sap xep danh sach sinh vien TANG theo CAN NANG");
            System.out.println("Nhap 13 de Sap xep danh sach sinh vien TANG theo TIN CHI");
            System.out.println("Nhap 14 de Sap xep danh sach sinh vien TANG theo NAM SINH");
            System.out.println("GIAM:");
            System.out.println("Nhap 15 de Sap xep danh sach sinh vien GIAM theo TEN");
            System.out.println("Nhap 16 de Sap xep danh sach sinh vien GIAM theo HO TEN");
            System.out.println("Nhap 17 de Sap xep danh sach sinh vien GIAM theo TUOI");
            System.out.println("Nhap 18 de Sap xep danh sach sinh vien GIAM theo CHIEU CAO");
            System.out.println("Nhap 19 de Sap xep danh sach sinh vien GIAM theo CAN NANG");
            System.out.println("Nhap 20 de Sap xep danh sach sinh vien GIAM theo TIN CHI");
            System.out.println("Nhap 21 de Sap xep danh sach sinh vien GIAM theo NAM SINH");
            System.out.println("============================================================");
            System.out.println("Nhap 22 de nhap them vao 1 sv tu ban phim:");
            System.out.println("============================================================");
            System.out.println("======================XOA_SINH_VIEN=========================");
            System.out.println("Nhap 23 de xoa Sinh vien theo ten");
            System.out.println("Nhap 24 de xoa Sinh vien theo Ho ten");
            System.out.println("Nhap 25 de xoa Sinh vien theo Khoa");
            System.out.println("Nhap 26 de xoa Sinh vien theo Lop");
            System.out.println("Nhap 27 de xoa Sinh vien theo Nam Sinh");

            System.out.println();
            // Chon Menu
            t.XuatDuongKe();
            int n = t.chonMenu();
            for (Menu s : Menu.values()) {
                if (s.value == n)
                    menu = s;
            }
            t.XuatDuongKe();

            // Khai bao dung chung
            // Khai bao File
            FileReader fr;
            BufferedReader br;

            // khai bao bien
            String line;
            String s = "";
            //
            switch (menu) {

                case THOAT:
                    return;

                case PERSON:
                    fr = new FileReader("D:/Data/person.txt");
                    br = new BufferedReader(fr);
                    System.out.println("Du lieu trong file D:/Text/person.txt:\n");
                    person.xuatThanhTieuDe();
                    try {
                        while ((line = br.readLine()) != null) {
                            person = new Person(line);
                            System.out.println(person);
                            // ttMenu.XuatDuongKe();
                        }
                    } catch (Exception ex) {
                        System.out.println("Loi doc file: " + ex);
                    }
                    ttMenu.XuatDuongKe();
                    t.tamDung();
                    break;

                case ANIMAL:
                    fr = new FileReader("D:/Data/animal.txt");
                    br = new BufferedReader(fr);
                    System.out.println("Du lieu trong file D:/Data/animal.txt:\n");
                    try {
                        while ((line = br.readLine()) != null) {
                            animal = new Animal(line);
                            System.out.println(animal);
                            ttMenu.XuatDuongKe();
                        }
                    } catch (Exception e) {
                        System.out.println("Loi doc file; " + e);
                    }
                    t.tamDung();
                    break;

                case CAR:
                    fr = new FileReader("D:/Data/car.txt");
                    br = new BufferedReader(fr);
                    System.out.println("Du lieu trong file D:/Data/car.txt:\n");
                    try {
                        while ((line = br.readLine()) != null) {
                            car = new Car(line);
                            System.out.println(car);
                            ttMenu.XuatDuongKe();
                        }
                    } catch (Exception e) {
                        System.out.println("Loi doc file; " + e);
                    }
                    t.tamDung();
                    break;

                case COMPUTER:
                    fr = new FileReader("D:/Data/computer.txt");
                    br = new BufferedReader(fr);
                    System.out.println("Du lieu trong file D:/Data/computer.txt:\n");
                    try {
                        while ((line = br.readLine()) != null) {
                            computer = new Computer(line);
                            System.out.println(computer);
                            ttMenu.XuatDuongKe();
                        }
                    } catch (Exception e) {
                        System.out.println("Loi doc file; " + e);
                    }
                    t.tamDung();
                    break;

                case MUSIC:
                    fr = new FileReader("D:/Data/music.txt");
                    br = new BufferedReader(fr);
                    System.out.println("Du lieu trong file D:/Data/music.txt:\n");
                    try {
                        while ((line = br.readLine()) != null) {
                            music = new Music(line);
                            System.out.println(music);
                            ttMenu.XuatDuongKe();
                        }
                    } catch (Exception e) {
                        System.out.println("Loi doc file; " + e);
                    }
                    t.tamDung();
                    break;

                case PLANT:
                    fr = new FileReader("D:/Data/plant.txt");
                    br = new BufferedReader(fr);
                    System.out.println("Du lieu trong file D:/Data/plant.txt:\n");
                    try {
                        while ((line = br.readLine()) != null) {
                            plant = new Plant(line);
                            System.out.println(plant);
                            ttMenu.XuatDuongKe();
                        }
                    } catch (Exception e) {
                        System.out.println("Loi doc file; " + e);
                    }
                    t.tamDung();
                    break;
                // ==============QUAN_LY_DANH_SACH_SINH_VIEN========================

                case DSSINHVIEN:
                    System.out.println("Du lieu trong file D:/Data/DsSinhVien.txt:\n");
                    dsSinhVien = dsSinhVien.taoDanhSachSinhVienTuFile();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;
                // TANG
                case SOFTTANGTHEOTEN:
                    System.out.println("Sap xep danh sach sinh vien tang theo Ten:");
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoTen();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTTANGTHEOHOTEN:
                    System.out.println("Sap xep danh sach sinh vien tang theo ho Ten:");
                    System.out.println("Danh sach ban dau");

                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoHoTen();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTTANGTHEOTUOI:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoTuoi();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTTANGTHEOCHIEUCAO:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoChieuCao();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTTANGTHEOCANNANG:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoCanNang();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTTANGTHEOTINCHI:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoTinChi();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTTANGTHEONAMSINH:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSTangTheoNamSinh();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                // GIAM
                case SOFTGIAMTHEOTEN:
                    System.out.println("Sap xep danh sach sinh vien giam theo Ten:");
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoTen();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTGIAMTHEOHOTEN:
                    System.out.println("Sap xep danh sach sinh vien giam theo ho Ten:");
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoHoTen();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTGIAMTHEOTUOI:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoTuoi();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTGIAMTHEOCHIEUCAO:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoChieuCao();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTGIAMTHEOCANNANG:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoCanNang();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTGIAMTHEOTINCHI:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoTinChi();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case SOFTGIAMTHEONAMSINH:
                    System.out.println("Danh sach ban dau");
                    System.out.println(dsSinhVien);
                    System.out.println("Danh sach sau khi sap xep:");
                    dsSinhVien.sapXepDSGiamTheoNamSinh();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;
                // ===========================================================
                case ADD1SV:
                    dsSinhVien.themMotSinhVienBangCachNhapDuLieu();
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;
                // XOA

                case XOATEN:
                    System.out.println("Nhap ten can xoa:");
                    dsSinhVien.xoaSinhVienTheoTen(s);
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case XOAHOTEN:
                    System.out.println("Nhap ho ten can xoa:");
                    dsSinhVien.xoaSinhVienTheoHoTen(s);
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case XOAKHOA:
                    System.out.println("Nhap khoa can xoa:");
                    dsSinhVien.xoaSinhVienTheoKhoa(s);
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case XOALOP:
                    System.out.println("Nhap lop can xoa:");
                    dsSinhVien.xoaSinhVienTheoLop(s);
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

                case XOANAMSINH:
                    System.out.println("Nhap Nam Sinh can xoa:");
                    dsSinhVien.xoaSinhVienTheoNamSinh(s);
                    System.out.println(dsSinhVien);
                    t.tamDung();
                    break;

            }

        }

    }
}
