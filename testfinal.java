public class Test
{
    int x;
    static int y;
    
    public Test() {
        this.x = 4;
    }
    
    public int add() {
        return this.x + Test.y;
    }
    
    public int sum() {
        return 10 + this.x;
    }
    
    public static void main(final String[] array) {
        final Test test = new Test();
        System.out.println(test.sum());
        System.out.println(test.add());
        System.out.println(Test.y);
        System.out.println(test.x);
    }
    
    static {
        Test.y = 5;
    }
}