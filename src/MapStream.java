import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("sfa", "dsfg");
        map.put("sa", "dshfg");
        map.put("fa", "drsfg");
        map.put("a", "qsfg");
        List<String> sr = map.entrySet().stream().flatMap((Map.Entry<String, String> entr) -> Stream.of((entr.getKey()), entr.getValue())).collect(Collectors.toList());
        List<Stud> studList = new ArrayList<>();
        studList.add(new Stud("msfa", "architector"));
        studList.add(new Stud("msfasaf", "architector"));
        studList.add(new Stud("safqfv", "programmer"));
        studList.add(new Stud("safvrrw", "programmer"));
        studList.add(new Stud("safffv", "programmer"));
        studList.add(new Stud("asflc", "builder"));
        studList.add(new Stud("35hsgte", "builder"));
        studList.add(new Stud("3rds", "builder"));
        studList.add(new Stud("v665sdf", "manager"));
        List<String> s = studList.stream().map((Stud se) -> se.getSpecialization()).sorted().collect(Collectors.toList());
        Map<String, List<Stud>> studMap = studList.stream().collect(Collectors.groupingBy(Stud::getSpecialization));
        studMap.entrySet().stream().forEach((Map.Entry<String, List<Stud>> par) -> {
            System.out.println(par.getKey() + " :" + par.getValue().size());});
    }
}