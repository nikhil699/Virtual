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
public class pracise_code 
{
  public static void main(String[] args) 
  {
	 PractiseArray2 welFile = new PractiseArray2();
	 
	 welFile.printWelcomeScreen("VirtualKeyForYourRepositories","Nikhil Chaurasiya","nikhil.chaurasiya@mphasis.com");
	 filecreation appCreation = new filecreation();
	 appCreation.handleWelcomeScreenInput();
  }
}
