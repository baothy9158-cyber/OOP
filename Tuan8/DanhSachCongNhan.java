package CongNhan;

public class DanhSachCongNhan {
    private CongNhan[]ds;
    private int soLuong;

    public DanhSachCongNhan(int n){
        ds= new CongNhan[n];
        soLuong=0;
    }
    private int timTheoMa(String ma){
        for  (int i=0; i< soLuong; i++)
            if (ds[i].getMaCN().equalsIgnoreCase(ma))
                return i;
            return -1;
    }
    public boolean them(CongNhan cn){
        if(cn ==null || soLuong >=ds.length)
            return false;
        if (timTheoMa(cn.getMaCN())!=-1)
            return false;
        ds[soLuong++]=cn;
        return true;
    }
    public void xuat(){
        if(soLuong ==0){
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (int i=0; i <soLuong; i++)
            System.out.println(ds[i]);
    }
    public int demSoLuong(){
        return soLuong;
    }
    public void xuatTren2000SP(){
        boolean coKetQua = false;
        for (int i =0; i<soLuong; i++){
            if (ds[i].getSoSP()>200){
                System.out.println(ds[i]);
                coKetQua = true;
            }
        }
        if (!coKetQua)
            System.out.println("Không có CN nào làm trên 200 SP");
    }
    public void sapXepGiamDan(){
        for (int i= 0; i< soLuong -1; i++){
            for (int j= i+1; j<soLuong; j++){
                if(ds[i].getSoSP()< ds[j].getSoSP()){
                    CongNhan tmp= ds[i];
                    ds[i]= ds[j];
                    ds[j]=tmp;
                }
            }
        }
    }
}
