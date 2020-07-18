package Liquids;

public class Juice {
	
	private int volume; // mll
	
	public Juice() {}
	
	public Juice(int volume) {
		setVolume(volume);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume >= 0 && volume <= 1500)
		this.volume = volume;
		else
		System.err.println("Warning !!, check the volume value!!");
	}

}
