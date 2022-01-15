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
public class Dellete 
{
	//public static void main(String[] args) 
	//{
		public static void searchFileRecursively(String path, String fileName, List<String> fileListNames) 
		{
			File dir = new File(path);
			File[] files = dir.listFiles();
			List<File> filesList = Arrays.asList(files);

			if (files != null && files.length > 0) {
				for (File file : filesList) {

					if (file.getName().startsWith(fileName)) {
						fileListNames.add(file.getAbsolutePath());
					}

					// Need to search in directories separately to ensure all files of required
					// fileName are searched
					if (file.isDirectory()) {
						searchFileRecursively(file.getAbsolutePath(), fileName, fileListNames);
					}
				}
			
		
			}
		}
	}

















mport java.io.*;
import java.util.*;
class FindFile
{
public void findFile(String name,File file)
{
File[] list = file.listFiles();
if(list!=null)
for (File fil : list)
{
if (fil.isDirectory())
{
findFile(name,fil);
}
else if (name.equalsIgnoreCase(fil.getName()))
{
System.out.println(fil.getParentFile());
}
}
}
public static void main(String[] args)
{
FindFile ff = new FindFile();
Scanner scan = new Scanner(System.in);
System.out.println("Enter the file to be searched.. " );
String name = scan.next();
System.out.println("Enter the directory where to search ");
String directory = scan.next();
ff.findFile(name,new File(directory));
}
}