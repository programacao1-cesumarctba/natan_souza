package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] Args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Example1");
		list.add("Example2");
		list.add("Example3");
		list.add(2, "Example1.5");
		
		System.out.println(list.size());		
		for (String x : list) {
			System.out.println(x);
		}
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		list.remove("Example1.5");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'E');
	}
}
