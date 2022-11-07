public class nonstatic
{
    int x;
    
    void m() {
        System.out.println("Non-static M method");
    }
    
    nonstatic() {
        this.x = 75;
        System.out.println("non-static block");
        System.out.println("constructor");
    }
    
    public static void main(final String[] array) {
        System.out.println("main");
        final nonstatic nonstatic = new nonstatic();
        nonstatic.m();
        System.out.println(nonstatic.x);
    }
}