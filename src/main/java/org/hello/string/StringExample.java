package org.hello.string;

public class StringExample {
	public static void main(String[] args){
		String str = "This is a String";
		
		System.out.println(str);
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("This");
		stringBuffer.append("is");
		stringBuffer.append("a");
		stringBuffer.append("String");
		System.out.println(stringBuffer.toString());
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("This");
		stringBuilder.append("is");
		stringBuilder.append("a");
		stringBuilder.append("String");
		System.out.println(stringBuilder.toString());
		
				
	}
}
