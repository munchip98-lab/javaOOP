public class Bien {
     String address = "Can Tho"; //Biến toàn cục (instance)
     static  String phone = "08891212"; //Biến static

    public void sayHello() {
        int n= 10; // Biến cục bộ
        System.out.println("Gía trị của n" +n);
    }
    
    public static void main(String[] args) {
        //Cách để gọi 1 thành phần trong class vào hàm bất kì
        Bien bien = new Bien();
        System.out.println(bien.address);
        System.out.println(phone);

        // Khai bao bien
        int number1 = 123;
        int number2 = 789;

        String name = "Nhung";
        String ten = "Linh";

        // In ra giá trị của biến
        System.out.println(number1);
        System.out.println(number2);
    }
}
