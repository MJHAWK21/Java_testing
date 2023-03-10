package ustbatchno3.junit5testcases;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("sasi","abu","kodiyan");
		Map<String,Long> count = count(ls);
		System.out.println(count);
	}
	
	public static Map<String,Long> count(List<String> s) {
		
		Map<String,Long> m = s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return m;
		
	}
}
	
	
	