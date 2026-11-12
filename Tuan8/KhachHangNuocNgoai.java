package khackHang;
import java.time.LocalDate;
class KhachHangNuocNgoai extends KhachHang{
	
	private String quocTich;
	
	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public KhachHangNuocNgoai(String ma, String ten, LocalDate ngay, double soKW, double donGia, String quocTich) {
		super(ma, ten, ngay, soKW, donGia);
		this.quocTich = quocTich;
	}

	@Override
	public double thanhTien() {return soKW* donGia;}

}
