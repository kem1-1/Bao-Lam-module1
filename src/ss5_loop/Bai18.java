package ss5_loop;

public class Bai18 {
    public static void main(String[] args) {
        int height = 5;

//        for (int i = 1; i <= height; i++) {
//            for(int j = 1; j <= height + 1; j++) {
//               if(i == 1 || i == height || (j + i) % 2 == 0) {
//                   System.out.print("* ");
//               } else {
//                   System.out.print("  ");
//               }
//            }
//            System.out.println();
//        }
        int i = 1;
        while (i <= height) {
            int j = 1;
            while (j <= height + 1) {
                if (i == 1 || i == height || (j + i) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

//        while (true) {
//            if() {
//                break;
//            }
//        }
    }
}
