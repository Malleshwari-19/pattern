public class Syemmeticpattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            if (i == 2) {

                for (int j = 1; j <= 5; j++) {
                    System.out.print("* ");
                }
            } else {

                System.out.print("  *   *  ");
            }
            System.out.println();
        }
    }

}
