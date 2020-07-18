package main;

import fruits.Orange;
import kitchen.Blender;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
	
	   Orange smallOrange = new Orange(50); // HW1: 0.....1000
	   Orange mediumOrange = new Orange(100);
	   Orange bigOrange = new Orange(200);
				
	   Blender cheapBlender = new Blender("First");
			

	   Cup bigCup = new Cup();
	   bigCup.setContent(cheapBlender.makeJuice(smallOrange));
	   bigCup.addContent(cheapBlender.makeJuice(mediumOrange));
	   bigCup.addContent(cheapBlender.makeJuice(bigOrange));
	   
	   System.out.println("we have " + bigCup.getContent().getVolume() + " mll of juice !");
	   
	   
	}

}

