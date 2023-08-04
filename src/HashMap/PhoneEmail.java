package HashMap;

public class PhoneEmail{
    String mail;

    public PhoneEmail(String mail) {
        this.mail = mail;
    }


    public void checkMail(String s){
        String pattern = "[a-z]\\w+@[a-z]+\\.[a-z]+";
        if(s.matches(pattern)){
            System.out.println("Email correct");
        }
    }
}
