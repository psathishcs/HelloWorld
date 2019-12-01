package org.hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TskTest {
	 public static void main (String[] args) throws java.lang.Exception
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	        String input = br.readLine();
	        System.out.println(input);
	        int n = Integer.parseInt(input);
	        List<String> intputStr = new ArrayList<String>();
	        for (int i = 0; i< n; i++) {
	          intputStr.add(br.readLine());
	        }
	      
	        
	        for (int i = 0; i< n; i++) {
	          String str = intputStr.get(i);
	          str = str.trim();
	          if (str.length() > 20 && str.length() <= 100) {
	        	  for (int j = 0; j< n-1; j++) {
	        		  String[] splits = str.split("regex");
	        	  }
	        	  StringBuilder strRev = new StringBuilder(); 
		           // append a string into StringBuilder input1 
		          strRev.append(str); 
		          strRev = strRev.reverse();
		          System.out.println(strRev);
		          
	          }
	          
	          
	        }
	    
	      
	       
	      
	    }

}
