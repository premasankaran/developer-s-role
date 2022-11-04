class pass
{
    static void min(final int[] array) {
        int i = array[0];
        for (int j = 0; j < array.length; ++j) {
            if (i > array[j]) {
                i = array[j];
            }
        }
        System.out.println("Min element: " + i);
    }
    
    static void max(final int[] array) {
        int i = array[0];
        for (int j = 0; j < array.length; ++j) {
            if (i < array[j]) {
                i = array[j];
            }
        }
        System.out.print("Big element: " + i);
    }
    
    public static void main(final String[] array) {
        final int[] array2 = { 55, 8, 79, 12, 92, 41, 82, 77, 65 };
        System.out.println("Length of the array: " + array2.length);
        min(array2);
        max(array2);
    }
}