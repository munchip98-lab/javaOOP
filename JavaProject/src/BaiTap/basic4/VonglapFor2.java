package BaiTap.basic4;

public class VonglapFor2 {
    public static void main(String[] args) {
// dùng array
        int number1[] = new int[26]; // Tạo mảng từ 0-50 có 26 số chẵn
        int index= 0;

        for (int a = 0; a<= 50; a+=2) { //Lưu sỗ chẵn vào mảng
            number1[index] = a; // Chuyển số a vào ô thứ index
            index++; // chuyển sang ô tiếp theo
        }
        for (int i = 0; i < number1.length; i++) { // Duyệt mảng
            System.out.println(number1[i]);
        }
    }
}
