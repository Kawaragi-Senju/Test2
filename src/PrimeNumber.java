import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> list;
        Random random = new Random();
        list = Stream.generate(() -> random.nextInt(120)).limit(100).filter((PrimeNumber::toPrime)).collect(Collectors.toList());
        System.out.println(list);
    }
    public static boolean toPrime(Integer i){
        for (int in = 2; in <= Math.sqrt(i); in++){
            if(i % in == 0){
                return false;
            }
        }
        return true;
    }
}
