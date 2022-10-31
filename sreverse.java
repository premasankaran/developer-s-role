public class sreverse
{
    public static void main(final String[] array) {
        final String x = "make use of time";
        System.out.println(x);
        final String[] split = x.split("");
        for (int i = split.length - 1; i >= 0; --i) {
            System.out.print(split[i] + " ");
        }
    }
}