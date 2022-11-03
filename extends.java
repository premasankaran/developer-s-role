class A{}
public class Test extends A {
public static void main(String args[]) {
 Test t=new Test();// object creation
 A a=new A();
System.out.println(t instanceof Test);// True
System.out.println(a instanceof Test);// false
}
}
