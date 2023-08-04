package Anoncalss;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String s1 = "qwerty";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals(s1);
            }
        };
        if (predicate.test(s)) {
            System.out.println("Correct");
        } else {
            System.out.println("Uncorrect");
        }

        Predicate<String> pred = a -> {
            return s.equals(s1);
        };
        System.out.println(pred.test(s));
    }
}