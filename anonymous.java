public class anonymous
{
    static void printArray(final int[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            System.out.print(" " + array[i]);
        }
    }
    
    public static void main(final String[] array) {
        printArray(new int[] { 10, 25, 46, 95, 78 });
    }
}