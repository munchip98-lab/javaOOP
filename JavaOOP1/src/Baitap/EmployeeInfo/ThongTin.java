package Baitap.EmployeeInfo;

import java.sql.SQLOutput;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien("Hoa", 14) ;
        NhanVien nhanvien2 = new NhanVien("Thường", 15);

        nhanvien1.showInfo();
        nhanvien2.showInfo();

    }
}
