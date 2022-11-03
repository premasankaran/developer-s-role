class variable
{
    static int x;
    
    void m() {
        System.out.println(75);
    }
    
    public static void main(final String[] array) {
        final v v = new v();
        final int x = 200;
        System.out.println(variable.x);
        System.out.println(x);
        v.m();
    }
    
    static {
        variable.x = 100;
    }
}