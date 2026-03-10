package TinhDaHinh;

import static java.awt.SystemColor.text;

public class WebUI {

    public static void openURL(String url) {
        System.out.println("Open url:" + url);
    }
    public static void clickElement( String element){
        System.out.println("Click element:" + element) ;
    }

    public static void setText(String text){
        System.out.println("Enter text in input: " + text);
    }
    public static void setText(String text, int timeout  ) {
        System.out.println("Timeout: " + timeout);
        System.out.println("Enter text in input: " + text);
    }
    public static void setText(String key, String keys  ) {
        System.out.println("Enter text in input: " + text);
        System.out.println("Enter key: " + keys);
    }
}
