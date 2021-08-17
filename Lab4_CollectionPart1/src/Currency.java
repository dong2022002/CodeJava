import java.text.NumberFormat;
import java.util.Locale;
public class Currency{
    double number=200000d;
    String str1,str2;
    public Currency(double number) {
        this.number=number;
    }
    public Currency() {
        
    }
    public void chuyenDoi(){
    Locale locale=new Locale("en","US");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
     str1=numberFormat.format(number);    
    Locale localeVN=new Locale("vi","VN");
    NumberFormat numberFormatVN = NumberFormat.getCurrencyInstance(localeVN);
     str2=numberFormatVN.format(number);
    }
    


    
    @Override
    public String toString() {
        return "So nhap vao :"+number+"\nChuyen thanh tien te cua US la:"+str1+
        "\nChuyen thanh tien te cua VN la:"+ str2;
    }

}
