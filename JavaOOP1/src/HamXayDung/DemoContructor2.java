package HamXayDung;

import java.sql.SQLOutput;

public class DemoContructor2 {
    //Có tham số
    public String name;
    public String phone;
    public DemoContructor2 (String name, String phone){
        this.name = name;
        this.phone = phone;

    }

    public static void main(String[] args) {
        DemoContructor2 contructor2 = new DemoContructor2("Mai","08892323");
        System.out.println(contructor2.name);
        DemoContructor2 contructor3 = new DemoContructor2("Hoa","08892321");
        System.out.println(contructor3.name);
    }
}
