public class ListGiaoDich {

    GiaoDich A[] = new GiaoDich[50];
    private int Count, dem1 = 0 , dem2 = 0 , sum3 = 0 ;

    public ListGiaoDich()
    {
        Count = 0;
        for(int i =  0; i<50 ; i++)
            A[i] = new GiaoDich();
    }


    public void ThemGD( int temp)
    {
        if( Count > 50)
            System.out.println(" Khong the chua them cuoc giao dich nao nua :((   ");
    else
    {
            if ( temp ==1)
            {
                A[Count] = new GiaoDich();
                GiaoDichDat x = new GiaoDichDat();
                x.nhap();
                A[Count] = x;
                this.sum3 += x.ThanhTien();
                dem1++;

            }
            else 
            {
                A[Count] = new GiaoDich();
                GiaoDichNha y = new GiaoDichNha();
                y.nhap();
                A[Count] = y;
                dem2++;
            }
            Count++;
        }
    }

    public void XuatDanhSachGiaoDich(){
        for ( int i = 0 ; i<Count; i++){
            System.out.println("\n Don Giao Dich Thu " + (i+1));
            System.out.println(A[i].toString());
        }
    }

    public void TongSoLuongGiaoDichTungLoai(){
            System.out.println(" Tong so Giao Dich dat : " + dem1 + " giao dich ");
            System.out.println(" Tong so Giao Dich nha : " + dem2 + " giao dich ");

    }

    public void TinhTrungBinhTienDat(){
            System.out.println(" Trung binh thanh tien cua giao dich nha dat " + sum3 / dem1 );
    }
}
