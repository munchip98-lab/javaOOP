package VonglapFor;

public class ForBasic1 {
    public static void main(String[] args) {
        for (int i = 0; i<= 50; i+=2) {
            System.out.println("test" + i);

            if ( i == 20){
                break; // thoát vòng lặp
            }
        }
    }
}
