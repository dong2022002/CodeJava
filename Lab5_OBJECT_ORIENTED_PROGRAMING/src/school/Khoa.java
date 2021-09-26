package school;

public abstract class Khoa {
    private String tenKhoa;
    private String thoiGianDaoTao;
    private String ngayThanhLap;

    public String getChuongTrinhDaoTao() {
        return thoiGianDaoTao;
    }

    public String getNgayThanhLap() {
        return ngayThanhLap;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setThoiGianDaoTao(String chuongTrinhDaoTao) {
        this.thoiGianDaoTao = chuongTrinhDaoTao;
    }

    public void setNgayThanhLap(String ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public Khoa(String tenKhoa, String chuongTrinhDaoTao, String ngayThanhLap) {
        this.tenKhoa = tenKhoa;
        this.thoiGianDaoTao = chuongTrinhDaoTao;
        this.ngayThanhLap = ngayThanhLap;
    }

    public Khoa(String line) {
        String[] s = line.split("_");
        this.tenKhoa = s[0];
        this.ngayThanhLap = s[1];
        this.thoiGianDaoTao = s[2];
    }

    public Khoa() {
    }

    @Override
    public String toString() {
        return "Ten khoa: " + tenKhoa + "   ngay thanh lap: " + ngayThanhLap + " thoi gian dao tao: " + thoiGianDaoTao
                + "\n";
    }

}
