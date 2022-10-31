public class transpose
{
    public static void main(final String[] array) {
        final int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        final int[][] array3 = new int[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                array3[i][j] = array2[j][i];
            }
        }
        System.out.println("Printing Matrix without transpose:");
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 3; ++l) {
                System.out.print(array2[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int n = 0; n < 3; ++n) {
            for (int n2 = 0; n2 < 3; ++n2) {
                System.out.print(array3[n][n2] + " ");
            }
            System.out.println();
        }
    }
}