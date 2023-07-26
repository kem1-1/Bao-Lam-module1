package ss3_java_overview;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //System.in: tiêu chuẩn để nhận dữ liệu từ bạn phím
        Scanner scanner = new Scanner(System.in);
        /*
        Lưu ý nhập số xong đến chuỗi thì cần thêm scanner.nextLine(); để xóa dấu enter
         */

        // Nhập vào tên - tuổi => xuất thông tin

        System.out.print("Mời bạn nhập vào tuổi: ");
//        int age = scanner.nextInt(); // 20
        int age = Integer.parseInt(scanner.nextLine()); // 20
        // Integer.parseInt chuyển chuỗi thành số
//        String numberStr = "123";
//        int a = Integer.parseInt(numberStr);
//        Double.parseDouble("12.3");
        //enter

        System.out.print("Mời bạn nhập vào tên: ");
//        scanner.nextLine();// loại bỏ dấu enter
        String name = scanner.nextLine();

        System.out.println("Tên của bạn: " + name);
        System.out.println("Tuổi của bạn: " + age);
    }
}
