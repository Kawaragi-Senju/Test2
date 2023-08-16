import com.sun.jdi.IntegerValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class HashMapDz {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число которе хотите проверить: ");
        int integer = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Введите тип проверки: ");
        String key = scanner.nextLine().trim().toLowerCase();
        Function<Integer, Integer> fact = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer s) {
                int schet = 1;
                for(int i = 1; i <= s; i++) {
                     schet *= i;
                }
                return schet;
            }
        };
        Function<Integer, Double> exp = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer s) {
                return Math.exp(s);
            }
        };
        Function<Integer, Double> sqrt = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return Math.sqrt(integer);
            }
        };
        Function<Integer, Integer> factrec = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer s) {
              if(s == 1){
                  return 1;
              }
              return s * apply(s - 1);
            }
        };
        map.put("fact", String.valueOf(fact.apply(integer)));
        map.put("exp", String.valueOf(exp.apply(integer)));
        map.put("sqrt", String.valueOf(sqrt.apply(integer)));
        map.put("factrec", String.valueOf(factrec.apply(integer)));
        System.out.println(map.get(key));
    }

}