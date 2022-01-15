package PraciseArray2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class PractiseArray01   
{
	public static void main(String[] args) throws IOException
	{
		
		{
		   	 
		   	
		   	 Scanner scan=new Scanner(System.in);
		   	 ArrayList<String> al=new ArrayList<>();
		   	// while(true) 
		   	 //{
		   		 System.out.println("enter the file name to create");
			   	 String filename=scan.next();
			   	 File f=new File(filename);
			   	 boolean result=f.createNewFile();
			   	 if(result==false) 
			   	   {
			   		 System.out.println("file is not created");
			   	   }
			   	 else 
			   	   {
			   		 al.add(filename);
			   		 System.out.println("file is created at : "+filename);
			   	   }
			   	// System.out.println(al);
		   	 }
		   	
		  
		  
		}
}	
//}