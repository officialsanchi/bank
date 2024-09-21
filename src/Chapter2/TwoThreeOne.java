package Chapter2;

public class TwoThreeOne {
    public static void main(String[] args) {
        System.out.println("");
        int cube = 0;
        int square = 0;
        for(int count = 0; count < 10; count++) {
             cube = count * count;
             square = cube  * 3;
             System.out.println(count);

        }
        System.out.println(cube);
        System.out.println(square);

    }
}
