class final
{
    public static void main(final String[] array) {
        int n = 25;
        int n2 = 10;
        System.out.println(n++ + ++n);
        final PrintStream out = System.out;
        final int n3 = n2;
        final int n4 = ++n2;
        ++n2;
        out.println(n3 + n4);
        System.out.println(21);
    }
}