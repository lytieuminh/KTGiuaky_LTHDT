public class GiaoDichDat extends GiaoDich {
    
    private int LoaiDat ;

    public GiaoDichDat(){
    }

    public GiaoDichDat(int LoaiDat){
        super();
        this.LoaiDat = LoaiDat;
        
    }
    public void setLoaiDat(int LoaiDat){
        this.LoaiDat = LoaiDat;
    }

    public int getLoaiDat(){
        return LoaiDat;
    }
    
    public void nhap(){
        super.nhap();
        System.out.println(" Vui long nhap loai dat    ");
        System.out.println(" 1: Cho loai A             ");
        System.out.println(" 2: Cho loai B             ");
        System.out.println(" 3: Cho loai C             ");
        LoaiDat = in.nextInt();
    }

    public double ThanhTien(){
        if( LoaiDat == 2 && LoaiDat == 3 ){
            return this.ThanhTien = this.dientich * this.dongia;
        }else {
            return this.ThanhTien = this.dientich * this.dongia * 1.5;
        }
    }

    public String toString()
    {   
        String select;
        if( LoaiDat == 1)
        {
            select = " loai A  ";
        }else if ( LoaiDat == 2)
        {
            select = " loai B ";
        }else if ( LoaiDat == 3)
        {
            select = " loai C  ";
        }else
        {
            select = " ban da nhap sai loai dat ";
        }
        String result = super.toString() + " |" +  " nha loai " + select + " |" + " Thanh Tien  " + ThanhTien();
        return result;
    }

}

