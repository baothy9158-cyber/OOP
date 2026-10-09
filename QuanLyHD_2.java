package khackHang;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class QuanLyHD_2 {
	public static void main(String[]args) {
		ListQuanLy<KH> ql= new ListQuanLy<>();
		ql.themNhieu(
				new KhachHangVN("VN01", "Nguyen Van A",
						LocalDate.of(2018, 9, 10),100, 1500, "sinh hoat",50),
				new KhachHangVN("VN02", "Tran Thi B",
						LocalDate.of(2018, 10, 5),200, 2000,"kinh doanh",100),
				new KhachHangVN("VN03", "Le Van C",
						LocalDate.of(2019, 1, 20), 80, 1800,"san xuat",60),
				new KhachHangNuocNgoai("N01", "John Smith",
						LocalDate.of(2018, 9, 25),150, 2500, "My"),
				new KhachHangNuocNgoai("NN01","YuKi Tanaka",
						LocalDate.of(2018, 8, 15), 120, 3000, "Nhat"),
				new KhachHangNuocNgoai("NN02", "Kim Min Su",
						LocalDate.of(2019, 3, 8), 90, 2800, "Han")
		
				);
		
		System.out.println("VN:"+ql.dem(kh->kh instanceof KhachHangVietNam));
		System.out.println("NN:"+ql.dem(kh->kh instanceof KhachHangNuocNGoai));
	}


}
