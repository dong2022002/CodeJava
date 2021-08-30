package school;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class QuanLySinhVien{
    List<Student> dsSinhVien=new ArrayList<>();
    //
    EnumSoft kt;
    EnumStudent ktst;
    public Scanner in=new Scanner(System.in);
    //
    public void addSV(Student st){
        dsSinhVien.add(st);        
    }
   
    //sort
    //tang
    public void sapXepDSTangTheoTen(){
        SapXep(EnumSoft.TANGTHEOTEN);
    }    
    public void sapXepDSTangTheoHoTen(){
        SapXep(EnumSoft.TANGTHEOHOTEN);
    }
    public void sapXepDSTangTheoTuoi(){
        SapXep(EnumSoft.TANGTHEOTUOI);
    }   
    public void sapXepDSTangTheoChieuCao(){
        SapXep(EnumSoft.TANGTHEOCHIEUCAO);
    }   
    public void sapXepDSTangTheoCanNang(){
        SapXep(EnumSoft.TANGTHEOCANNANG);
    }   
    public void sapXepDSTangTheoTinChi(){
        SapXep(EnumSoft.TANGTHEOTINCHI);
    }   
    public void sapXepDSTangTheoNamSinh(){
        SapXep(EnumSoft.TANGTHEONAMSINH);
    }   
    //giam
    public void sapXepDSGiamTheoHoTen(){
        SapXep(EnumSoft.GIAMTHEOHOTEN);
    }
    public void sapXepDSGiamTheoTen(){
        SapXep(EnumSoft.GIAMTHEOTEN);
    }
    public void sapXepDSGiamTheoTuoi(){
        SapXep(EnumSoft.GIAMTHEOTUOI);
    }   
    public void sapXepDSGiamTheoChieuCao(){
        SapXep(EnumSoft.GIAMTHEOCHIEUCAO);
    }   
    public void sapXepDSGiamTheoCanNang(){
        SapXep(EnumSoft.GIAMTHEOCANNANG);
    }   
    public void sapXepDSGiamTheoTinChi(){
        SapXep(EnumSoft.GIAMTHEOTINCHI);
    }   
    public void sapXepDSGiamTheoNamSinh(){
        SapXep(EnumSoft.GIAMTHEONAMSINH);
    }   

    public void SapXep(EnumSoft kt){
        dsSinhVien.sort(new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                
                return kieuSapXep(kt,o1,o2);
            }

            
            
        });
    }
    public int kieuSapXep(EnumSoft kt,Student o1,Student o2) {
        switch (kt) {
            //tang
            case TANGTHEOTEN:
                return o1.ten.compareTo(o2.ten);              
            case TANGTHEOHOTEN:
                return o1.hoVaTen.compareTo(o2.hoVaTen);
            case TANGTHEOTUOI:
                return o1.tuoi>o2.tuoi ? 1:-1; 
            case TANGTHEOCHIEUCAO:
                return o1.height>o2.height ? 1:-1; 
            case TANGTHEOCANNANG:
                return o1.weigh>o2.weigh ? 1:-1; 
            case TANGTHEOTINCHI:
                return o1.tinChi>o2.tinChi ? 1:-1; 
            case TANGTHEONAMSINH:
                return o1.namSinh>o2.namSinh ? 1:-1; 
               
            //giam
            case GIAMTHEOTEN:
            return o2.ten.compareTo(o1.ten);
            case GIAMTHEOHOTEN:
            return o2.hoVaTen.compareTo(o1.hoVaTen); 
            case GIAMTHEOTUOI:
                return o1.tuoi<o2.tuoi ? 1:-1; 
            case GIAMTHEOCHIEUCAO:
                return o1.height<o2.height ? 1:-1; 
            case GIAMTHEOCANNANG:
                return o1.weigh<o2.weigh ? 1:-1; 
            case GIAMTHEOTINCHI:
                return o1.tinChi<o2.tinChi ? 1:-1; 
            case GIAMTHEONAMSINH:
                return o1.namSinh<o2.namSinh ? 1:-1; 

        }return -1;
    }
    //
    
    
    //doc file 
    public QuanLySinhVien taoDanhSachSinhVienTuFile(){
        QuanLySinhVien ds=new QuanLySinhVien();
        try {
            FileReader f=new FileReader("D:/Data/DsSinhVien.txt");
            BufferedReader fr=new BufferedReader(f);
            String line="";                      
            while((line=fr.readLine())!=null)
            {                
                ds.addSV(new Student(line));            
            }
            fr.close();
        } catch (Exception e) {
            
           System.out.println("Loi !!!:"+e);
        }      
        return ds;  
    }
    //
    public void themMotSinhVienBangCachNhapDuLieu(){
        Student st=new Student();
        System.out.print("Nhap vao Ho va Ten:");
        st.hoVaTen=in.nextLine();
        System.out.print("Nhap vao tuoi sv:");
        st.tuoi=in.nextInt();
        System.out.print("Nhap vao chieu cao:");
        st.height=in.nextDouble();
        System.out.print("Nhap vao can nang:");
        st.weigh=in.nextDouble();        
        System.out.print("Nhap vao GioiTinh:");
        st.gioiTinh =in.next();
        System.out.print("Nhap vao Khoa:");
        st.khoa=in.next();
        System.out.print("Nhap vao Tin Chi:");
        st.tinChi=in.nextInt();
        System.out.print("Nhap vao lop:");
        st.lop=in.next();
        System.out.print("Nhap vao nam Sinh:");
        st.namSinh=in.nextInt();
        addSV(st);        
    }
    //Xoa 
    public void removeSV(List<Student> st){
        Boolean kt =dsSinhVien.removeAll(st);
        if(kt==true)System.out.println("Xoa thanh cong");else
        System.out.println("ko co doi tuong trung khop de xoa!!!");
        
    }

    public void xoaSV(EnumStudent ktst,String s){
        List<Student> dsXoa=new ArrayList<>();
    dsSinhVien.forEach(st->{if(kiemTraDieuKien(ktst,s,st))dsXoa.add(st);});
        
        removeSV(dsXoa);               

    }
    public void xoaSinhVienTheoTen(String s){
        s=in.next();
        xoaSV(EnumStudent.TEN,s);
    }
    public void xoaSinhVienTheoHoTen(String s){
        s=in.next();
        xoaSV(EnumStudent.HOTEN,s);
    }
    public void xoaSinhVienTheoKhoa(String s){
        s=in.next();
        xoaSV(EnumStudent.KHOA,s);
    }
    public void xoaSinhVienTheoLop(String s){
        s=in.next();
        xoaSV(EnumStudent.LOP,s);
    }
    public void xoaSinhVienTheoNamSinh(String s){
        s=in.next();
        xoaSV(EnumStudent.NAMSINH,s);
    }
   
    


    private boolean kiemTraDieuKien(EnumStudent ktst,String s,Student st) {
        //int namSinh=Integer.parseInt(s);
        switch(ktst){
            case TEN:
            if(s.compareTo(st.ten)==0)return true;
            break;
            case HOTEN:
            if(s.compareTo(st.hoSV)==0)return true;
            break;
            case KHOA:
            if(s.compareTo(st.khoa)==0)return true;
            break;
            case LOP:
            if(s.compareTo(st.lop)==0)return true;
            break;
            case NAMSINH:
            int namSinh=Integer.parseInt(s);
            if(namSinh==st.namSinh)return true;
            break;
        }    
       
        return false;
    }
    //Dinh dang ket qua
    public String xuatThanhTieuDe(){
        String s=String.format("%-20s%-10s%-12s%-12s%-12s%-10s%-12s%-10s%-12s\n\n"
        ,"Ho va ten","Tuoi","Chieu cao","Can nang","Gioi tinh","Khoa","Tin chi","lop","Nam Sinh");
        return s;
    }
    
    @Override
    public String toString() {
        String tieuDe=xuatThanhTieuDe();
        if(dsSinhVien.isEmpty())
        System.out.println("-----------Danh Sach Trong!!!!!!-----------");else
        System.out.println(tieuDe);
        String s="";
        for (Student st : dsSinhVien) {
            s+=st+"\n";            
        }
        return s;
    }

}
