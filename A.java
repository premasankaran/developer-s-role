class A
{
    public static void main(final String[] array) {
        final int i = 75 + 95 + 50;
        final double d = i / 3;
        System.out.println("Total marks: " + i);
        System.out.println("Average of the Student:" + d);
        if (d > 90.0) {
            System.out.println("A");
        }
        else if (d > 75.0) {
            System.out.println("B");
        }
        else if (d > 50.0) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}