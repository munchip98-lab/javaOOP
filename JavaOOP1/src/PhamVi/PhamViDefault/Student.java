package PhamVi.PhamViDefault;

import PhamVi.PhamViPrivate.Company;

public class Student {
    public static void main(String[] args) {
        School school = new School();
        school.getAuthentication();
        Company company = new Company();
       // company.address; Báo lỗi vì ngoài package
    }
}
