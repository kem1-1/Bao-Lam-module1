package ss5_loop;

public class Bai11 {
    public static void main(String[] args) {
        // S = 1+1/3!+1/5!+…..+1/(2n-1)!
        int n = 5;
        int giaiThua = 1;
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += 1.0 / giaiThua; // 3! = 1 * 2 * 3 => i = 2
            giaiThua = giaiThua * (2 * i) * (2 * i + 1); // 3! * 4 * 5
        }

        System.out.println("sum = " + sum);
    }
}
