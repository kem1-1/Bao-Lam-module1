package ss3_java_overview;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // 4.	Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh.
        // Tính điểm trung bình của học sinh đó.
        Scanner scanner = new Scanner(System.in);
        /*
        Toán hệ số 3
        Lý hệ số 2
        Hóa hệ số 1

        (Toán * 3 + Lý * 2 + Hóa *1) / (3 +  2 + 1) =>DTB
         */

        System.out.print("Nhập vào điểm toán: ");
        double diemToan = scanner.nextDouble();

        System.out.print("Nhập vào hệ số toán: ");
        double hsToan = scanner.nextDouble();

        System.out.print("Nhập vào điểm lý: ");
        double diemLy = scanner.nextDouble();

        System.out.print("Nhập vào hệ số lý: ");
        double hsLy = scanner.nextDouble();

        System.out.print("Nhập vào điểm hóa: ");
        double diemHoa = scanner.nextDouble();

        System.out.print("Nhập vào hệ số hóa: ");
        double hsHoa = scanner.nextDouble();

        double diemTB = (diemToan * hsToan + diemLy * hsLy + diemHoa * hsHoa) / (hsToan + hsLy + hsHoa);

        System.out.println("Điểm TB: " + diemTB);
    }
}
