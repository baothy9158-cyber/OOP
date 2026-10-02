package qlgd_dat_nha;
class GIaoDichDat extends GiaoDich{
	private String loaiDat;
	public GiaoDichDat(String ma, LocalDate ngay, double dongGia,
			double dienTich, String loaiDat) {
		super(ma, ngay, dongGia, dienTich);
		this.loaiDat= loaiDat;
		
	}
	@Override 
	public double thanhTien() {
		if(loaiDat.equalsIgnoreCase("A")) {
			return dienTich * dongGia *1.5;
		}
		return dienTich * dongGia;
	}
	
	@Override 
	public String toString() {
		return "[DAT]" + super.toString()+ "|Loai" + loaiDat;
	}

}


