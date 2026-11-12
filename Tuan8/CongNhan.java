package CongNhan;

public class CongNhan {
    private String maCN;
    private String ho;
    private String ten;
    private int soSP;

    public CongNhan(){
        this.maCN="";
        this.ho="";
        this.ten="";
        this.soSP=1;

    }
public CongNhan(String maCN, String ho, String ten, int soSP){
    this.maCN=maCN;
    this.ho = ho;
    this.ten=ten;
    setSoSP(soSP);
}
public String getMaCN(){return maCN;}
public void setMaCN(String maCN ){this.maCN=maCN;}

public String getHo(){return ho;}
public void setHo(String ho){this.ho=ho;}

public String getTen(){return ho;}
public void setTen(String ten){this.ten=ten;}

public int getSoSP(){return soSP;}
public void setSoSP(int soSP){
    if (soSP >0)
        this.soSP= soSP;
    else this.soSP=1;
}
public double tinhLuong(){
    double luong= 0;
    if (soSP >=1)
        luong += Math.min(soSP,199)*0.5;

    if(soSP >=200)
        luong += (Math.min(soSP, 399)-199)*0.55;

    if(soSP >=400)
        luong += (Math.min(soSP, 599)-399)*0.6;

    if(soSP >=600)
        luong+=(soSP-599)*0.65;

    return luong;

}

@Override 
public String toString(){
    return String.format("Mã:%-8s | Họ tên: %-20s| Số SP:%-5d |Lương:%.2f ",
        maCN, ho+""+ten, soSP, tinhLuong());
}
}

