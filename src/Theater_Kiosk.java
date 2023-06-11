/*
class AgeToWristBand
    main()
            int age = 0
			output “What is your age?”
			input age
			if age >= 21 then
			    output “You get a wristband.”
		end If
    return
EndClass
 */
import java.util.Scanner;
public class Theater_Kiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        System.out.print("How old are you? ");
        if (in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();
        }
        if(age >= 21){
            System.out.println("You get a paper wristband.");
        }
    }
}