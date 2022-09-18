public class StandingPhone extends Phone implements Calling{

    public StandingPhone(String number) {
        super(number);
    }

    @Override
    public void Call(String number) {
        System.out.println("Call " + number);
    }
}
