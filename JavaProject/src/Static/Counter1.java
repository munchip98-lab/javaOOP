package Static;

// Bien static dùng để khai bao nhung bien luu gia tri chung cho ca project
public class Counter1 {
    static int count = 0; // sẽ lấy bộ nhớ mới khi khởi tạo lại class hoặc gọi lại biế này

    Counter1() {
        count++; // Count + 1
        System.out.println(count);
    }


    public static void main(String args[]) {

        Counter1 c1 = new Counter1(); // Khởi tạo lần 1 => count = 1
        Counter1 c2 = new Counter1(); // Khởi tạo lần 2 => count = 2
        Counter1 c3 = new Counter1(); // Khởi tạo lần 3

    }
}
// Hàm static - dùng để khai báo những hàm xử lí chung trong PJ để lấy cái tên class chấm gọi nhanh m không cần khởi tạo object class