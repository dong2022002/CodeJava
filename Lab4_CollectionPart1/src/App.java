import java.util.Scanner;



 
public class App {
   
        public static enum Menu{
           THOAT(0),
           GIAITOAN(1),
           HINHHOC(2),
           CURRENCY(3),
           LISTSTRING(4);
           private int value;
           private Menu(int value) {
               this.value=value;
           }
           
       }
       public static void TamDung(){
           Scanner in=new Scanner(System.in);
           int x=1;
           while(x!=0){
           System.out.println("===={Nhan phim 0 de tiep tuc}====");
                   x=in.nextInt();
                }
                System.out.println("*****************************************");
           }
       
    public static void main(String[] args) throws Exception {
        
         Scanner in =new Scanner(System.in);
         while(true){
            System.out.println("=========================================");
            System.out.println("Nhan 0 de thoat chuong trinh");
            System.out.println("Nhan 1 de Giai mot so bai toan");
            System.out.println("Nhan 2 de giai Hinh hoc");
            System.out.println("Nhan 3 de chuyen mot so thanh tien te");
            System.out.println("Nhan 4 de thao tac voi chuoi");
            System.out.println("=========================================");
            System.out.print("Chon chuc nang:");
            
            int chon =in.nextInt();
            
           Menu menu= Menu.THOAT;
           int n=0,x1,x2,x3;
            
            for (Menu s : Menu.values()) {
                if(chon==s.value){
                menu=s;
                break;
            }

            }
         switch (menu) {
            case THOAT:                    
                    return;
            case GIAITOAN:                
                System.out.print("Nhap vao mot so N=");
                n=in.nextInt();
                ToanSo toan=new ToanSo(n);
                System.out.println(toan);
                TamDung();            
                break;
            case HINHHOC:
                System.out.println("Nhap vao 3 so nguyen duong lien tiep de xac dinh loai tam giac");
                x1=in.nextInt();
                x2=in.nextInt();
                x3=in.nextInt();
                HinhHoc hh=new HinhHoc(x1,x2,x3);
                hh.XuatKetQuaHinhHoc();
                TamDung();               
                break;
            case CURRENCY:
                System.out.println("Nhap vao mot so");
                double currency = in.nextDouble(); 
                Currency number=new Currency(currency);
                number.chuyenDoi();
                System.out.println(number);
                TamDung();
                break;
            case LISTSTRING:
                
                
                ChuoiKyTu chuoi=new ChuoiKyTu();
                System.out.println(chuoi);
                chuoi.TimChuCaiTuMotKyTU();
                TamDung();
                break;
         }
      
      

             
        
    }
    }
    
}
