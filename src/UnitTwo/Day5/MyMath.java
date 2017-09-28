package UnitTwo.Day5;

public class MyMath {
    public static double abs(double input){
        if(input < 0){
            return -input;
        }
        else{
            return input;
        }
    }
    public static double exponent(double base, int exp){
        int output = 1;
        for(int i = 0; i <= exp; i++){
            output *= base;
        }
        return output;
    }
    public static int nearPerfect(int in){
        if(in < 1){
            return 0;
        }
        int s = MyMath.sqrtDown(in);
        if(MyMath.abs(s*s - in) < MyMath.abs((s+1)*(s+1) - in)){
            return  s*s;
        }
        else{
            return (s+1)*(s+1);
        }

    }
    public static int sqrtDown(int x){
        if(x == 1 || x == 0){
            return x;
        }
        int i = 1;
        int r = 1;
        while(r < x){
            if(x == r){
                return i;
            }
            i++;
            r = i*i;
        }
        return i-1;
    }
    public static double round(double num, int decimals){
        String con = String.valueOf(num);
        if(con.length()-2 == decimals || con.length()-2 < decimals){
            return num;
        }
        else if(Integer.parseInt(""+con.charAt(decimals+2)) < 5){
            double temp = num;
            for(int i = 0; i < decimals; i++){
                temp *= 10;
            }
            temp = (int)temp;
            for(int i = 0; i < decimals; i++){
                temp /= 10;
            }
            return temp;
        }
        else{
            double temp = num;
            for(int i = 0; i < decimals; i++){
                temp *= 10;
            }
            temp = (int)(temp)+1;
            for(int i = 0; i < decimals; i++){
                temp /= 10;
            }
            return temp;
        }
    }
}
