package Tuan2_SinhVien;

import java.util.Scanner;

public class TestSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(
                23123456,
                "Nguyen Van A",
                8.5,
                9.0
        );
        SinhVien sv2 = new SinhVien(
                23123457,
                "Tran Thi B",
                7.5,
                8.0
        );
        SinhVien sv3 = new SinhVien();

        System.out.println("Nhap thong tin sinh vien thu 3:");

        System.out.print("Ma sinh vien: ");
        int ma = sc.nextInt();
        sc.nextLine();

        System.out.print("Ho ten: ");
        String ten = sc.nextLine();

        System.out.print("Diem LT: ");
        double diemLT = sc.nextDouble();

        System.out.print("Diem TH: ");
        double diemTH = sc.nextDouble();

        sv3.setMaSinhVien(ma);
        sv3.setHoTen(ten);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        System.out.println("\nDANH SACH SINH VIEN");
        System.out.printf("%-12s %-25s %-10s %-10s%n",
                "MSSV", "Ho ten", "Diem LT", "Diem TH");

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        System.out.println("\nDiem trung binh:");
        System.out.printf("%s: %.2f%n",
                sv1.getHoTen(), sv1.tinhDiemTrungBinh());
        System.out.printf("%s: %.2f%n",
                sv2.getHoTen(), sv2.tinhDiemTrungBinh());
        System.out.printf("%s: %.2f%n",
                sv3.getHoTen(), sv3.tinhDiemTrungBinh());

        sc.close();
    }
}
