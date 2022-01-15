package PraciseArray2; 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReadingFile 
{
   public static void main(String args[])
   {
	 //Creating a File object for directory
	      File directoryPath = new File("C:\\Users\\91993\\Desktop\\JAVA\\PractiseArray01\\SimpliLearn");
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) 
	      {
	         System.out.println(contents[i]);
	      }
		      
		}
   }
   
