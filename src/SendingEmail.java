import java.util.ArrayList;

public interface SendingEmail extends Sending{
    public void sendEmail(String email, String text, ArrayList files);
}
