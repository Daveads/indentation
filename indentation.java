/*
 * a program showing indentation in (java) && python
 * 
 */



import static java.lang.System.*;
import java.util.Scanner;

public class indentation{
	
	/*----- Main program -----*/

	public static void main( String[] args){ //body of the main method

		Scanner input = new Scanner(System.in);
		out.println("input a valid password");
		String user_input = input.next();


		if (user_input.equals("evad")) {
			out.println("logged in\n");

		}  else{ 
			out.println("incorrect password\n");
		}

   } // end of the main method
}
