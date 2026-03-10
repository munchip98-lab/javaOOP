package Arrrays;

public class Mang1 {
    public static void main(String[] args) {
        //Khai báo
        int number1[] = new int[5];
        // GĂN GIÁ TRỊ CHO MẢNG

        number1[0] = 40;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 5;
        number1[4] = 10;

        System.out.println( "Độ dài mảng: " + number1.length);
        System.out.println(number1[4]); // Truy xuất dữ liệu 1 phẩn tử mảng

        //DUYỆT MẢNG ĐỂ LẤY GIÁ TRỊ
        System.out.println("===============");
        for (int i = 0; i < number1.length; i++){
            System.out.println(number1[i]);
        }

        // for cơ bản lấy được khoảng
        System.out.println("===============");
        for (int i = 2; i < 5; i++){
            System.out.println(number1[i]);
        }
        // for cải tiến chạy từ đấu đến cuối
        System.out.println("===============");
        for (int number : number1){
            System.out.println(number);
        }
    }
}
