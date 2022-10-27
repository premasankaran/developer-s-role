public class Prime
{
    public static void main(final String[] array) {
        boolean b = false;
        final int i = 3;
        final int n = i / 2;
        if (i == 0 || i == 1) {
            System.out.println(i + " is not prime number");
        }
        else {
            for (int j = 2; j <= n; ++j) {
                if (i % j == 0) {
                    System.out.println(i + " is not prime number");
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.println(i + " is prime number");
            }
        }
    }
}