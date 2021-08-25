

import menu.Menu;
import menu.ThaoTacMenu;
import object.Person;

public class App {

    public static void main(String[] args) throws Exception {
        Menu menu=Menu.THOAT;
        ThaoTacMenu t=new ThaoTacMenu();
        while(true){
            //Menu
            t.XuatDuongKe();
            System.out.println("Nhan 0 de thoat chuong trinh!");
            System.out.println("Nhan 1 de nhap vao thong tin cua 1 nguoi");
            //Chon Menu
            t.XuatDuongKe();
            int n=t.chonMenu();
            for (Menu s : Menu.values()) {
                if(s.value==n)
                menu=s;
            }
            t.XuatDuongKe();
            
            //Khai bao dung chung
            Person person=new Person();
            //
            switch(menu){
                case THOAT:
                return ;
                case PERSON:
                person =new Person("Tran Dieu Dong",19,1.74,60,"Nam");
                System.out.println(person);               
                t.TamDung();
                break;
            }
            
            
        }
    }
}
