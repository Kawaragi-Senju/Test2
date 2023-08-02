package HashMap;

public class PhoneNumber implements Pnone{
    String phone;
    public PhoneNumber(String phone){
        this.phone = phone;
    }
    @Override
    public void checkNumber(String s){
       String pattern = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
       if(s.matches(pattern)){
           System.out.println("phone number correct");
       }else{
           System.out.println("phone number uncorrect");
       }
    }
}
//[?]\D+\d{10}