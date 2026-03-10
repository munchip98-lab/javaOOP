// Hàm static - dùng để khai báo những hàm xử lí chung trong PJ để lấy cái tên class chấm gọi nhanh m không cần khởi tạo object class
// Cả biến và hàm  đều có thể lấy trên class chậm gọi nhanh mà không cần khởi tạo object class
package Static;

public class WebUI {

    public static String url = "https://drive.google.com/";
    public static String email= "ththuy@yopmail.com";
    public static String password= "12345";

    public static void openURL(String url){
        System.out.println(url);
    }

   public static void clickElement(String elementName) {
       System.out.println( "Click element:"+ elementName);
   }

   public static void setText(String text){
       System.out.println("Set text" + text);
   }

   public static String getElement(String elementName){
        return "text";
   }

   public static void main(String[] args) {
        openURL(url);
        setText(email);
        setText(password);

   }
}
