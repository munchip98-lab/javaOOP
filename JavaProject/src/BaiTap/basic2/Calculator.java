package BaiTap.basic2;

import ToanTu.ToanTu1;

public class Calculator {
    public static void Tong2so (int number1, int number2){
        System.out.println(number1 + number2);
    }
    public static void Nhan2so (double number3, double number4){
        System.out.println( number3 * number4);
    }

    public static void main(String[] args) {
        Calculator.Tong2so(2,5);
        Calculator.Nhan2so(1.3, 2.0);

    }
}
