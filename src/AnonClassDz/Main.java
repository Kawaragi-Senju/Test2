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

        Function<String, String> fun = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return String.valueOf(vvod1.matches("[a-z]\\w+@[a-z]+\\.[a-z]+"));
            }
        };
        Function<String,Check> fun1 = new Function<String, Check>() {
            @Override
            public Check apply(String s) {
                return null;
            }
        };
        fun.apply(vvod1);
    }
}
