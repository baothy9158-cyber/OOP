package khackHang;
import java.time.LocalDate;
import java.util.*;

public abstract class KhachHang {
	protected String maKH;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW;
	protected double donGia;
	
	public KhachHang(String ma, String ten, LocalDate ngay, double soKW, double donGia) {
		this.maKH =ma;
		this.hoTen= ten;
		this.ngayLapHoaDon = ngay;
		this.soKW = soKW;
		this.donGia= donGia;
	}
	public abstract double thanhTien();
	public LocalDate getngayLapHoaDon() {return ngayLapHoaDon;}
	public String getMaKH() {return maKH;}
	public String getHoTen() {return hoTen;}
	
	@Override 
	public String toString() {
		return String.format("(%s | %s | Ngay: %s| TT:%,.0f",
				maKH, hoTen, ngayLapHoaDon, thanhTien());
	}

}
