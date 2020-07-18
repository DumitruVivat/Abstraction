package fruits;


// CONCREAT CLASS
public class Orange {
	
	private int weight; // gramms
	
	public Orange() {}
	
	public Orange(int weight) {
		setWeight(weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight >= 10 && weight <= 1000)
		this.weight = weight;
		else
		System.err.println("Warning !!! , check the weight of Orange!!");
	}

}
