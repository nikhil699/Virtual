package PraciseArray2;
import java.util.List;
import java.util.Scanner;
public class NewPractise extends PractiseArray2
{
	public  void handleWelcomeScreenInput() 
	{
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				PractiseArray2.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					 PractiseArray2.displayAllFiles("C:\\Users\\91993\\Desktop\\JAVA\\New_Project001\\");
					break;
				case 2:
					HandleOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}