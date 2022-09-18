import java.util.ArrayList;

public class Smartphone extends MobilePhone implements SendingEmail{
    public Smartphone(String number) {
        super(number);
    }

    @Override
    public void sendEmail(String email, String text, ArrayList files) {
        // Отправка email
    }
}
