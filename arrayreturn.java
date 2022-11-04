public class arrayreturn
{
    static int[] get() {
        return new int[] { 17, 52, 6, 9, 28 };
    }
    
    public static void main(final String[] array) {
        final int[] value = get();
        for (int length = value.length, i = 0; i < length; ++i) {
            System.out.print(" " + value[i]);
        }
    }
}