package Tt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhoaHoc {
    public static final int TOI_DA = 20; // một khóa học có tối đa 20 học viên

    private String tenKhoaHoc;
    private LocalDate ngayMo;
    private int thoiGian; // thời gian học, tính theo số tuần
    private HocVien[] dsHocVien = new HocVien[TOI_DA];
    private int soHV;

    public KhoaHoc(String tenKhoaHoc, LocalDate ngayMo, int thoiGian) {
        this.tenKhoaHoc = tenKhoaHoc;
        this.ngayMo = ngayMo;
        this.thoiGian = thoiGian;
        this.soHV = 0;
    }

    public String getTenKhoaHoc() { return tenKhoaHoc; }
    public LocalDate getNgayMo() { return ngayMo; }
    public int getThoiGian() { return thoiGian; }
    public int getSoHV() { return soHV; }

    // Kiểm tra học viên (theo số điện thoại) đã có trong khóa chưa
    public boolean coHocVien(String soDienThoai) {
        for (int i = 0; i < soHV; i++)
            if (dsHocVien[i].getSoDienThoai().equals(soDienThoai))
                return true;
        return false;
    }

    // Thêm học viên: thất bại nếu đủ 20 người hoặc đã đăng ký rồi
    public boolean themHocVien(HocVien hv) {
        if (hv == null || soHV >= TOI_DA || coHocVien(hv.getSoDienThoai()))
            return false;
        dsHocVien[soHV++] = hv;
        return true;
    }

    public LocalDate ngayKetThuc() {
        return ngayMo.plusWeeks(thoiGian);
    }

    public boolean chuaBatDau(LocalDate homNay) {
        return homNay.isBefore(ngayMo);
    }

    public boolean daKetThuc(LocalDate homNay) {
        return homNay.isAfter(ngayKetThuc());
    }

    public boolean chuaKetThuc(LocalDate homNay) {
        return !daKetThuc(homNay);
    }

    public void xuatDanhSachHocVien() {
        for (int i = 0; i < soHV; i++)
            System.out.println("    " + dsHocVien[i]);
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-12s | mo: %s | %d tuan | ket thuc: %s | %d/%d hoc vien",
                tenKhoaHoc, ngayMo.format(fmt), thoiGian,
                ngayKetThuc().format(fmt), soHV, TOI_DA);
    }
}
