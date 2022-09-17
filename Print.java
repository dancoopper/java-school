/*Name: ****
Teacher: *****
Date: *****, 2022
Assignment: String Output in the Console Class
*/
import hsa.Console;

import java.awt.*;

public class Print
{
    static Console c;        //output console

    public static void main (String[] args)
    {
        c = new Console ();


        c.println(""); //designs
        c.println("");
        c.println("");
        c.print(" ",37);
        c.println("Designs");

        c.println(""); //D
        c.println("");
        c.println("");
        c.print(" ",40);
        c.println("D");

        c.print("",39); //III
        c.println("III");

        c.print("",38); //AAAAA
        c.println("AAAAA");

        c.print("",37); //MMMMMMM
        c.println("MMMMMMM");

        c.print("",38); //OOOOO
        c.println("OOOOO");

        c.print("",39); //NNN
        c.println("NNN");

        c.print(" ",40); //D
        c.println("D");

        c.println("");
        c.println("");
        c.println("");
        c.print("",34);
        c.println("PARALLELO");

        c.print("",35);
        c.print("A",8);
        c.println("G");

        c.print("",36);
        c.print("R",8);
        c.println("R");

        c.print("",37);
        c.print("A",8);
        c.println("A");

        c.print("",38);
        c.print("LLELOGRAM");

    } //main method
}
