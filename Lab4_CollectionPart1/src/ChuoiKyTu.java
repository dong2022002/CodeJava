import java.util.Scanner;

public class ChuoiKyTu{
    public String[] str;
    public int n=0;
    public char c;
    Scanner in = new Scanner(System.in);
    public ChuoiKyTu() {
        System.out.print("Nhap do dai cua Mang n=");
        n=in.nextInt();
        str=new String[n];
        in.nextLine();
        for(int i=0;i<str.length;i++){
            str[i]=in.nextLine();
        }
      
        System.out.println("Nhap vao mot ky tu");
        String a= in.next();
        c=a.toUpperCase().charAt(0);
    }
    public void TimChuCaiTuMotKyTU(){
        
        System.out.println("Cac chu cai xuat hien tu ky tu :"+c);
       
        for (String s : str) {
            char t=s.trim().toUpperCase().charAt(0);
            if(t==c)
            System.out.println(s);
        
        }
    }
   

    @Override
    public String toString() {
        String s1="";
        System.out.println("=================================");
        System.out.println("Mang hien hanh:");
        for (String s : str) {
             s1+=s+'\t';
        }
       
        
        return s1+"\n=================================";
        
        
      
    }

}   