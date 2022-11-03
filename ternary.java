class ternary
{
    public static void main(final String[] array) {
        final int n = 85;
        final int n2 = 34;
        final int n3 = 60;
        final int i = n + n2 + n3;
        final double d = i / 3;
        System.out.println("Total marks: " + i);
        System.out.println("Average of the Student:" + d);
        final String x = (n >= 35 && n2 >= 35 && n3 >= 35) ? "Passed" : "Failed";
        System.out.println((d > 90.0) ? "A" : ((d > 75.0) ? "B" : ((d > 50.0) ? "C" : "D")));
        System.out.println(x);
    }
}