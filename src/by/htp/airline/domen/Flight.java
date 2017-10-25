package by.htp.airline.domen;

import java.util.List;

import by.htp.airline.domen.cargo.CargoList;
import by.htp.airline.domen.transport.Aircraft;

public class Flight {
	private int number;
	private Aircraft aircraft;
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
