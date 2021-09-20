package json;
import java.io.*;
import java.util.*;
//import java.lang.*;

public class CSVtoJSON {
	
	public static void readCsvUsingScanner(String filepath) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File(filepath));
		
		while(in.hasNext()) {
			System.out.println(in.next().toString());
		}
		
		in.close();
	}
	
	public static void readCsvUsingBufferedReader(String filepath){
		
		String line = "";
		String deleimeter = ",";
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filepath));
				
//			line = reader.readLine();
				
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				
//				String machineData[] = line.split(deleimeter);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		
//		readCsvUsingScanner("/Users/deveshvishal/Downloads/Netmeds/PowerConsumption.csv");
		readCsvUsingBufferedReader("/Users/deveshvishal/Downloads/Netmeds/PowerConsumption.csv");
	}

}
