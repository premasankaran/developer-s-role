class Factorial
{
    public static void main(final String[] array) {
        int i = 1;
        final int j = 5;
        for (int k = 1; k <= j; ++k) {
            i *= k;
        }
        System.out.println("Factorial of " + j + " is: " + i);
    }
}