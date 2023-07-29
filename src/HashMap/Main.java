package HashMap;

public class Main {
    public static void main(String[] args) {
        PhoneEmail phoneEmail = new PhoneEmail("chert@mail.ru");
        PhoneNumber phoneNumber = new PhoneNumber("+79110310573");
        phoneNumber.checkNumber(phoneNumber.phone);
        phoneEmail.checkMail(phoneEmail.mail);
    }
}
