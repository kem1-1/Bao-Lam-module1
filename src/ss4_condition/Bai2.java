package ss4_condition;

public class Bai2 {
    public static void main(String[] args) {
//        2.	Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
//        a.	Cách 1: Dùng if else-if.
//        b.	Cách 2: Dùng switch case

        int n = 5; //=> five

        // Cách 1: Dùng if else-if.
        if(n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("Three");
        }

        // Cách 2: Dùng switch case
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("So sánh khác");
        }
    }
}
