package Baitap.EmployeeInfo;

public class NhanVien {
    public String name;
    public int age;

    public NhanVien(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showInfo(){
        System.out.println("Tên nhân sự " + name);
        System.out.println("Tuổi " + age);
    }
}
