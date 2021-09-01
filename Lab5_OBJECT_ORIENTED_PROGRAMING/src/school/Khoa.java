package school;

public abstract class Khoa {
    private String tenKhoa;
    private String chuongTrinhDaoTao;
    private String ngayThanhLap;

    public String getChuongTrinhDaoTao() {
        return chuongTrinhDaoTao;
    }

    public String getNgayThanhLap() {
        return ngayThanhLap;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setChuongTrinhDaoTao(String chuongTrinhDaoTao) {
        this.chuongTrinhDaoTao = chuongTrinhDaoTao;
    }

    public void setNgayThanhLap(String ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public Khoa(String tenKhoa, String chuongTrinhDaoTao, String ngayThanhLap) {
        this.tenKhoa = tenKhoa;
        this.chuongTrinhDaoTao = chuongTrinhDaoTao;
        this.ngayThanhLap = ngayThanhLap;
    }

    @Override
    public String toString() {
        return "Ten khoa            :" + tenKhoa + "\nChuong trinh dao tao:" + chuongTrinhDaoTao
                + "\nNgay thanh lap      :" + ngayThanhLap;
    }

}
