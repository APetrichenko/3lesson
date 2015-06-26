/**
 * Created by ITHILLEL6 on 26.06.2015.
 */
public class functions {
    public static void main(String[] args) {

       double result;

        result = add(10.0,20);
        System.out.println(result);
        printHello();

    }
    public static double add (int first, double second) {
        //double sum = first + second;
        return 10000000;
    }
    public static double add (double first, int second) {
        double sum = first + second;
        return sum;
    }
    public static void printHello(){
       printMessage("Hello");
    }
    public static void printMessage(String message){
        System.out.println(message);
    }
}

