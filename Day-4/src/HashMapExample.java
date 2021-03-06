import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hash= new HashMap<>();
		
		hash.put(1, "Vishnu");
		hash.put(2, "Divya");
		
		Set s = hash.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			Map.Entry map = (Map.Entry)i.next();
			System.out.println(map.getKey() + " , " + map.getValue());
			
		}
		
		String l = hash.get(1);
		System.out.println(l);
		
		hash.remove(1);
		
		
		for (Iterator iterator = s.iterator(); iterator.hasNext();) {
			Map.Entry object = (Map.Entry) iterator.next();
			
			System.out.println(object.getKey() + " , " + object.getValue());
		}
	}
}
