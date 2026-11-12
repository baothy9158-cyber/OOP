package Tt;
import java.time.LocalDate;
import java.util.Arrays;

// Lớp quản lý của trung tâm đào tạo
public class TrungTam {
    private KhoaHoc[] dsKhoa;
    private int soKhoa;

    public TrungTam(int n) {
        dsKhoa = new KhoaHoc[n];
        soKhoa = 0;
    }

    public boolean themKhoaHoc(KhoaHoc kh) {
        if (kh == null || soKhoa >= dsKhoa.length)
            return false;
        dsKhoa[soKhoa++] = kh;
        return true;
    }

    public int getSoKhoa() { return soKhoa; }

    public KhoaHoc getKhoa(int i) { return dsKhoa[i]; }

    public void xuatDanhSach() {
        if (soKhoa == 0) {
            System.out.println("Chua co khoa hoc nao.");
            return;
        }
        for (int i = 0; i < soKhoa; i++) {
            System.out.println((i + 1) + ". " + dsKhoa[i]);
            dsKhoa[i].xuatDanhSachHocVien();
        }
    }

    // Tìm kiếm khóa học theo tên (từ khóa, không phân biệt hoa thường)
    public KhoaHoc[] timTheoTen(String tuKhoa) {
        KhoaHoc[] kq = new KhoaHoc[soKhoa];
        int n = 0;
        for (int i = 0; i < soKhoa; i++)
            if (dsKhoa[i].getTenKhoaHoc().toLowerCase().contains(tuKhoa.toLowerCase()))
                kq[n++] = dsKhoa[i];
        return Arrays.copyOf(kq, n);
    }

    // Các khóa học mà một học viên (theo số điện thoại) đã từng học
    public KhoaHoc[] khoaCuaHocVien(String soDienThoai) {
        KhoaHoc[] kq = new KhoaHoc[soKhoa];
        int n = 0;
        for (int i = 0; i < soKhoa; i++)
            if (dsKhoa[i].coHocVien(soDienThoai))
                kq[n++] = dsKhoa[i];
        return Arrays.copyOf(kq, n);
    }

    // Các khóa học chưa kết thúc
    public KhoaHoc[] khoaChuaKetThuc(LocalDate homNay) {
        KhoaHoc[] kq = new KhoaHoc[soKhoa];
        int n = 0;
        for (int i = 0; i < soKhoa; i++)
            if (dsKhoa[i].chuaKetThuc(homNay))
                kq[n++] = dsKhoa[i];
        return Arrays.copyOf(kq, n);
    }

    // Các khóa học chưa bắt đầu
    public KhoaHoc[] khoaChuaBatDau(LocalDate homNay) {
        KhoaHoc[] kq = new KhoaHoc[soKhoa];
        int n = 0;
        for (int i = 0; i < soKhoa; i++)
            if (dsKhoa[i].chuaBatDau(homNay))
                kq[n++] = dsKhoa[i];
        return Arrays.copyOf(kq, n);
    }
}
