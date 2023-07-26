package ss3_java_overview;

public class Main2 {
    public static void main(String[] args) {
//        int a = 2;
        // tăng a lên 5 đơn vị
//        a = a + 5;
//        a += 5;

//        System.out.println(a);

        /*
        ++ --: toán tử tăng giảm 1 đơn vị
        a++/a--: hậu tố => thay đổi sau
        ++a:  --a: tiền tố => thay đổi trước
         */
//        int i = 2;
//        int a = ++i + ++i; // i = 4
//             // 3   + 4
//
//        System.out.println("i = " + i);
//        System.out.println("a = " + a);

        int a = 2;
        a += a++ + ++a;
         // a + a++ + ++a // a = 4
         // 2 + 2 + 4
        System.out.println(a);
    }
}
