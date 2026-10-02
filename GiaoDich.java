package qlgd_dat_nha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GiaoDich {
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double dongGia;
	protected double dienTich;
	
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich,
			double dongGia, double dienTich) {
		this.maGiaoDich= maGiaoDich;
		this.ngayGiaoDich= ngayGiaoDich;
		this.dongGia= dongGia;
		this.dienTich= dienTich;
		
	}
	
	public abstract double thanhTien();
	
	public String getMaGiaoDich() {return maGiaoDich;}
	public LocalDate getNgayGiaoDich() {return ngayGiaoDich;}
	
	@override 
	public String toString() {
		return String.format(
				"Ma: %-6s | Ngay: %s | Don gia: %,.0f| DT: %.1f| Thanh tien: %.0f",
				maGiaoDich,
				ngayGiaoDich.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				dongGia, dienTich, thanhTien());
	}

}

