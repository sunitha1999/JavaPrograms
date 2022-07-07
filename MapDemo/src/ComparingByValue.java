import java.util.Map;
import java.util.HashMap;

public class ComparingByValue {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(3, "Aman");
		map.put(4, "Cahir");
		map.put(1, "Basi");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
//		.entrySet()//Returns a set view of the mappings in this map
//		.stream()//returns a sequential stream with this collection as its source
//		.sorted(Map.Entry.comparingByValue())//sorted acc to the provided comparator
		

	}

}
