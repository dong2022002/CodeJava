package school;

public abstract class Khoa{
    public String tenKhoa;
    public String chuongTrinhDaoTao;
    public String ngayThanhLap;
    
    
    public Khoa() {
        
    }   
    public Khoa(String tenKhoa,String chuongTrinhDaoTao,String ngayThanhLap) {
        this.tenKhoa=tenKhoa;
        this.chuongTrinhDaoTao=chuongTrinhDaoTao;
        this.ngayThanhLap=ngayThanhLap;
    } 





    @Override
    public String toString() {
        return "Ten khoa            :"+tenKhoa+
             "\nChuong trinh dao tao:"+chuongTrinhDaoTao+
             "\nNgay thanh lap      :"+ngayThanhLap;
    }
    
}
