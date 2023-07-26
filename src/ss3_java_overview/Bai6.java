package ss3_java_overview;

public class Bai6 {
    public static void main(String[] args) {
        // 6.	Nhập vào số xe của bạn (gồm tối đa 5 chữ số, mặc định đầu vào đúng).
        // Cho biết số xe của bạn được mấy nút?
        // 23456 =>2 + 3 + 4 + 5 + 6 =>  20 => 0 điểm

        int n = 23456; // Cho người dùng nhập vào
        int sum = n % 10; // sum = 6
        n = n / 10; // 2345

        sum = sum + n % 10; //sum = 11
        n = n / 10; // 234

        sum = sum + n % 10; //sum = 15
        n = n / 10; // 23

        sum = sum + n % 10; //sum = 18
        n = n / 10; // 2

        sum = sum + n; //sum = 20

        System.out.println("Sum = " + sum % 10);



    }
}
