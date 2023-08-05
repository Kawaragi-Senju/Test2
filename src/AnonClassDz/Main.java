package AnonClassDz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hash = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип проверки:");
        String vvod = scanner.nextLine().trim();

        System.out.println("Введите то что хотите проверить:");
        String vvod1 = scanner.nextLine().trim();

        hash.put("mail", vvod1);
        hash.put("phone", vvod1);
        hash.put("password", vvod1);

        switch (vvod){
            case "mail":
                Function<String, String> mail = a ->{return String.valueOf(hash.get("mail").matches("[a-z]\\w+@[a-z]+\\.[a-z]+"));
                };
                System.out.println("Mail - " + mail.apply(vvod1));
                break;
            case "phone":
                Function<String, String> phone = f ->{return String.valueOf(hash.get("phone").matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$"));
                };
                System.out.println("Phone - " + phone.apply(vvod1));
                break;
                case "password":
                Function<String, String> password = a ->{return String.valueOf(hash.get("password").matches("[a-z]+\\w+[a-z]+[a-z]+"));
                };
                System.out.println("Password - " + password.apply(vvod1));
                break;
            default:
                System.out.println("Нет такой проверки");
        }

//        System.out.println("Mail - " + mail.apply(vvod1));
//        System.out.println("Phone - " + phone.apply(vvod1));
//        System.out.println("Password - " + password.apply(vvod1));
        //Function<String, String> mail = a ->{return String.valueOf(hash.get("mail").matches("[a-z]\\w+@[a-z]+\\.[a-z]+"));
        //                };
    }
}
