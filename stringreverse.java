public class stringreverse
{
    public static void main(final String[] array) {
        System.out.println("How are you");
        final String[] split = "How are you".split("");
        for (int i = split.length - 1; i >= 0; --i) {
            System.out.print(split[i] + " ");
        }
    }
}