package org.hello.feature7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringsInSwitch {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Workspace/HelloWorld/src/test/resources/City.txt")))
		{
			String city = null;
			String stateAndCountry = null;
			while((city = bufferedReader.readLine()) != null){
				switch (city) {
				case "Charlotte":
					stateAndCountry = "North Carolina, USA";
					break;
				case "Parsippany":
					stateAndCountry = "New Jersey, USA";
					break;
				case "Manhattan":
					stateAndCountry = "New York, USA";
					break;
				case "San Francisco":
					stateAndCountry = "California, USA";
					break;
				case "Chennai":
					stateAndCountry = "Tamil Nadu, India";
					break;
				case "Jodhpur":
					stateAndCountry = "Rajasthan, India";
					break;
				}
				System.out.println(city + ", " +stateAndCountry );
			}
		}
	}
}
