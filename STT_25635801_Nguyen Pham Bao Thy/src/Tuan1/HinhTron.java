package Tuan1;

import java.util.Scanner;

public class HinhTron {

    private double x;
    private double y;
    private double banKinh;

    // Constructor
    public HinhTron(double x, double y, double banKinh) {
        this.x = x;
        this.y = y;
        this.banKinh = banKinh;
    }

    // Lay toa do X cua tam
    public double getX() {
        return x;
    }

    // Lay toa do Y cua tam
    public double getY() {
        return y;
    }

    // Lay ban kinh
    public double getBanKinh() {
        return banKinh;
    }

    // Tinh dien tich
    public double getDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Tinh chu vi
    public double getChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap toa do tam x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap toa do tam y: ");
        double y = sc.nextDouble();

        System.out.print("Nhap ban kinh: ");
        double r = sc.nextDouble();

        HinhTron h = new HinhTron(x, y, r);

        System.out.println("----- KET QUA -----");
        System.out.println("Tam hinh tron: (" + h.getX() + ", " + h.getY() + ")");
        System.out.println("Ban kinh: " + h.getBanKinh());
        System.out.println("Dien tich: " + h.getDienTich());
        System.out.println("Chu vi: " + h.getChuVi());

        sc.close();
    }
}