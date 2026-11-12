package Tt;

public class HocVien {
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public HocVien(String hoTen, String diaChi, String soDienThoai) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() { return hoTen; }
    public String getDiaChi() { return diaChi; }
    public String getSoDienThoai() { return soDienThoai; }

    @Override
    public String toString() {
        return String.format("%-15s | %-12s | %s", hoTen, soDienThoai, diaChi);
    }
}
