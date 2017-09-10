public class Day3_4 {
    public static void main(String[] args){
        int[][] randomNumberTable = new int[6][5];
        int offset = 0;
        for(int i = 0; i < randomNumberTable.length; i++) {
            for (int k = 0; k < randomNumberTable[i].length; k++) {
                randomNumberTable[i][k] = (int) (Math.random() * 10 + offset);
            }
            offset += 10;
        }
        for(int i = 0; i < randomNumberTable.length; i++) {
            for (int k = 0; k < randomNumberTable[i].length; k++) {
                System.out.print(randomNumberTable[i][k]+" ");
            }
            System.out.println();
        }
    }
}
