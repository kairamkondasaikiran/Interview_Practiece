package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AML_CustomerCode {

	public static void main(String[] args) {
		
		   String filename = "C:\\Users\\skairamkonda\\Downloads\\20240304140000_CDF_GBR_CCADB_Life_Customer.txt"; // Change this to your file's name
	        
		   try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                List<String> words = splitWordsWithDoubleSpaces(line); // Split by one or more spaces
	                System.out.println(words.get(14));
	                for (String word : words) {
	                    System.out.println(word);
	                }
	                System.out.println("----------------");
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    
	}
	
	 public static List<String> splitWordsWithDoubleSpaces(String line) {
	        List<String> words = new ArrayList<>();
	        String[] parts = line.split("\\s+");
	        StringBuilder word = new StringBuilder();
	        
	        for (String part : parts) {
	            if (part.contains("  ")) {
	                String[] subParts = part.split("(?<=\\s{2})");
	                for (String subPart : subParts) {
	                    if (!subPart.isBlank()) {
	                        words.add(subPart.trim());
	                    }
	                }
	            } else {
	                words.add(part.trim());
	            }
	        }
	        
	        return words;
	    }
}
