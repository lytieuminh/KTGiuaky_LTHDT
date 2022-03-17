

public class GiaoDichNha extends GiaoDich {
    private int LoaiNha;

    public GiaoDichNha(){
    }

    public GiaoDichNha(int LoaiNha ){
        super();
        this.LoaiNha = LoaiNha;
        
    }
    public void setLoaiNha(int LoaiNha){
        this.LoaiNha = LoaiNha;
    }

    public int getLoaiNha(){
        return LoaiNha;
    }
    


    public void nhap(){
        super.nhap();
        System.out.println(" Vui long Nhap Loai Nha     ");
        System.out.println(" 1 : Loai nha thuong        ");
        System.out.println(" 2 : Loai cao cap           ");
        LoaiNha = in.nextInt();
    }

    public double ThanhTien(){
        if( LoaiNha == 1 ){
            return this.ThanhTien = this.dientich * this.dongia * 0.8;
        }else{
            return this.ThanhTien = this.dientich * this.dongia;
        }
    }
    public String toString()
    {   
        String select;
        if( LoaiNha == 1)
        {
            select = " nha thuong ";
        }else if ( LoaiNha == 2)
        {
            select = " cao cap ";
        }else {
            select = " ban nhap sai loai nha !!! ";
        }
        
        String result = super.toString() + " |" +  " Loai Nha  " + select + " |" + " Thanh Tien " + ThanhTien();
        return result;
    }

}

