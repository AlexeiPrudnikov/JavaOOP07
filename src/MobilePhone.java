public class MobilePhone extends Phone implements Calling, SendingSMS{

    public MobilePhone(String number) {
        super(number);
    }

    @Override
    public void Call(String number) {
        System.out.println("Call " + number);
    }

    @Override
    public void sendSMS(String number, String text) {
        System.out.println("Send SMS to " + number + " : " + text);
    }
}
