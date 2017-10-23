package by.htp.airline.domen;

import java.util.List;

import by.htp.airline.domen.aircraft.Aircraft;
import by.htp.airline.domen.cargo.CargoList;
import by.htp.airline.domen.crew.Crew;

public class Flight {
	private int number;
	private Aircraft aircraft;
	private List<Crew> crewList;
	private CargoList cargoList;
	
	public Flight(int number) {
		this.number = number;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public List<Crew> getCrewList() {
		return crewList;
	}

	public void setCrewList(List<Crew> crewList) {
		this.crewList = crewList;
	}

	public CargoList getCargoList() {
		return cargoList;
	}

	public void setCargoList(CargoList cargoList) {
		this.cargoList = cargoList;
	}

	public int getNumber() {
		return number;
	}
	
	
}
