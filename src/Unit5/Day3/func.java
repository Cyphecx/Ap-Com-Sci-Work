package Unit5.Day3;

public class func {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            System.out.println(func(i));
        }
    }

    public static int func(int num){
        if(num ==1){
            return 3;
        }
        else{
            return func(num-1)*3 -5;
        }

    }
}
