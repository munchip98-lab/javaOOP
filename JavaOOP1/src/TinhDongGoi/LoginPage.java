package TinhDongGoi;
// Che dấu 1 phn thông tin chỉ ung cấp 1 vài thông tin
// Get - cho thấy , Set - được quyền chỉnh sửa

public class LoginPage {
    private String url;
    private String email;
    private  String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        System.out.println("Open url crm");
        return url;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrlLoginAdmin(){
        return url + "/admin/authen";
    }

    public String getUrlLoginCustomer(){
        return url + "/customer/authen";
    }


    public void loginCRM(){
        System.out.println("Open url: " + getUrl());
        System.out.println("Enter email: " + getEmail());
        System.out.println("Enter password: " + getPassword());
    }

    public static void main(String[] args) {
        LoginPage loginpage = new LoginPage();

        loginpage.setUrl("https://crm.com");
        loginpage.setEmail("thuy123@yopmail.com");
        loginpage.setPassword("123");
        loginpage.loginCRM();
    }



}
