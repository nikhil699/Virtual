package PraciseArray2;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Practise 
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter The Name Of Your Folder");

	    String SimpliLearn;
	    //System.out.println("Your Folder SimpliLearn Has Been Created");
		File file = new File("SimpliLearn");
		// If file doesn't exist, create the main folder
		if (!file.exists()) 
		{
			file.mkdirs();
		}
	}
}