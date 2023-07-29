package HashMap;

public class PhoneNumber implements Pnone{
    String phone;
    public PhoneNumber(String phone){
        this.phone = phone;
    }
    @Override
    public void checkNumber(String s){
       String pattern = "\\D?+[\\d{10}]";
       if(s.matches(pattern)){
           System.out.println("phone number correct");
       }else{
           System.out.println("phone number uncorrect");
       }
    }
}
