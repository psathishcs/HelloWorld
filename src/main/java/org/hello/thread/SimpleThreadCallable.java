package org.hello.thread;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 
 * @author SathishParthasarathy
 * 	1) Runnable interface is older than Callable, there from JDK 1.0, while Callable is added on Java 5.0.
 *	2) Runnable interface has run() method to define task while Callable interface uses call() 
 *	   method for task definition.
 *	3) run() method does not return any value, it's return type is void while call method returns value.
 *	   Callable interface is a generic parameterized interface and Type of value is provided, 
 *	   when instance of Callable implementation is created.
 *	4) Another difference on run and call method is that run method can not throw checked exception, while call method can throw checked exception in Java.
 */
public class SimpleThreadCallable {
	public static ExecutorService executor = null;
	public static volatile Future taskOneResults = null;
	public static volatile Future taskTwoResults = null;
	
	public static void main(String[] args){
		executor = Executors.newFixedThreadPool(2);
		List<TestCallable> callables = new ArrayList<>();
		List<String> list = null;
		callables.add(new TestCallTwo());
		callables.add(new TestCallOne());
		
		try {
			List<Future<List<String>>>futureResult = executor.invokeAll(callables);
			list = processFutureResult(futureResult);
		}catch (InterruptedException e){
			e.printStackTrace();
		}catch(ExecutionException ee){
			ee.printStackTrace();
		}finally {
			executor.shutdown();
		}
		for (String str :list){
			System.out.println(str);
		}
	}
	private static List<String> processFutureResult(List<Future<List<String>>> futureResult)  throws InterruptedException, ExecutionException{
		List<String> list = null;
		if (CollectionUtils.isNotEmpty(futureResult)){
			list = new ArrayList<String>();
			for (Future<List<String>> future : futureResult){
				List<String> stringlist = future.get();
				if (CollectionUtils.isNotEmpty(stringlist)){
					list.addAll(stringlist);
				}
			}
		}
		return list;
	}
}

class TestCallOne implements TestCallable {
	@Override
	public List<String> call() throws Exception {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Test one 1 : Java 1.7");
		list.add("Test one 2 : Spring");
		list.add("Test one 3 : Apache Hadoop");
		return list;
	}
}

class TestCallTwo implements TestCallable{
	@Override
	public List<String> call() throws Exception {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Test Two 1 : Oracle 11g");
		list.add("Test Two 2 : MS SQL");
		list.add("Test Two 3 : HBase");
		return list;
	}
}
interface TestCallable extends Callable<List<String>> {

}
