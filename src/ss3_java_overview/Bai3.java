package ss3_java_overview;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        3.	Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
//        a. tiền = số lượng * đơn giá
//        b. thuế giá trị gia tăng = 10%
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên sản phẩm: ");
        String tenSP = scanner.nextLine();

        System.out.print("Nhập vào số lượng: ");
        double soLuong = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập vào giá: ");
        double gia = Double.parseDouble(scanner.nextLine());

        double tien = soLuong * gia;
        double thue = tien * 0.1;

        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Tiền: " + tien);
        System.out.println("Thuế: " + thue);
    }
}
