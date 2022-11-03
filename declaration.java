public class declaration{
	int x=4; // Globla variable
	static int y=5;
	public int add() {
		return x+y;
	}
	public int sum() {
		int a=10; // local variable 
		int b=15;
		return a+x;
	}
public static void main(String args[]) {
	 declaration=new declaration();
	System.out.println(d.sum());//14
	System.out.println(d.add());//9
	System.out.println(y);//5
	System.out.println(d.x);//4
}
}