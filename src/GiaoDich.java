import java.util.Scanner;

public class GiaoDich {
    
    protected String MaGD;
    protected String ngayGD;
    protected Double dientich;
    protected Double dongia;
    protected Double ThanhTien;
    Scanner in = new Scanner(System.in);

    protected GiaoDich(){

    }

    protected GiaoDich(String MaGD , String ngayGD ,Double dientich , Double dongia , Double ThanhTien){
        this.MaGD = MaGD;
        this.ngayGD = ngayGD;
        this.dientich = dientich;
        this.dongia = dongia;
        this.ThanhTien = ThanhTien;
        
    }
    protected void setMaGD(String MaGD){
        this.MaGD = MaGD;
    }

    protected String getMaGD(){
        return MaGD;
    }
    
    protected void setngayGD(String ngayGD){
        this.ngayGD = ngayGD;
    }

    protected String getngayGD(){
        return ngayGD;
    }

    protected void setdongia(Double dongia){
        this.dongia = dongia;
    }
    
    protected Double getdongia(){
        return dongia;
    }
    protected void setdientich(Double dientich){
        this.dientich = dientich;
    }
    
    protected Double getdientich(){
        return dientich;
    }

    protected void setThanhTien(Double ThanhTien){
        this.ThanhTien = ThanhTien;
    }
    
    protected Double getThanhTien(){
        return ThanhTien;
    }


    protected void nhap(){
        System.out.println(" Vui long Ma Giao dich               ");
        MaGD = in.nextLine();
        System.out.println(" Vui Long Nhap Ngay giao dich        ");
        ngayGD = in.nextLine();
        System.out.println(" Vui long nhap Don gia               ");
        dongia = in.nextDouble();
        System.out.println(" Vui long nhap Dien Tich             ");
        dientich = in.nextDouble();


    }

    public String toString()
    {
        String result = " Ma Giao dich   " + MaGD + " |" + " Ngay giao dich " + ngayGD + " |" + " Don gia " + dongia + " |" + " dien tich " + dientich ;
        return result;
    }

}
