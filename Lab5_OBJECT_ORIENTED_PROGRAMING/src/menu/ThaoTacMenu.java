package menu;

import java.util.Scanner;

public class ThaoTacMenu {
    public Scanner in =new Scanner(System.in);
    public int chonMenu(){
        System.out.print("Chon 1 so:");
        
        int n;
        boolean kt=true;

        do{
            n=in.nextInt();
            if(n>=0&&n<3){
                kt=false;
                
                }
            else System.out.println("So Menu vuot qua gioi han !!!\n");
        }while(kt);
        
       
        return n;
       
    } 
    public void TamDung(){
        int x=-1;
        
        while(x!=0){
            XuatDuongKe();
            System.out.println("Nhan phim 0 de tiep tuc!");
            x=in.nextInt();
        }
       
    }
    public void XuatDuongKe()
    {
        System.out.println("==============================================");

    }
   

}
