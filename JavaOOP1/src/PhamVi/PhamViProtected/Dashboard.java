package PhamVi.PhamViProtected;

import PhamVi.Common.BasePage;

public class Dashboard extends BasePage { //Kế thừa class BasePage
    public void getDriver(){
        System.out.println(driver);
    }
    public static void main(String[] args) {
        Login login = new Login();
        // Trong package: gọi được
        System.out.println(login.inputEmail);
        System.out.println(login.inputPassword);

        // Ngoài package : không gọi được vì khác package
        //BasePage basePage = new BasePage();
        //BasePage.driver;





    }
}
