package by.htp.airline.domen.crew;

public class Stewardess extends Crew{
	
	private int category;
	
	public Stewardess() {
		
	}

	public Stewardess(String position) {
		super(position);
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
	
}
