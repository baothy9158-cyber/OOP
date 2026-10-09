package CongNhan;
import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so luong toi da cua DS: ");
        int n= Integer.parseInt(sc.nextLine().trim());
        DanhSachCongNhan dsCN= new DanhSachCongNhan(n);
        int chon;
        do{
            System.out.println("\n---------Menu----------");
            System.out.println("1. Them CN: ");
            System.out.println("2. Xuat DS: ");
            System.out.println("3. Dem so luong CN: ");
            System.out.println("4. Xuat nhung CN lam tren 20 SP: ");
            System.out.println("5. Sap xep theo so san pham giam dan ");
            System.out.println("0. Thoat");
            System.out.println("Chon chuc nang: ");
            try{
                chon= Integer.parseInt(sc.nextLine().trim());
            }
            catch (NumberFormatException o){
                chon = -1;
            }
            switch (chon){
                case 1: System.out.println("Ma CN: ");
                String ma= sc.nextLine().trim();
                System.out.println("Ho: ");
                String ho= sc.nextLine().trim();
                System.out.println("Ten: ");
                String ten= sc.nextLine().trim();
                int soSP;
                do{
                    System.out.println("So san pham(>0): ");
                    try{
                        soSP= Integer.parseInt(sc.nextLine().trim());
                    }catch (NumberFormatException e){
                        soSP= 0;
                    }
                }while (soSP<=0);
                if (dsCN.them(new CongNhan(ma, ho, ten, soSP)))
                    System.out.println("Them thanh cong");
                else System.out.println("Them that bai");
                break;

                case 2: 
                dsCN.xuat();
                break;
                case 3: 
                System.out.println("So luong CN: "+ dsCN.demSoLuong());
                break;
                case 4: 
                dsCN.xuatTren2000SP();
                break;
                case 5: 
                dsCN.sapXepGiamDan();
                System.out.println("Da nhap giam dan");
                dsCN.xuat();
                break;
                default:
                    System.out.println("Lua chon khong hop le!");

            
        }

    }while (chon!=0);
    sc.close();

}
}