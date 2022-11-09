class equalsIgnoreCase
{
    public static void main(final String[] array) {
        final String anotherString = "Learn Java";
        final String anotherString2 = "learn java";
        final String anotherString3 = "Learn Kolin";
        System.out.println((Object)anotherString.equalsIgnoreCase(anotherString2));
        System.out.println((Object)anotherString.equalsIgnoreCase(anotherString3));
        System.out.println((Object)anotherString3.equalsIgnoreCase(anotherString));
    }
}