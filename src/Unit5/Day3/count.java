package Unit5.Day3;

public class count {
    public static void main(String[] args) {
        System.out.println(countOccur("strinnnnnnngasles", 'n'));
    }

    public static int countOccur(String target, char let){
        if(target.length() == 1){
            if(target.charAt(0) == let){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if(target.charAt(0) == let){
            return countOccur(target.substring(1), let)+1;
        }
        else {
            return countOccur(target.substring(1), let);
        }
    }
}
