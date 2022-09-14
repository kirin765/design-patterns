package hello.designpatterns.facade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("kkk");
        emailMessage.setTo("sss");
        emailMessage.setSubject("subject");
        emailMessage.setText("dkdkdkdk");
        emailSender.sendEmail(emailMessage);
    }
}
