package Collection;

import java.sql.SQLOutput;

public class XuLiChuoi {
    public static void main(String[] args) {
        String s1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industr";
        String s2 = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";

        //Cắt chuỗi bắt đầu từ 0 , tinh khoang trang la 1 ki tu

        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6,11));

        //Ghép chuỗi
        System.out.println(s1+ " " + s2);


        // Chuyển kiểu in hoa thường

        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());


        // Xóa kí tự khaonrg trắng 2 đầu
        String s3 = "  Test";
        System.out.println(s3.trim());

        // Độ dài chuỗi
        System.out.println("Độ dài kí tự " + s2.length()); // đếm khoảng trắng

        // Tìm kiếm kí tự
        System.out.println(s1.charAt(10));

        // So sánh chuỗi:
        //So sánh bằng
        String s4= "Test Automation";
        String s5= "test Automation";
        System.out.println(s4.equals(s5));

        //So sánh chứa
        System.out.println(s4.contains("Automation"));

        // So sánh bỏ qua hoa thường
        System.out.println(s4.equalsIgnoreCase(s5));


    }
}
