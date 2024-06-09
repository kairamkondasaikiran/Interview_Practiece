package practice;

import java.util.ArrayList;
import java.util.List;

public class AML {

	public static void main(String[] args) {
		
		String a="UID	Surname	Forenames	DateOfBirth	Address1	Address2	Address3	Address4	Address5	Postcode	Company/Individual	Gender	Policy Number	Policy Type	Policy Status	Source System";
		String a2="50004406	Disney LTD	 	 	Disney House	Disney Square	Disney Street	Disneyland	 	D1 2AB	C	 	 	 	**Error**	ZGroup";
		String a3="AAA04JL0391855OW777	SOLO	HANS	02/09/1955	10A RESISTANCE ROAD	DEATH STAR	GALAXY	 	 	G1 1AA	I	M	0391855OW777	FA	Active	Phase3";
		List<String> arr= splitWordsWithDoubleSpaces(a3);
		System.out.println(arr.get(14)+" status ");
		
		for(String f:arr) {
			System.out.println(f);
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
