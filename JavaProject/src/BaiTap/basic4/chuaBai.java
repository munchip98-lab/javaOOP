package BaiTap.basic4;

public class chuaBai {
    public static void main(String[] args) {

        int mang1[] = new int[26]; // khởi tạo mảng
        int index = 0;

        for (int a = 0; a <= 50; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
                mang1[index] = a; //GÁN GIÁ TRỊ SỐ CHẴN VÀO MẢNG TRÍ MẢNG TUẦN TỰ
                index ++; // tăng chỉ mục lên 1 đơn vị
            }
        }

        for (int value: mang1){
            System.out.println(value );
        }
    }
}


