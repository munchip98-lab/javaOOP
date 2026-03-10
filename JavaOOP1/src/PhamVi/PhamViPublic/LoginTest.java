package PhamVi.PhamViPublic;

import PhamVi.PhamViProtected.Login;

public class LoginTest {
    public static void main(String[] args) {
        // Ngoài class
        Config config = new Config();
        System.out.println(config.Browser);

        //Ngoài package
        Login login = new Login();
        System.out.println(login.buttonLogin);

    }
}
