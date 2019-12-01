package org.hello.feature8;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		String[][] data = new String[][] {{"a", "b"},{"c", "d"}, {"e", "f"},{"a", "b"}};
		  Stream<String[]> temp = Arrays.stream(data);
		  Stream<String> flatMapData = temp.flatMap(x->Arrays.stream(x));
		  Stream<String> filterData = flatMapData.filter(x -> "a".equals(x.toString()));
		  filterData.forEach(System.out::println);

	}
}
