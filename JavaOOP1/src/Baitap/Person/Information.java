package Baitap.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Mai", 19, "Nữ", "08891212", "Hà Nội");
        person.getName();
        person.getAge();
        person.getGender();
        person.getPhone();
        person.getAddress();
        System.out.println("Tên" + person.getName());
        System.out.println("Tuổi " + person.getAge());
        System.out.println("Gioi tính " + person.getGender());
        System.out.println("Điện thoại " + person.getPhone());
        System.out.println("Địa chỉ " + person.getAddress());
    }
}
