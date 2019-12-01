package org.hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myCode {
	 public static void main (String[] args) throws java.lang.Exception
	  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = br.readLine();
	    System.out.println("Input : " + input);
	    Integer x = Integer.parseInt(input);
	    System.out.println("x : " + x);
	    for (int i = 0; i < x; i++){
	      System.out.println("Hello");
	    }
	  }
}
