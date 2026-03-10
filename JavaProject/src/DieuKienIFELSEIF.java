// Nhiều TH ngược lại

public class DieuKienIFELSEIF {
    public static void main(String[] args) {
        double dtb = 5;
        if (dtb > 10 || dtb <0){
            System.out.println("Không hợp lệ");
        }else {
            if(dtb>=8 && dtb <= 10){
                System.out.println("Gioi");

            } else if (dtb < 8 && dtb >6.5){
                System.out.println("Khá");

            } else if (dtb < 6.5 && dtb >=5) {
                System.out.println("TB");

            } else if (dtb < 5 && dtb > 3.5) {
                System.out.println("Yếu");

            } else {
                System.out.println(" ở lại ");

            }

        }
    }
}
