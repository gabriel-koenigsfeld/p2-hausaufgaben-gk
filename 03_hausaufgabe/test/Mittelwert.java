package test;

public class Mittelwert implements Comparable<Mittelwert>{
	
	private double trouble;
	
	public Mittelwert(double trouble) {
		
		super();
		this.trouble = trouble;
		
	}

	public double getTrouble() {
		return trouble;
	}

	public void setTrouble(double trouble) {
		this.trouble = trouble;
	}

	@Override
	public int compareTo(Mittelwert o) {

		return 0;
	}
	
}
