package by.htp.airline.domen.crew;

public abstract class Crew {
	private String position;
	
	public Crew() {
		
	}
	
	public Crew(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
