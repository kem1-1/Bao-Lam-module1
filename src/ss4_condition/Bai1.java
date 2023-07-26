package ss4_condition;

public class Bai1 {
    public static void main(String[] args) {
        /*
        1.	Tính giá trị của biến c và biến d:
                     boolean a = true&&false;
                     boolean b = (3 > 100) || (25%5 == 0)
                     boolean c = a && b;
                     boolean d = !a || b;
         */

        boolean a = true && false; // && => and // false
        boolean b = (3 > 100) || (25 % 5 == 0); // false || true => true
        boolean c = a && b; //  false && true => false
        boolean d = !a || b; // true || true => true

        System.out.println(c);
        System.out.println(d);
    }
}
