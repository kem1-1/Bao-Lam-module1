package ss3_java_overview;

public class Bai7 {
    public static void main(String[] args) {
        // 7.	Tìm a biết:

        //a.	int i = 1, j = 1;
        //int a = i++ + j++;
        int i = 1, j = 1;
        int a = i++ + ++i - i-- - --i; // i = 1
        //     = 1  + 3  - 3  - 1
//
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 2
        System.out.println("a = " + a); // 4
    }
}
