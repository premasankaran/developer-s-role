interface Sim
{
    String dailCall(final long p0);
    
    String sendSms(final long p0, final String p1);
}
class Airtel implements Sim
{
    public String dailCall(final long n) {
        return "Airtel No is not reachable";
    }
    
    public String sendSms(final long n, final String s) {
        return "Airtel message sent";
    }
}
class Vi implements Sim
{
    @Override
    public String dailCall(final long n) {
        return "Vi NO busy plz try again";
    }
    
    @Override
    public String sendSms(final long n, final String s) {
        return "Vi message sent";
    }
}

class Mobile
{
    private Sim s;
    
    public void insertSim(final Sim s) {
        this.s = s;
    }
    
    public String dailCall(final long n) {
        return this.s.dailCall(n);
    }
    
    public String sendSms(final long n, final String s) {
        return this.s.sendSms(n, s);
    }
}
class MobileUser
{
    public static void main(final String[] array) {
        final Mobile mobile = new Mobile();
        mobile.insertSim(new Airtel());
        System.out.println(mobile.dailCall(79955L));
    }
}
