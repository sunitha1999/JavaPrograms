import java.util.Map;
import java.util.HashMap;
public class HashMapInsert {

	public static void main(String[] args)
	{
		Map<Integer, String> fruit= new HashMap<Integer, String>();
		fruit.put(1, "Apple");
		fruit.put(4, "orange");
		fruit.put(1, "mango");
		fruit.put(4, "pineapple");
		fruit.put(5, "pineapple");
		fruit.put(2, "apple");
		fruit.put(0, "apple");
		System.out.println(fruit);
		
		System.out.println(fruit.get(4));
		

	}
}
