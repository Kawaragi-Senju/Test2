package AnonClassDz;

public class Phone implements Check{
    @Override
    public void check(String s){
        String pattern = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$";
        if(s.matches(pattern)){
            System.out.println("phone number correct");
        }else{
            System.out.println("phone number uncorrect");
        }
    }
}
