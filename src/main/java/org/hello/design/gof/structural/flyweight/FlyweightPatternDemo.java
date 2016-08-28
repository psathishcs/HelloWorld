package org.hello.design.gof.structural.flyweight;
/**
 * 
 * @author SathishParthasarathy
 *
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease
 * memory footprint and increase performance. This type of design pattern comes under structural
 * pattern as this pattern provides ways to decrease object count thus improving the object structure
 * of application.
 * 
 *  Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates
 *  new object when no matching object is found
 *  
 *  Where to use & benefits
 *  -----------------------
 *   Need to instantiate a large amount of small and fine-grained classes.
 *   Need icons to represent object.
 *   An object extrinsic state can be shared by classes.
 *   Reduce the number of objects created, decrease memory footprint and increase performance.
 *   Increase runtime cost associated with transferring, finding, or computing extrinsic data. 
 *   
 */
public class FlyweightPatternDemo {
	private static final String colors[] = {"Red", "Green", "Bule", "White", "Black"};
	public static void main(String[] args){
		for (int i = 0; i < 20; i++){
			Circle circle =(Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandowX());
			circle.setY(getRandowX());
			circle.draw();
		}
	}
	private static String getRandomColor(){
		return colors[(int)(Math.random()*colors.length)];
	}
	
	private static int getRandowX(){
		return (int)(Math.random()*100);
	}
	
	private static int getRandowY(){
		return (int)(Math.random()*100);
	}
}
