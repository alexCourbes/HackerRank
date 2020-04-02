//Hacker rank Challenge
import java.util.*;
public class Main {
    //we can only start from the beginning or the end of the book
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        int beginning = (p/2);
        int ending = 0;

        if(n%2==1)
            ending = (n-p)/2;
        else
            ending = (int) Math.round((n-p)/2.0);

        if (ending>beginning){
            System.out.println(beginning);
        }else {
            System.out.println(ending);
        }

    }
}