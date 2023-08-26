package PrimeNumbers;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long l1 = scanner.nextLong();
        System.out.println("Кол-во чисел: " + prime(l, l1));
    }

    public static long prime(long l, long l1){
       return LongStream.range(l, l1).filter(Main::toPrime).count();
    }

    public static boolean toPrime(Long i){
        for (int in = 2; in <= Math.sqrt(i); in++){
            if(i % in == 0){
                return false;
            }
        }
        System.out.println(i);
        return true;
    }
}
