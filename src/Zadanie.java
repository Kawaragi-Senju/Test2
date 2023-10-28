import java.util.HashSet;

public class Zadanie {
    public static void main(String[] args) {
        final int TEN = 10;
        int[] a = {1, 4, 5, 6, 8, 5, 0, 2};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i: a){
            int x = TEN - i;
            if(hashSet.contains(x)){
                System.out.println(x + "+" +  i + " =" + TEN);
                break;
            }else{
                hashSet.add(i);
            }
        }
    }

}
