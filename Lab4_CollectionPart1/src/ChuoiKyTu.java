import java.util.ArrayList;
import java.util.List;


public class ChuoiKyTu{
    public String[] str;
    public int n=0;
    public char c;
    public String x;
    List<String> list=new ArrayList<>();
   

    public ChuoiKyTu() {
        
    }
    public ChuoiKyTu(String x) {
        this.x=x;
    }
    public ChuoiKyTu(String[] str,String a) {
        this.str=str;
        c=a.toUpperCase().charAt(0);
    }
    
    
    public void tachChuoiThanhMang(){
        str=x.split("_");

    }
    public void timChuCaiTuMotKyTU(){
        
        System.out.println("Cac chu cai dau tien xuat hien tu ky tu "+c);
       
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
        System.out.println("Mang hien tai:");
        for (String s : str) {
             s1+=s+'\t';
        }
       
        
        return s1+"\n=================================";
        
        
      
    }

}   