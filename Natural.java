import java.util.Scanner;
class Natural
{
    public static void main(final String[] array) {
        System.out.println("Enter The Limit:");
        final int nextInt = new Scanner(System.in).nextInt();
        System.out.println(" The First Natural Numbers are:\n");
        for (int i = 1; i <= nextInt; ++i) {
            System.out.print(" " + i);
        }
    }
}

