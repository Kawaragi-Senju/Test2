public class Test {
    public static void main(String[] args) {
        String string = "b";
        String string1 = "r";
        System.out.println(string + doubleS(string1));
    }
    public static String doubleS(String s){
        for(int i = 0; i < 60; i++){
            s += s;
        }
        return s;
    }
}
