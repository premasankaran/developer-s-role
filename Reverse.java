 public class Reverse
{
    public static void main(final String[] array) {
        int i = 987654;
        int j = 0;
        while (i != 0) {
            j = j * 10 + i % 10;
            i /= 10;
        }
        System.out.println("The reverse of the given number is: " + j);
    }
}