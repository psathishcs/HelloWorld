package org.hello;

import java.util.UUID;

public class HelloUUID {
	public static void main(String[] args){
		String uuidStr = "123e4567-e89b-12d3-a456-426655440000";
		UUID uuid = UUID.fromString(uuidStr);
		System.out.println(uuid);
	}
}
