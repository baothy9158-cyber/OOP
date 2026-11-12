package qlgd_dat_nha;

class GIaoDichNha extends GiaoDich{
	private String loaiDat;
	private String diaChi;
	
	public GIaoDichNha(String ma, LocalDate ngay, double dongGia,
			double dienTich, String loaiNha, String diaChi) {
		super(ma, ngay, dongGia, dienTich);
		this.loaiNha= loaiNha;
		this.diaChi= diaChi;
	}
@Override
public double thanhTien() {
	if(loaiNha.euqalsIgnoreCase("cao cap")) {
		return dienTich * dongGia;
	}
	return dienTich * dongGia *0.9;
}
@Override
public String toString() {
	return 
}
}
