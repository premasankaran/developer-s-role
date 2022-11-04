class array
{
    static void min(final int[] array) {
        int i = array[0];
        for (int j = 1; j < array.length; ++j) {
            if (i > array[j]) {
                i = array[j];
            }
        }
        System.out.println("Minimum value in array: " + i);
    }
    
    static void evenNo(final int[] array) {
        System.out.println("Even Numbers:");
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    
    static void oddNo(final int[] array) {
        System.out.print("Odd Numbers:");
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
    
    static void primeNo(final int[] array) {
        boolean b = false;
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i] / 2;
            if (array[i] == 0 || array[i] == 1) {
                System.out.println(array[i] + " is not prime number");
            }
            else {
                for (int j = 2; j <= n; ++j) {
                    if (array[i] % j == 0) {
                        System.out.println(array[i] + " is not prime number");
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    System.out.println(array[i] + " prime number");
                }
            }
        }
    }
    
    public static void main(final String[] array) {
        final int[] array2 = { 98, 54, 21, 7, 85 };
        for (int i = 0; i < 5; ++i) {
            System.out.println(" " + array2[i]);
        }
        min(array2);
        evenNo(array2);
        oddNo(array2);
        primeNo(array2);
    }
}
