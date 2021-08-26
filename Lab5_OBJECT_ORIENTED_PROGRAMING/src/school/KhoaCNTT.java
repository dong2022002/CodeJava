package school;
import java.util.List;
import object.Person;
import java.util.ArrayList;

public class KhoaCNTT extends Khoa {
    List<Person> listGiangVien=new ArrayList<>();
    public KhoaCNTT() {
        
    }
    public KhoaCNTT(String chuongTrinhDaoTao,String ngayThanhLap) {
        super("CNTT",chuongTrinhDaoTao,ngayThanhLap);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
