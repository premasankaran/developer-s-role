class sort
{
    public static void ArrSort(final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    final int n = array[i];
                    array[i] = array[j];
                    array[j] = n;
                }
            }
        }
        System.out.println();
        for (int k = 0; k < array.length; ++k) {
            System.out.print(" " + array[k]);
        }
    }
    
    public static void main(final String[] array) {
        final int[] array2 = { 55, 8, 79, 12, 92, 41, 82, 77, 65 };
        for (int i = 0; i < array2.length; ++i) {
            System.out.print(" " + array2[i]);
        }
        ArrSort(array2);
    }
}