package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // 1.	Nhập năm sinh của một người. Tính tuổi người đó.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào năm sinh của bạn: ");
        int year = scanner.nextInt();
        int currentYear = Year.now().getValue();

        System.out.println("Tuổi của bạn là: " + (currentYear - year));
    }
}
