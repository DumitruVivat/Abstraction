package kitchen;

import Liquids.Juice;
import fruits.Orange;

public class Blender {
	
	private String brand;
	
	public Blender() {}
	
	public Blender(String brand) {
		setBrand(brand); // HW2: not "", not null
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if(brand.trim().equals("") || !(brand.trim().equals(null)))
		this.brand = brand;
		else
		System.err.println("Warning !!!,wrong name of blander!!");
	}
	
    // JavaDoc ?
	public Juice makeJuice(Orange orange) {
		Juice juice = new Juice(orange.getWeight());
		return juice;
	}

}
