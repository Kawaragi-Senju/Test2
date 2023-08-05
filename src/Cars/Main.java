package Cars;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String s1 = "Toyota";
        Function<String, Cars> function = (String s) -> {
            if ("Toyota".equals(s1)) {
                return new Toyota();
            } else {
                return new BMW();
            }
        };
        function.apply(s1).showLable();
    }
}
