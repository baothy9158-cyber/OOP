package qlsv;
import java.time.LocalDate;

public class SinhVienCQ extends SinhVien {
	public SinhVienCQ(String maSV, String hoTen, LocalDate ngaySinh,
			String lop, int soTinChi, MonHoc monHoc) {
		super(maSV, hoTen, ngaySinh, lop, soTinChi, monHoc);
		this.hocTrucTiep= hocTrucTiep;
		//t TODO Auto-generated constructor stub
	}

	private String hocTrucTiep;
	
	public String getHocTrucTiep() {
		return hocTrucTiep;
	}

	public void setHocTrucTiep(String hocTrucTiep) {
		this.hocTrucTiep = hocTrucTiep;
	}

	@Override
	public String getLoai() {
		// TODO Auto-generated method stub
		return "Chinh quy";
	}

	@Override
	public String getThongTinRieng() {
		// TODO Auto-generated method stub
		return "Hoc truc tiep tai" + hocTrucTiep;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ ""+getThongTinRieng();
	}
	

}
