package PraciseArray2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class filecreation 
{
  public static void handleWelcomeScreenInput() 
	{
	 
	  boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				 PractiseArray2.welcome2();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					PractiseArray2.displayAllFiles("C:\\Users\\91993\\Desktop\\JAVA\\New_Project001\\");
					break;
				case 2:
					filecreation.handleFileMenuOptions();
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


public static void handleFileMenuOptions() {
	boolean running = true;
	
	Scanner sc = new Scanner(System.in);
	do {
		try {
			
			PractiseArray2.createMainFolderIfNotPresent("SimpliLearn");
			PractiseArray2.displayMenu();
			int input = sc.nextInt();
			switch(input) {
			case 1:
				 PractiseArray2.AddFile();
				
				break;
			case 2:
				// File/Folder delete
				PractiseArray2.DeleteFile();
				break;
			case 3:
				// File/Folder Search
				//System.out.println("Enter the name of the file to be searched from \"main\" folder");
				//String fileName = sc.next();
				//String path = "C:\\Users\\91993\\Desktop\\JAVA\\New_Project001\\";
				//PractiseArray2.createMainFolderIfNotPresent("");
				//PractiseArray2.displayAllFiles("C:\\Users\\91993\\Desktop\\JAVA\\New_Project001\\");
				//PractiseArray2.searchFileRecursively(path, fileName, null);
				//PractiseArray2 pc = new PractiseArray2();
				//Scanner scan = new Scanner(System.in);
			//	System.out.println("Enter the file to be searched.. " );
			//	String name = scan.next();
			//	System.out.println("Enter the directory where to search ");
			//	String directory = scan.next();
			//	pc.findFile(name,new File(directory));
				break;
			case 4:
				
				   return;
				 
			case 5:
				//Exit//
				System.out.println("Program exited successfully.");
				running = false;
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please select a valid option from above.");
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			handleFileMenuOptions();
		}
	} while (running == true);
}
}
