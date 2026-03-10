package Arrrays;

public class Mang2 {
    public static void main(String[] args) {
        //Khai báo + gắn giá trị
        int number2 [] = {5, 7, 10, 20, 30};

        number2[2] = 100;

        System.out.println("Size:" + number2.length);

        for (int i = 0; i< number2.length; i++){
            System.out.println(number2[i]);
        }

       String dataCustomer[] = {"Hoa", "Hồng", "Huệ"};
        System.out.println(dataCustomer[0]);
        System.out.println(dataCustomer[1]);
        System.out.println(dataCustomer[2]);


    boolean check = true;
        for (int i = 0; i< dataCustomer.length; i++) {
            if (dataCustomer[i].equals("Hoa")) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
         if(check == true){
             System.out.println("Tìm thấy");
         }else {
             System.out.println("Không tìm thấy");
         }


        int dataCustomerAge[] = {25,26,27};
        System.out.println(dataCustomerAge[0]);

    }
}
