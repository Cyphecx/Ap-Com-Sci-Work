package Unit5.Day4;

public class Test {
    public static void main(String[] args){
        System.out.println(milesToGo(10, 3));
    }

    public static int reverseInt(int i){
        if((""+i).length() == 1){
            return i;
        }
        else{
            String strV = ""+i;
            return Integer.parseInt((strV.substring(strV.length()-1,strV.length())) + "" + reverseInt(Integer.parseInt(strV.substring(0,strV.length()-1))));
        }
    }
    public static int addDigits(int i){
        if((""+i).length() == 1){
            return i;
        }
        else{
            String strV = ""+i;
            return Integer.parseInt(strV.substring(strV.length()-1,strV.length())) + addDigits(Integer.parseInt(strV.substring(0,strV.length()-1)));
        }
    }

    public static double milesToGo(double DistanceToTravel, int daysElapsed) {
        if (daysElapsed == 0) {
            return DistanceToTravel;
        } else {
            return milesToGo(DistanceToTravel / 2, daysElapsed - 1);
        }
    }
}
