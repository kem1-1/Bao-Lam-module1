package ss5_loop;

public class Bai2 {
    public static void main(String[] args) {
        int n = 10;
//        for (int i = 1; i <= n; i++) {
//            if(i % 2 == 1) {
//                System.out.print(i + "\t");
//            }
//        }
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            if (count == 1) {
                System.out.print(-i + "\t");
                count = 0;
            } else {
                System.out.print(i + "\t");
                count++; // count = 1
            }
        }
    }
}
