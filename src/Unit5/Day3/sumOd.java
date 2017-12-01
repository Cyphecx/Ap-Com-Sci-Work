package Unit5.Day3;

public class sumOd {
    public static void main(String[] args) {
        System.out.println(sumOdd(5,3));
    }

    public static int sumOdd(int start, int count){
        if(count == 1){
            return start;
        }
        else{
          return sumOdd(start+2, count-1)+start;
        }
    }
}
