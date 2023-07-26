package ss4_condition;

public class Bai3 {
    public static void main(String[] args) {
        // 3.	Nhập vào 2 số nguyên, lưu vào 2 biến a và b.
        // Sau đó, đảo giá trị của 2 biến này
        // rồi xuất giá trị của chúng ra màn hình console.

        // hóa vị a và b

        int a = 2;
        int b = 3;

        // Một số động tác gì đó
//        int temp = a; //  temp = 2
//        a = b; // a = 3
//        b = temp; //b = 2

        // Hoán vị nhưng không sử dụng biến tạm
        a = a + b; // a = 2 + 3 = 5
        b = a - b; // b = 5 - 3 = 2
        a = a - b; // a = 5 - 2 = 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
