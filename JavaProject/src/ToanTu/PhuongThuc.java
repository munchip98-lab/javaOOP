package ToanTu;

public class PhuongThuc {
    public double sum;
    public double result;

    // Hàm không trả về kết quả
    public  void cong2so() {
        int a = 5;
        int b = 10;
        int c = a + b;
        sum = a + b;
        System.out.println(sum);
    }
        //Hàm có trả về kết qua
    public double nhan2so(){
        int a = 5;
        int b = 10;
        result = a * b;
        return result;
    }
    // Hàm có tham số
    public void cong2so(int number1, int number2){
        System.out.println(number1 + number2);
    }
    public long nhan3so(int a, int b, int c){
       return a * b * c;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        // gọi lại hàm
        phuongThuc.nhan2so();
        phuongThuc.cong2so(12,14);
        System.out.println(phuongThuc.nhan3so(2,3,10)/5);
        System.out.println(phuongThuc.nhan2so() + 10);

    }
}







