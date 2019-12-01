package org.hello;

import java.util.Arrays;
import java.util.List;

public class CSVtoList {
	public static void main(String[] args) {
		String alpha = "A, B, C, D";

		// Remove whitespace and split by comma
		List<String> result = Arrays.asList(alpha.split(","));

		System.out.println(result);
	}
}
