package practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromFile {

	public static void main(String[] args) {
		
		String filePath="C:\\Users\\skairamkonda\\Downloads\\20240304140000_CDF_GBR_CCADB_GI.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			
			String line;
			
			 while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
