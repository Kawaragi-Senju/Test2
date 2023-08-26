import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> list;
        Random random = new Random();
        long l = IntStream.range(2, 90).filter(PrimeNumber::toPrime).count();
    }
    public static boolean toPrime(Integer i){
        for (int in = 2; in <= Math.sqrt(i); in++){
            if(i % in == 0){
                return false;
            }
        }
        System.out.println(i);
        return true;
    }

}
//random.nextInt(120)).limit(100).filter((PrimeNumber::toPrime)).collect(Collectors.toList());