package ss3_java_overview;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        2.	Nhập 2 số a và b. Tính tổng, hiệu, tính và thương của hai số đó.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập vào b: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + (a / b));
    }
}
