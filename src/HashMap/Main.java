package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Checker> hashMap = new HashMap<>();
        hashMap.put("mail", new Mail());
        hashMap.put("phone", new PhoneNumber());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду");
        String s = scanner.nextLine().trim();
        if(!hashMap.containsKey(s)){
            System.out.println("Нет такой проверки");
            return;
        }
        System.out.println("Введите данные");
        String p = scanner.nextLine().trim();
        hashMap.get(s).check(p);
    }
}


//    phoneNumber.check(phoneNumber.phone);
//    phoneEmail.check(phoneEmail.mail);