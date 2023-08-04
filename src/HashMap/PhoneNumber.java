package HashMap;

public class PhoneNumber{
    String phone;
    public PhoneNumber(String phone){
        this.phone = phone;
    }

    public void checkNumber(String s){
       String pattern = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$";
       if(s.matches(pattern)){
           System.out.println("phone number correct");
       }else{
           System.out.println("phone number uncorrect");
       }
    }
}
//[?]\D+\d{10}