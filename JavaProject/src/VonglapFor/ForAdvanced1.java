package VonglapFor; // chỉ sdụng cho mảng (array) hoặc trong collection

public class ForAdvanced1 {
    public static void main(String[] args) {
        int arr[] = { 40, 50, 60};
        for (int i: arr) {
            System.out.println(i);
        }
        for (int i=0; i< 3; i++){
            System.out.println(arr[i]);

        }
        String menu[] = { "Dashboard", "Customer", "Project"};
        for (String menuName : menu) {
            System.out.println(menuName);
        }
    }
}
