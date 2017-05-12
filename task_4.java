package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task_4 {

	
	public static final String COMMA = ",";
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("M:/CE152/IR101.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
	}
        scanner.close();
	}
	
	public static void readCSVFile(Scanner input){
		
	}
	
	public static void readRecord(String line){
	
}
}