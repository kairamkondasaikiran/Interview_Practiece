package practice;

import java.util.HashMap;
import java.util.Map;

public class MainHashCollision {

	public static void main(String[] args) {
		
		Map<PesronHashCollision, String> map= new HashMap<>();
		PesronHashCollision p1= new PesronHashCollision(1, "Sai", "Hyderabad", "IT", 20000.00);
		PesronHashCollision p2= new PesronHashCollision(2, "Kiran", "Mumbai", "DEV", 30000.00);
		PesronHashCollision p3= new PesronHashCollision(3, "SaiKiran", "Bangalore", "ADMIN", 40000.00);
		
		map.put(p1, p1.getName());
		map.put(p2, p2.getName());
		map.put(p3, p3.getName());
		
		String s=map.get(p2);
		System.out.println(s);
		
		System.out.println(map);
		
		
	}
}
