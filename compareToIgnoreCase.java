class compareToIgnoreCase
{
    public static void main(final String[] array) {
        final String str = "Learn Java";
        final String str2 = "learn java";
        final String str3 = "Learn python";
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str));
    }
}