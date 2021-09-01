import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
    private double number = 0;
    private String s1, s2;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Currency(double number) {
        this.number = number;
    }

    public Currency() {
    }

    public void chuyenDoi() {
        Locale locale = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        s1 = numberFormat.format(number);
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormatVN = NumberFormat.getCurrencyInstance(localeVN);
        s2 = numberFormatVN.format(number);
    }

    @Override
    public String toString() {
        return "So nhap vao :" + number + "\nChuyen thanh tien te cua US la:" + s1
                + "\nChuyen thanh tien te cua VN la:" + s2;
    }

}
