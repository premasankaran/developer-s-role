class logical
{
    public static void main(final String[] array) {
        final int n = 10;
        final int n2 = 5;
        final int n3 = 20;
        System.out.println(n < n2 && n < n3);
        System.out.println(n < n2 || n < n3);
        System.out.println(n > n2 && n < n3);
    }
}