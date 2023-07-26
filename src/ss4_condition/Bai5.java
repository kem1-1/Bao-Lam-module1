package ss4_condition;

public class Bai5 {
    public static void main(String[] args) {
        // 5.	Giải phương trình bậc 1 có dạng: ax + b = 0.
        double a = 0;
        double b = 2;

        if(a == 0){
            if(b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else { // b != 0
                System.out.println("Phương trình vô nghiệm");
            }
        } else { // a != 0
            System.out.println("Phương trình có nghiệm x = " + (-b/a));
        }
    }
}
