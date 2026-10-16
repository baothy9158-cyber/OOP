package qlsv;

import java.time.LocalDate;

public class SinhVienTX extends SinhVien{
	private String nenTang;

	public SinhVienTX(String maSV, String hoTen, LocalDate ngaySinh,
			String lop, int soTinChi, MonHoc monHoc) {
		super(maSV, hoTen, ngaySinh, lop, soTinChi, monHoc);
		this.nenTang= nenTang;
	}

	public String getNenTang() {
		return nenTang;
	}

	public void setNenTang(String nenTang) {
		this.nenTang = nenTang;
	}

	@Override
	public String getLoai() {
		// TODO Auto-generated method stub
		return "Tu xa" ;
	}

	@Override
	public String getThongTinRieng() {
		// TODO Auto-generated method stub
		return "Hoc online qua: "+ nenTang;
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return super.thanhTien()*0.9;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+""+getThongTinRieng();
	}
	

}
