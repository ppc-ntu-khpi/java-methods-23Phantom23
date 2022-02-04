//package test;
//import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Введіть дату народження(dd.mm.yyyy): ");
        String strDate = in.nextLine();
        in.close();
        System.out.println("Ваше число судьби: "+Exercise.Calculate(strDate));
    }
}