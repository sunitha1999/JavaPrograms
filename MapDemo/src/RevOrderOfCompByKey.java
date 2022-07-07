import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;

public class RevOrderOfCompByKey {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(3, "Aman");
		map.put(4, "Cahir");
		map.put(1, "Basi");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
