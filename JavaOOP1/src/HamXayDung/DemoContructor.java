package HamXayDung;
// Khong tham số
public class DemoContructor {
    public String name;
    public String phone;
public static String address = "Hanoi";


    public DemoContructor(){
        name = "Hoa Phùng";
        phone = "088921112";
    }


    public static void main(String[] args) {
        DemoContructor contructor= new DemoContructor();
        System.out.println(contructor.name);
        System.out.println(contructor.phone);
    }
}
