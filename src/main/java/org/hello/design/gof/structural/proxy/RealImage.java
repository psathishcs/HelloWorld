package org.hello.design.gof.structural.proxy;
/**
 *  
 * @author SathishParthasarathy
 * 
 * Use a simple object to represent a complex one or provide a placeholder 
 * for another object to control access to it.
 * Where to use & benefits
 * -----------------------
 *  If creating an object is too expensive in time or memory.
 *  Postpone the creation until you need the actual object.
 *  Load a large image (time consuming).
 *  Load a remote object over network during peak periods.
 *  Access right is required to a complex system.  
 *
 */

public class RealImage implements Image{
	private String fileName;
	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk();
	}
	@Override
	public void display() {
		 System.out.println("Displaying " + fileName);
	}
	
	private void loadFromDisk(){
		System.out.println("Loading the file : " + fileName);
	}

}
