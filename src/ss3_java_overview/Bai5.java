package ss3_java_overview;

public class Bai5 {
    public static void main(String[] args) {
//        5.	Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
//          •	Công thức
//              o	Chu vi: C = 2 * π * r
//              o	Diện tích: A = π * r²
        double r = 5;
        double c = 2 * Math.PI * r;
//        double a = Math.PI * r * r;
        double a = Math.PI * Math.pow(r, 2); // a ^ b
    }
}
