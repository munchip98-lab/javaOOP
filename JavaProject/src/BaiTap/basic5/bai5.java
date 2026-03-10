package BaiTap.basic5;
import java.util.ArrayList;
import java.util.List;

public class bai5 {
    private static List<String> addEmployee(String name, String age, String job_title) {
        ArrayList<String> employeeinfo = new ArrayList<>();
        employeeinfo.add(name);
        employeeinfo.add(age);
        employeeinfo.add(job_title);
        return employeeinfo;
    }

    public static void main(String[] args) {
        ArrayList<Integer> mang1 = new ArrayList<>(); // Add giá tr, dùng vòng lặp for để tìm ra số chẵn
        for (int a = 0; a <= 50; a++) {
            if (a % 2 == 0) {
                mang1.add(a);
            }
        }
        // duyệt giá trị trong mảng arraylist
        for (int x : mang1) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("==============");
        List<String> employee = addEmployee(
                "Phuong",
                "30",
                "Tester"
        );

        for (String value: employee){
            System.out.println(value);
        }




    }
}
