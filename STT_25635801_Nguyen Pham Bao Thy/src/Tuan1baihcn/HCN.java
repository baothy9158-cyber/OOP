package Tuan1baihcn;

import java.util.Scanner;

public class HCN {

    private double chieuDai;
    private double chieuRong;

    public HCN() {
        super();
    }
    public HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double cd) throws Exception {
        if (cd > 0) {
            this.chieuDai = cd;
        } else {
            throw new Exception("Chieu dai phai > 0");
        }
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double cr) throws Exception {
        if (cr > 0) {
            this.chieuRong = cr;
        } else {
            throw new Exception("Chieu rong phai > 0");
        }
    }
    public double getDT() {
        return this.chieuDai * this.chieuRong;
    }
    public double getCv() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double cd = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double cr = sc.nextDouble();

        HCN h1 = new HCN(cd, cr);

        System.out.println("----- KET QUA -----");
        System.out.println("Chieu dai: " + h1.getChieuDai());
        System.out.println("Chieu rong: " + h1.getChieuRong());
        System.out.println("Dien tich: " + h1.getDT());
        System.out.println("Chu vi: " + h1.getCv());

        sc.close();
    }
}