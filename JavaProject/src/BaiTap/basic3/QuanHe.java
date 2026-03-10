package BaiTap.basic3;


public class QuanHe {
// Khai báo bin
    int a = 10;
    int b = 12;
    double c = 12.2;

    static int number = 100; // Khai báo biến cố định number =100

    public static void BienCoDinh(int n) { //Tạo hàm truyền tham số int n
        if (n == number) {
            System.out.println("Bằng nhau");
        } else if (n < number) {
            System.out.println("Nhỏ hơn");
        } else {
            System.out.println("Lớn hơn");
        }
    }
        // goi xuống hàm main để truyền giá trị chạy và kiểm tra
 public static void main(String[] args) {
        //tao obj trong class vào hàm main
        QuanHe rela = new QuanHe();
        System.out.println("So sánh a=c: " + (rela.a == rela.c));
        System.out.println("So sánh a<b: " + (rela.a < rela.b));
        System.out.println("So sánh a>b: " + (rela.a > rela.b));
        System.out.println((rela.a>rela.b) && (rela.b>rela.c)); // so
        System.out.println((rela.a>rela.b) || (rela.b>rela.c)); // so sánh hoăc
        System.out.println("===========================");
        BienCoDinh(100);
        BienCoDinh(200);
    }

}
