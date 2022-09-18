public class Fax extends StandingPhone implements Calling, SendingFax{
    public Fax(String number) {
        super(number);
    }

    @Override
    public void sendFax(String number, String text) {
        System.out.println("Send fax to "+ number + " : " + text);
    }
}
