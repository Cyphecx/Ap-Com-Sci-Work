package UnitOne.Day4;

        import java.util.*;

public class Day4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter six doubles.");
        double[] dubs = new double[6];
        for (int i = 0; i < dubs.length; i++) {
            dubs[i] = scan.nextDouble();
        }
        System.out.println("true for ascending false for descending");
        boolean order = scan.nextBoolean();
        sortArray(dubs,order);
        for(double x : dubs){
            System.out.println(x);
        }
    }

    private static void sortArray(double[] x, boolean y) {
        if (y) {
            Arrays.sort(x);
        }
        else {
            for(int i = 0; i < x.length; i++){
                x[i] = x[i] * -1;
            }
            Arrays.sort(x);
            for(int i = 0; i < x.length; i++){
                x[i] = x[i] * -1;
            }
        }
    }
}
