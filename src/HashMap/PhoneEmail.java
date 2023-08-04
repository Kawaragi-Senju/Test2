package HashMap;

public class PhoneEmail implements Checker{
    String mail;

    public PhoneEmail(String mail) {
        this.mail = mail;
    }
    @Override
    public void check(String s) {
        String pattern = "[a-z]\\w+@[a-z]+\\.[a-z]+";
        if(s.matches(pattern)){
            System.out.println("Email correct");
        }
    }
}
