package by.htp.airline.domen.crew;

public class Navigator extends Crew{
	
	public int discharge;
	
	public Navigator() {
		
	}

	public Navigator(String position) {
		super(position);
	}

	public int getDischarge() {
		return discharge;
	}

	public void setDischarge(int discharge) {
		this.discharge = discharge;
	}
	
	
}
