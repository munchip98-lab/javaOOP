package Collection;

import java.lang.module.FindException;
import java.util.*;

public class DemoColeetionArraylist {
    public static void main(String[] args) {
        // Khai báo kiểu dữ liệu, được phép lưu nhiều giá trị trùng
        List<String> menu = new ArrayList<>();


        // Thêm dữ liệu

        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Project");
        menu.add("Customer");


        // Cập nhật
        menu.add(2,"Dashboard1");
        menu.set(4, "Report");


        // Get giá trị theo chỉ mục
        System.out.println(menu.get(3));
        // Xóa dữ liệu


        // Kiểm tra dữ liệu
        System.out.println(menu.contains("Dashboard"));


        // Duyệt dữ liệu
        System.out.println("================");
        for (int i = 0; i < menu.size(); i++) {
        System.out.println(menu.get(i));
        }

        System.out.println("================");
        int j = 0;
        for (String value: menu){
            System.out.println(menu.get(j));
            j++;
        }

        System.out.println("================");
        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu); // Thêm data của menu vào menu 2

        for (int i = 0; i< menu2.size(); i++){
            System.out.println(menu2.get(i));
        }


    }
}
