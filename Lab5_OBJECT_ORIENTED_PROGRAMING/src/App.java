

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

public class App {
    
    
    
    

    public static void main(String[] args) throws FileNotFoundException {
        
        Menu menu=Menu.THOAT;
        ThaoTacMenu ttMenu=new ThaoTacMenu();
        ThaoTacMenu t=new ThaoTacMenu();
        while(true){
            //Menu
            t.XuatDuongKe();
            System.out.println("Nhan 0 de thoat chuong trinh!");
            System.out.println("Nhan 1 de xem thong tin ve nguoi trong file D:/Text/person.txt : ");
            System.out.println("Nhan 2 de xem thong tin ve dong vat trong file D:/Text/person.txt : ");
            System.out.println("Nhan 3 de xem thong tin ve xe hoi trong file D:/Text/car.txt : ");            
            System.out.println("Nhan 4 de xem thong tin ve may tinh trong file D:/Text/computer.txt : ");
            System.out.println("Nhan 5 de xem thong tin ve am nhac trong file D:/Text/music.txt : ");
            System.out.println("Nhan 6 de xem thong tin ve thuc vat trong file D:/Text/thucvat.txt : ");
            //Chon Menu
            t.XuatDuongKe();
            int n=t.chonMenu();
            for (Menu s : Menu.values()) {
                if(s.value==n)
                menu=s;
            }
            t.XuatDuongKe();
            
            //Khai bao dung chung
            //Khai bao File
            FileReader fr;
            BufferedReader br;
            //Khai bao cac doi tuong
            Animal animal;
            Person person;
            Car car;
            Computer computer;
            Music music;
            Plant plant;
            //khai bao bien 
            String line;
            //
            switch(menu){

                case THOAT:
                return ;

                case PERSON:
                fr = new FileReader("D:/Data/person.txt");
                br =new BufferedReader(fr);
                System.out.println("Du lieu trong file D:/Text/person.txt:\n");
                try{
                    while ((line =br.readLine())!=null) {
                    person =new Person(line);
                    System.out.println(person);
                    ttMenu.XuatDuongKe();
                    }
                }
                catch(Exception ex){
                    System.out.println("Loi doc file: "+ex);
                }             
                t.TamDung();
                break;

                case ANIMAL:
                fr =new FileReader("D:/Data/animal.txt");
                br =new BufferedReader(fr);
                System.out.println("Du lieu trong file D:/Data/animal.txt:\n");
                try {
                    while((line =br.readLine())!=null){
                        animal=new Animal(line);
                        System.out.println(animal);
                        ttMenu.XuatDuongKe();
                    }
                } catch (Exception e) {
                    System.out.println("Loi doc file; "+e);
                }
                t.TamDung();
                break;

                case CAR:
                fr =new FileReader("D:/Data/car.txt");
                br =new BufferedReader(fr);
                System.out.println("Du lieu trong file D:/Data/car.txt:\n");
                try {
                    while((line =br.readLine())!=null){
                        car=new Car(line);
                        System.out.println(car);
                        ttMenu.XuatDuongKe();
                    }
                } catch (Exception e) {
                    System.out.println("Loi doc file; "+e);
                }
                t.TamDung();
                break;

                case COMPUTER:
                fr =new FileReader("D:/Data/computer.txt");
                br =new BufferedReader(fr);
                System.out.println("Du lieu trong file D:/Data/computer.txt:\n");
                try {
                    while((line =br.readLine())!=null){
                        computer =new Computer(line);
                        System.out.println(computer);
                        ttMenu.XuatDuongKe();
                    }
                } catch (Exception e) {
                    System.out.println("Loi doc file; "+e);
                }
                t.TamDung();
                break;

                case MUSIC:
                fr =new FileReader("D:/Data/music.txt");
                br =new BufferedReader(fr);
                System.out.println("Du lieu trong file D:/Data/music.txt:\n");
                try {
                    while((line =br.readLine())!=null){
                        music =new Music(line);
                        System.out.println(music);
                        ttMenu.XuatDuongKe();
                    }
                } catch (Exception e) {
                    System.out.println("Loi doc file; "+e);
                }
                t.TamDung();
                break;

                case PLANT:
                fr =new FileReader("D:/Data/plant.txt");
                br =new BufferedReader(fr);
                System.out.println("Du lieu trong file D:/Data/plant.txt:\n");
                try {
                    while((line =br.readLine())!=null){
                        plant =new Plant(line);
                        System.out.println(plant);
                        ttMenu.XuatDuongKe();
                    }
                } catch (Exception e) {
                    System.out.println("Loi doc file; "+e);
                }
                t.TamDung();
                break;

                

            }
            
        }
       
    }
}
