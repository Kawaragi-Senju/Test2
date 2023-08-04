package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<Phone, String> HMap = new HashMap<>();
//        HMap.put("chert@mail.ru", );
        PhoneEmail phoneEmail = new PhoneEmail("chert@mail.ru");
        PhoneNumber phoneNumber = new PhoneNumber("891104567");
        phoneNumber.checkNumber(phoneNumber.phone);
        phoneEmail.checkMail(phoneEmail.mail);
    }
}
