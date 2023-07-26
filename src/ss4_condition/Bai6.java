package ss4_condition;

public class Bai6 {
    public static void main(String[] args) {
        // 6.	Giải phương trình bậc 2 có dạng: a𝑥2 + bx + c = 0.

        double a = 2;
        double b = 3;
        double c = 4;

        if (a == 0) {
            //Phương trình bậc nhất bx + c = 0 => x = -c/b
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else { // c != 0
                    System.out.println("Phương trình vô nghiệm");
                }
            } else { // b != 0
                System.out.println("Phương trình có nghiệm x = " + (-c / b));
            }
        } else { // a!= 0
            // delta
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                // 1 nghiệm: -b/2a
                System.out.println("Phương trình có nghiệm x = " + -b / (2 * a));
            } else {
                // 2 nghiệm
                // (-b +- can(delta))/2a
                System.out.println("Phương trình có 2 nghiệm");
                System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}
