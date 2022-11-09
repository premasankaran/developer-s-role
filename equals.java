class equals
{
    public static void main(final String[] array) {
        final String s = "java programming";
        final String anObject = "java programming";
        final String anObject2 = "python programming";
        System.out.println("Strings first and second are equal: " + s.equals(anObject));
        System.out.println("Strings first and third are equal: " + s.equals(anObject2));
    }
}