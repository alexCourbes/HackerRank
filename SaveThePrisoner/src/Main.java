import java.util.*;

public class Main {
    private static int n; //number of prisoners
    private static int m; //number of sweets
    private static int s; //the chair number to start passing out treats at
    private static int Test;

    public static void main(String[] args) {

        Scanner  in = new Scanner(System.in);

         Test = in.nextInt();
        int [] UserSize = new int[Test];

        for (int i = 0 ; i< Test; i++){
            UserSize[i] =  output(readInput());
        }

        for (int g : UserSize){
            System.out.println(g);
        }

    }



    private static int[] readInput() {

        Scanner scan = new Scanner(System.in);
        int[] input = new int[3];
        n = scan.nextInt();
        m = scan.nextInt();
        s = scan.nextInt();

        for (int i = 0; i < input.length; i++) {
            input[0] = n;//prisoners
            input[1] = m;//sweets
            input[2] = s; //chair number start
        }

        return input;

    }

    public static int output(int[] readInput) {

        int Foutput = 0;
        int increment = 0;

        if (readInput[2] + readInput[1] > readInput[0]) {
            increment = readInput[1] % readInput[0];
        }

        if (increment != 0) {
            Foutput = increment + readInput[2] - 1;
        } else if (increment == 0) {
            Foutput = readInput[2] + readInput[1]-1;
        }
        return Foutput;

    }
}