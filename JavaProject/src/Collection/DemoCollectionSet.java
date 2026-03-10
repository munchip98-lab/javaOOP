package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {
        // Khai báo kiểu dữ liệu Set: Không lưu đc giá trị trùng lặp
        Set<String> menu = new HashSet<>();
        // Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Project");

        System.out.println("Các phần tử của Set");
        System.out.println("\t" + menu +"\n");

        //Duyệt giá trị java bằng Iterator

        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+ ",");
        }
        System.out.println("\n===============");
        //Duyệt giá trị java trong Set bằng for-each
        for (String obj: menu){
            System.out.println(obj + ",");
        }



    }
}
