public class multid
{
    public static void main(final String[] array) {
        final int[][] array2 = { { 1, 2, 3 }, { 4, 1, 3 } };
        final int[][] array3 = { { 1, 2, 3 }, { 4, 1, 3 } };
        final int[][] array4 = new int[2][3];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                array4[i][j] = array2[i][j] + array3[i][j];
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
    }
