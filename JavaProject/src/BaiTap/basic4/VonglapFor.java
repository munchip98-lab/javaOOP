package BaiTap.basic4;

import java.util.ArrayList;
import java.util.List;

public class VonglapFor {
    public static void main(String[] args) {
        List<Integer> soChan = new ArrayList<>(); // Add giá tr, dùng vòng lặp for để tìm ra số chẵn

        for (int a = 0; a <= 50; a += 2) {
            soChan.add(a);
        }

        for (int a = 0; a < soChan.size(); a++) {
            System.out.println(soChan.get(a));
        }
    }
}