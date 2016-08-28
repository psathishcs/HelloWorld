package org.hello.feature7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondOperator {
	public static void main(String[] args) throws IOException{
		Map<String, List<String>>  maps = new HashMap<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Workspace/HelloWorld/src/test/resources/City.txt")))
		{
			String city = null;
			List<String> stateAndCountry = null;
			while((city = bufferedReader.readLine()) != null){
				switch (city) {
				case "Charlotte":
					stateAndCountry = new ArrayList<>();
					stateAndCountry.add("North Carolina");
					stateAndCountry.add("USA");
					maps.put(city, stateAndCountry);
					break;
				case "Parsippany":
					stateAndCountry = new ArrayList<>();
					stateAndCountry.add("New Jersey");
					stateAndCountry.add("USA");
					maps.put(city, stateAndCountry);
					break;
				case "Manhattan":
					stateAndCountry = new ArrayList<>();
					stateAndCountry.add("New York");
					stateAndCountry.add("USA");
					maps.put(city, stateAndCountry);
					break;
				case "San Francisco":
					stateAndCountry = new ArrayList<>();
					stateAndCountry.add("California");
					stateAndCountry.add("USA");
					maps.put(city, stateAndCountry);
					break;
				case "Chennai":
					stateAndCountry = new ArrayList<>();
					stateAndCountry.add("Tamil Nadu");
					stateAndCountry.add("India");
					maps.put(city, stateAndCountry);
					break;
				case "Jodhpur":
					stateAndCountry = new ArrayList<>();
					stateAndCountry.add("Rajasthan");
					stateAndCountry.add("India");
					maps.put(city, stateAndCountry);
					break;
				}
			}
		}
		System.out.print("end");
	}
}
