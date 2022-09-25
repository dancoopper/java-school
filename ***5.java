import hsa.Console;
import java.util.Scanner;

public class Sam5 {
    static Console c;
    static Scanner Sc;

    static void askData(){

        c.print("Are you male, female or other (M,F,O): ");
        String userGender = c.readLine();
        userGender = userGender.toUpperCase();
        c.println();

        //gets first name
        c.print("What is your first name: ");
        String userName = c.readLine();
        String userFirstL = userName.substring(0,1);
        String userFirstLCap = userFirstL.toUpperCase();
        userName = userName.replaceFirst(userFirstL, userFirstLCap);
        c.println();

        //gets last name
        c.print("What is your last name: ");
        String userNameLast = c.readLine();
        String userLastL = userNameLast.substring(0,1);
        String userLastLCap = userLastL.toUpperCase();
        userNameLast = userNameLast.replaceFirst(userLastL, userLastLCap);
        c.println();

        displayData(userGender,userName, userNameLast);
    }

    static void displayData(String Q1, String Q2, String Q3){
        switch (Q1) {
            case "M" -> c.println("Welcome sir");
            case "F" -> c.println("Welcome maam");
            case "O" -> c.println("Welcome :)");
            default ->
                    c.println("please re-run the program and answer with 'M' for male, 'F' for female or 'O' for other...thank you");
        }
        c.println("Hello: " + Q2);
        if(Q1.equals("M")){
            c.println("Welcome Mr." + Q3);
        } else if (Q1.equals("F")) {
            c.println("Welcome Ms." + Q3);
        } else if (Q1.equals("O")) {
            c.println("Welcome NB");
        }
    }
    public static void main(String[] args) {
        c = new Console();
        Sc = new Scanner(System.in);
        askData();
    }
}
