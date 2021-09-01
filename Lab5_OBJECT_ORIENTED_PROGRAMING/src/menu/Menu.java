package menu;

import java.util.Scanner;

public class Menu {
    public Scanner in = new Scanner(System.in);

    protected void pause() {
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

    public void dsMenu() {
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
        System.out.println("======================DANH SACH SINH VIEN ===================");

        System.out.println("Nhap 28 de xem danh sach sinh vien hien tai");

        System.out.println("============================================================");
        System.out.print("Chon mot chuc nang:");
    }

}
