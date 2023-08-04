package AnonClassDz;

public class Password implements Check{
    @Override
    public void check(String s){
        String pattern = "qwerty";
        if(s.matches(pattern)){
            System.out.println("Password correct");
        }else{
            System.out.println("Password uncorrect");
        }
    }
}
