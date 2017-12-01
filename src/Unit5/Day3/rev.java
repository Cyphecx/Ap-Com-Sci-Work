package Unit5.Day3;

public class rev {
    public static void main(String[] args) {
        System.out.println(reverse("Stars"));
    }

    public static String reverse(String s){
        if(s.length() == 1){
            return s;
        }
        else{
            return s.substring(s.length()-1) + reverse(s.substring(0,s.length()-1));
        }
    }
}
