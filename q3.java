import java.util.*;
import java.util.stream.*;

public class Assign3 {

	public static void main(String[] args) {

		List<String> productlist1 = Arrays.asList("Hp", "Samsung", "Xiaomi");
		List<String> productlist2 = Arrays.asList("Motorola", "Lenovo", "Apple");
		List<String> productlist3 = Arrays.asList("Google", "Microsoft", "Boat");
		List<List<String>> productlists = new ArrayList<List<String>>();
		productlists.add(productlist1);
		productlists.add(productlist2);
		productlists.add(productlist3);
		List<String> res = productlists.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
		System.out.println(res);

	}
