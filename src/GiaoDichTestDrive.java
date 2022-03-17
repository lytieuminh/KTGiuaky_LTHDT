import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) {
        ListGiaoDich GD = new ListGiaoDich();
        Scanner a = new Scanner(System.in);
        int key;
        do {
            System.out.println("=====================MENU======================");
            System.out.println(">>1. Them Giao Dich Dat                        ");
            System.out.println(">>2. Them Giao Dich Nha                        ");
            System.out.println(">>3. Xuat Danh Sach Giao Dich                  ");
            System.out.println(">>4. Tong So Giao Dich Tung Loai Giao Dich     ");
            System.out.println(">>5. Tien Trung binh Tu Viec Giao Dich Dat     ");
            System.out.println(">>0. Exit.                                     ");
            System.out.println("===============================================");
            System.out.print("Chọn chức năng: ");
            key = a.nextInt();
            switch(key){
                case 1: 
                    GD.ThemGD(1);
                    break;
                case 2:
                    GD.ThemGD(2);
                    break;
                case 3:
                    GD.XuatDanhSachGiaoDich();
                    break;
                case 4:
                    GD.TongSoLuongGiaoDichTungLoai();
                    break;
                case 5:
                    GD.TinhTrungBinhTienDat();
                    break;
            }
    }while(key!=0);
        System.out.println("");
    }
}

