package AnonClassDz;

public class Mail implements Check{

    @Override
    public void check(String s) {
        String pattern = "[a-z]\\w+@[a-z]+\\.[a-z]+";
        if(s.matches(pattern)){
            System.out.println("Email correct");
        }else{
            System.out.println("Email uncorrect");
        }
    }
}
