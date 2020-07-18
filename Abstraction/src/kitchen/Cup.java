package kitchen;

import Liquids.Juice;

public class Cup {
	
	private Juice content ;
	
	public Cup() {}
	
	public Cup(Juice content) {
		setContent(content);
	}
	
	public Juice getContent() {
		return content;
	}

	public void setContent(Juice content) {
		if(content != null)
		this.content = content;
		else
		System.err.println("Warning !! content is empty");
	}
	
	public void addContent(Juice content) {
		// HW4: write the logic
		// leave 1 Juice object inside -> content volume1 + volume 2
		Juice accumulator = new Juice(content.getVolume() + this.content.getVolume());
		this.content = accumulator;
       
	}

}
