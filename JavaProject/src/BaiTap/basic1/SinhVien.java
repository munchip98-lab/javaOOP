package BaiTap.basic1;

public class SinhVien {
    // bien static
    public static String truong ="Dai hoc Thuong Mai";

    // Bien instance
    String ten;
    int tuoi;

    // bien local
    public void ThongTin1 (){
        String NienKhoa = "2022";

        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nien Khoa: " + NienKhoa);
        System.out.println("Truong: " + truong);
        System.out.println("Địa chỉ " + ThongTin.address);
        System.out.println("Quản lý " + ThongTin.ownerby);
    }
// Hàm main
public static void main(String[] args) {
        // Truy cập static theo class
        System.out.println("Truong: " + SinhVien.truong);

        //Tạo object do biến ten, tuoi không phải là biến static
        SinhVien sv1 = new SinhVien();
        sv1.ten= "Pham Van A";
        sv1.tuoi= 20;


        SinhVien sv2 = new SinhVien();
        sv2.ten= "Pham Van B";
        sv2.tuoi= 22;

        // Gọi instance theo method => in ra 3 biến instance local static
    sv1.ThongTin1();
    sv2.ThongTin1();

}

}
