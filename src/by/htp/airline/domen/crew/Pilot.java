package by.htp.airline.domen.crew;

public class Pilot extends Crew {
	
	private int numberOfFlightHours;
	
	public Pilot() {
		
	}
	
	public Pilot(String position) {
		super(position);
	}

	public int getNumberOfFlightHours() {
		return numberOfFlightHours;
	}

	public void setNumberOfFlightHours(int numberOfFlightHours) {
		this.numberOfFlightHours = numberOfFlightHours;
	}
	
	
}
