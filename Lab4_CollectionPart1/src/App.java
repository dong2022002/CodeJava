import java.util.Scanner;


 
public class App {
   
        public static enum Menu{
           THOAT(0),
           GIAITOAN(1),
           HINHHOC(2),
           CURRENCY(3),
           LISTSTRING(4),           
           TACHCHUOITHANHMANG(5),
           HASHMAPJSON(6);
           
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
            System.out.println("Nhan 5 de tach chuoi thanh mang");
            System.out.println("Nhan 6 de tao mot HashMap<String,String> roi xuat ra cau truc Json");
            System.out.println("=========================================");
            System.out.print("Chon chuc nang:");
            
            int chon =in.nextInt();
            ChuoiKyTu chuoi=new ChuoiKyTu();
           Menu menu= Menu.THOAT;
           int n=0,x1,x2,x3;
           String a="";

           String key,value;
           HashMapJson hashMap=new HashMapJson();
            
            for (Menu s : Menu.values()) {
                if(chon==s.value){
                menu=s;
                break;
            }

            }
         switch (menu) {
            case THOAT: 
                    in.close();                   
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
                System.out.print("Nhap do dai cua Mang n=");
                n=in.nextInt();
                String[] str=new String[n];
                in.nextLine();
                for(int i=0;i<str.length;i++){
                str[i]=in.nextLine();
                }
          
                 System.out.println("Nhap vao mot ky tu");
                 String c= in.next();
                 chuoi=new ChuoiKyTu(str,c);
                System.out.println(chuoi);
                chuoi.timChuCaiTuMotKyTU();
                TamDung();
                break;
            case TACHCHUOITHANHMANG:
                
                System.out.println("Chuyen Chuoi 'Hello_I_am_Iron_Man!' Thanh mang nhu sau: ");                
                chuoi =new ChuoiKyTu("Hello_I_am_Iron_Man!");
                chuoi.tachChuoiThanhMang();
                System.out.println(chuoi);
                System.out.println("Chuyen mot mang thanh mot chuoi bang dau '_' ");
                System.out.println("Nhap vao mot chuoi");
                a=in.next();
                chuoi=new ChuoiKyTu(a);              
                chuoi.tachChuoiThanhMang();
                System.out.println(chuoi);
                TamDung();
                break;
            case HASHMAPJSON:
                System.out.print("So cap du lieu muon nhap n=");
                n=in.nextInt();
                System.out.println("Nhap key va value theo thu tu");
                
                for (int i = 0; i < n; i++) {
                   
                    System.out.print("key=");
                    //in.nextLine();
                    key=in.next();
                    System.out.print("value=");
                    value=in.next();                   
                    
                    hashMap.add(key, value);
                }
                System.out.println(hashMap);
                //hashMap.out();
                TamDung();
                break;
            }
      
      

             
        
    }
    }
    
}
