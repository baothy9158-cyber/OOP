package Tuan2_SinhVien;
public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien() {
        maSinhVien = 1;
        hoTen = "Chua co ten";
        diemLT = 0;
        diemTH = 0;
    }
    public SinhVien(int maSinhVien, String hoTen, double diemLT, double diemTH) {
        setMaSinhVien(maSinhVien);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }
    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }
    public void setMaSinhVien(int maSinhVien) {
        if (maSinhVien > 0) {
            this.maSinhVien = maSinhVien;
        } else {
            throw new IllegalArgumentException("Ma sinh vien phai > 0");
        }
    }

    public void setHoTen(String hoTen) {
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        } else {
            throw new IllegalArgumentException("Ho ten khong duoc rong");
        }
    }

    public void setDiemLT(double diemLT) {
        if (diemLT >= 0 && diemLT <= 10) {
            this.diemLT = diemLT;
        } else {
            throw new IllegalArgumentException("Diem LT phai tu 0 den 10");
        }
    }

    public void setDiemTH(double diemTH) {
        if (diemTH >= 0 && diemTH <= 10) {
            this.diemTH = diemTH;
        } else {
            throw new IllegalArgumentException("Diem TH phai tu 0 den 10");
        }
    }

    public double tinhDiemTrungBinh() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-12d %-25s %-10.2f %-10.2f",
                maSinhVien, hoTen, diemLT, diemTH);
    }
}

