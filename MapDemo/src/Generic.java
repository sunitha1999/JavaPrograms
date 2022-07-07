import java.util.HashMap;
import java.util.Map;

public class Generic {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(3, "Aman");
		map.put(4, "Cahir");
		map.put(5, "Basi");
		
		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());

	}

}
