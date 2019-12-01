package org.hello.feature8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HelloStream {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "a3", "a4", "c6", "c5");
		
		myList.stream().filter(s->s.startsWith("c")).forEach(System.out::println);
		myList.stream().filter(s->s.startsWith("c")).sorted().forEach(System.out::println);
		myList.stream().filter(s->s.startsWith("z")).findFirst().ifPresent(System.out::println);
		IntStream.range(1, 20).mapToObj(x-> x + ", ").forEach(System.out::print);
		System.out.println();
		Stream.of("a1", "a2", "a3", "c4", "c5", "c6", "c7")
			.map(x -> x.substring(1))
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);	
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(x-> "a" + x).forEach(System.out::println);
		Stream.of("a1", "a2", "a3", "c4", "c5", "c6", "c")
		.filter(s ->{
			System.out.println("filter: " + s);
			return true;
		}).forEach(s-> System.out.println("forEach : " + s));
		
		Optional<String>  result = myList.stream().findAny();
		System.out.println(result);
		 result  = myList.parallelStream().findAny();
		 System.out.println(result);
		 result  = myList.stream().parallel().findAny();
		 System.out.println(result);
		 
		 result  = myList.stream().parallel().findFirst();
		 System.out.println(result);
		 
		 result  = myList.stream().reduce((x, y) -> x + " " + y);
		 System.out.println(result);
		
		 
		 result  = myList.stream().reduce((x, y) -> y);
		 System.out.println(result);
		 
		 String str = "Hello, World Stream!";
		 Stream<Character> chrs = str.chars().mapToObj(c -> (char)c);
		chrs.forEach(System.out::print);
		Supplier<Stream<String>> streamSupplier = ()->  Stream.of("a1", "a2", "a3", "a4", "c6", "c5");
		result = streamSupplier.get().findAny();
		 System.out.println(result);
		 result = streamSupplier.get().findFirst();
		 System.out.println(result);
		 myList.stream().filter(x-> x.contains("a")).forEach(System.out::println);
		 
	}
}