public class DiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        // Top part
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom part
        for (int i = 4; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}