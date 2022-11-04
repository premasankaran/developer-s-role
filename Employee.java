public class Employee
{
    int eid;
    String ename;
    String city;
    
    Employee(final int eid, final String ename, final String city) {
        this.eid = eid;
        this.ename = ename;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return this.eid + " " + this.ename + " " + this.city;
    }
    
    public static void main(final String[] array) {
        final Employee x = new Employee(100, "prema", "chennai");
        final Employee x2 = new Employee(101, "vidhya", "theni");
        System.out.println(x);
        System.out.println(x2);
    }
}