package Tt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int docSoNguyen(String thongBao, int min, int max) {
        while (true) {
            System.out.print(thongBao);
            try {
                int x = Integer.parseInt(sc.nextLine().trim());
                if (x >= min && x <= max)
                    return x;
            } catch (NumberFormatException e) {
                // nhập sai -> nhập lại
            }
            System.out.println("  Gia tri khong hop le, nhap lai!");
        }
    }

    static LocalDate docNgay(String thongBao) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print(thongBao);
            try {
                return LocalDate.parse(sc.nextLine().trim(), fmt);
            } catch (DateTimeParseException e) {
                System.out.println("  Ngay khong hop le (dd/MM/yyyy), nhap lai!");
            }
        }
    }

    static String docChuoi(String thongBao) {
        System.out.print(thongBao);
        return sc.nextLine().trim();
    }

    static void in(String tieuDe, KhoaHoc[] ds) {
        System.out.println(tieuDe);
        if (ds.length == 0)
            System.out.println("  (khong co)");
        for (KhoaHoc kh : ds)
            System.out.println("  " + kh);
    }

    public static void main(String[] args) {
        TrungTam tt = new TrungTam(50);
        LocalDate homNay = LocalDate.now();
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them khoa hoc");
            System.out.println("2. Them hoc vien vao khoa hoc");
            System.out.println("3. Tim khoa hoc theo ten");
            System.out.println("4. Xem cac khoa hoc cua mot hoc vien");
            System.out.println("5. Cac khoa hoc chua ket thuc");
            System.out.println("6. Cac khoa hoc chua bat dau");
            System.out.println("7. Xuat danh sach khoa hoc va hoc vien");
            System.out.println("0. Thoat");
            chon = docSoNguyen("Chon chuc nang: ", 0, 7);

            switch (chon) {
                case 1: {
                    String ten = docChuoi("Ten khoa hoc: ");
                    LocalDate ngayMo = docNgay("Ngay mo (dd/MM/yyyy): ");
                    int tuan = docSoNguyen("Thoi gian hoc (so tuan): ", 1, 520);
                    if (tt.themKhoaHoc(new KhoaHoc(ten, ngayMo, tuan)))
                        System.out.println("=> Them khoa hoc thanh cong!");
                    else
                        System.out.println("=> Danh sach khoa hoc da day!");
                    break;
                }
                case 2: {
                    if (tt.getSoKhoa() == 0) {
                        System.out.println("Chua co khoa hoc nao, hay them khoa hoc truoc!");
                        break;
                    }
                    for (int i = 0; i < tt.getSoKhoa(); i++)
                        System.out.println((i + 1) + ". " + tt.getKhoa(i));
                    int stt = docSoNguyen("Chon khoa hoc (so thu tu): ", 1, tt.getSoKhoa());
                    String hoTen = docChuoi("Ho ten: ");
                    String diaChi = docChuoi("Dia chi: ");
                    String sdt = docChuoi("So dien thoai: ");
                    if (tt.getKhoa(stt - 1).themHocVien(new HocVien(hoTen, diaChi, sdt)))
                        System.out.println("=> Them hoc vien thanh cong!");
                    else
                        System.out.println("=> That bai (khoa da du 20 nguoi hoac hoc vien da dang ky)!");
                    break;
                }
                case 3:
                    in("Ket qua tim kiem:", tt.timTheoTen(docChuoi("Nhap tu khoa: ")));
                    break;
                case 4:
                    in("Cac khoa hoc da hoc:", tt.khoaCuaHocVien(docChuoi("Nhap so dien thoai hoc vien: ")));
                    break;
                case 5:
                    in("Cac khoa hoc chua ket thuc:", tt.khoaChuaKetThuc(homNay));
                    break;
                case 6:
                    in("Cac khoa hoc chua bat dau:", tt.khoaChuaBatDau(homNay));
                    break;
                case 7:
                    tt.xuatDanhSach();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
            }
        } while (chon != 0);

        sc.close();
    }
}
