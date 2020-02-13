/*
https://www.hackerrank.com/challenges/kangaroo/problem

 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
    boolean end = result(input());
     if  (end) {
         System.out.println("YES");
     } else {
         System.out.println("NO");
     }
    }
    public static int[] input() {

        Scanner scan = new Scanner(System.in);
        System.out.println("please input the positions and speed of both kangaroos:");
        System.out.println("the values should be in this format: position of k1 - Velocity of K1 - position of k2 - Velocity of K2");
        int [] input = new int[4];

        for(int i = 0; i<input.length; i++) {

            input [i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(input));
        return input;
    }

    public static boolean result (int[] input ){
        int x1 = input[0]; //initial position
        int v1 = input[1]; //velocity
        int x2 = input[2];
        int v2 = input[3];
        int final_x1_location;
        int final_X2_location;

        boolean fResult = false;

        for (int x = 0; x< 10000 ; x++) {
            final_x1_location = x1 + (x * v1);

            final_X2_location = x2 + (x * v2);

            if (final_x1_location == final_X2_location){
                fResult = true;
                break;
            }
        }
        return fResult;

        }
    }





