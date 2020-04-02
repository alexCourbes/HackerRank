/* when given a specific year, this application will tell you that exact date of the 256th day of that year. pre 1917 it will use the Julian calendar
* post 1919 it will use the gregorian calendar  */
//test
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt(); //limits 1700 to 2700. [1700;1917]russia used another calendar
        if(year > 1919){ // Gregorian calendar
            LocalDate x =  LocalDate.ofYearDay(year,256);
            String finDate = x.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            System.out.println(finDate);
        }else if(year==1918){
            System.out.println("26.09.1918");
        }
        else{ //Julian (russian) calendar
            System.out.println(Julian(year) + ".09." + year);
        }
        scan.close();
    }
    public static int Julian (int yearInput){
        int day;
        if(yearInput%4 == 0 ){ //leap year
            day= 12;
        }else{ //normal year
            day = 13;
        }
        return day;
    }
}

//this is just a test
