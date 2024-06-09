package javaguides;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {

	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("sap", 1);
		map.put("sap", 2);
		System.out.println(map);
	}
}
