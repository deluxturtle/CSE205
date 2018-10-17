import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//***************************************************************
// CLASS: Hw1_43
// AUTHOR: Andrew Seba, aseba, aseba@asu.edu
//*************************************************************** 
public class Hw1_43 {
	
	public void Hw1_34() { }
	
	public static void main(String[] args)
	{
		//Using "src/" I was able to find my java file.
		String fileName = "src/Hw1_43.java";
		
		//Create the file object.
		File file = new File(fileName);
		
		Scanner scanner = null;
		try 
		{
			//Read in the file into memory
			scanner = new Scanner(file);
			PrintWriter out = new PrintWriter(new File(fileName + ".txt"));
			int lineNumber = 1;
			
			while(scanner.hasNextLine()) 
			{
				String curLine = scanner.nextLine();
				out.printf("[%03d] %s\n", lineNumber, curLine);
				lineNumber++;
			}
			scanner.close();
			out.close();

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
}
