package switchcase;
public class SwitchCase1 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 10:
            System.out.println("10");
            break;

            case 20:
            System.out.println("20");
            break;

            default:
                System.out.println("Not in 10,20 or 30");


        }
        String browser = "Chrome";
        switch (browser.toLowerCase().trim()) { // Chuyển chuỗi về chữ thường
            case "chrome":
            System.out.println(" chạy test chrome");

            default:
                System.out.println( "Mặc định");
        }



    }
}
