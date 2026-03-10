package TinhKeThua;

public class Student extends Person {
    private String phone;
    private String address;


    public Student(String name, int age, float height, String phone) {
        super(name, age , height); // Truyền data ngược về classs cha
        this.phone = phone;
        this.address = "Hà Nội";

    }

    public void showInfoStu(){
        System.out.println(name);
        // Dùng Super để gpji những thành phần từ class khi bị trùng với class con
        super.getInfo(); //Từ class cha Person

        getInfo(); // Từ class con Student
//        System.out.println("Phone:" + phone); // Từ class cha
//        System.out.println("Address:" + address); // Từ class con
    }


    // Ghi đè phương thức từ class cha
    public void getInfo(){
        System.out.println("Phone:" + phone); // Từ class cha
        System.out.println("Address:" + address); // Từ class con

    }

    public static void main(String[] args) {
        Student student = new Student("Phương", 30, 16.5F, "088923212");
        student.showInfoStu();
        student.getInfo();

    }
}

