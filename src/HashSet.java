import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        Set<String> set1 = new java.util.HashSet<>();
        Set<String> result;
        set.add("as");
        set.add("asfsa");
        set.add("asdsf");
        set1.add("asasdf");
        set1.add("as");
        set1.add("kfdjh");
        set1.add("asdsf");
        result = bar(set, set1);
        System.out.println(result);
    }

    public static java.util.HashSet<String> bar(Set<String> hSet, Set<String> hSet1){
        java.util.HashSet<String> res = new java.util.HashSet<>();
        Iterator<String> iter = hSet1.iterator();
        while (iter.hasNext()){
          String s = iter.next();
            if(hSet.contains(s)){
              res.add(s);
          }
        }
        return res;
    }
}