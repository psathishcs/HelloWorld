package org.hello.assignment.v3;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Interview {
	public  enum Names {
		MARY, JOE, SIENNA, PETER;
        public static String[] names() {
        	String valuesStr = Arrays.toString(Names.values());
            return valuesStr.substring(1, valuesStr.length()-1).replace(" ", "").split(",");
        }
        public static String[] namesFirstUpperCase(){
        	String strs[] = names();
            for (int i = 0 ; i < strs.length; i++){
            	String str = strs[i];
            	strs[i] = str.toLowerCase().replaceFirst("[a-z]{1}", str.substring(0,1).toUpperCase());
            }
            return strs;
        }
      }
      public static void main(String[] args) throws ParseException{
    	  String strs[] = Names.namesFirstUpperCase();
          Map<String, Date> dob = new HashMap();
          SimpleDateFormat fixDateFormat = new SimpleDateFormat("dd-MM-yyyy");
          Date fixDate = fixDateFormat.parse("06-04-1990");
          Date dobDate;
          int strLenght;
          for (int i = 0 ; i < strs.length; i++){
        	  strLenght = strs[i].length()-1;
              dobDate = DateUtils.addYears(fixDate, -strLenght);        
              Date age = DateUtils.addYears(new Date(), -dobDate.getYear());
              dob.put(strs[i], dobDate);
              System.out.println(strs[i] + " was done in " + dobDate.getYear() + " and is " +  age.getYear() + " years old.");
          }
      }
}