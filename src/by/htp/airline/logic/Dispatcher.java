package by.htp.airline.logic;

import java.util.Collections;
import java.util.List;


import by.htp.airline.domen.Company;
import by.htp.airline.domen.Flight;
import by.htp.airline.domen.aircraft.Aircraft;
import by.htp.airline.util.Print;

public class Dispatcher {
	private Company company;
	
	public Dispatcher(Company company) {
		this.company = company;
	}
	
	public void fitAircraftInFlight(int number, Aircraft aircraft) {
		Flight flight = searchFlight(number);
		flight.setAircraft(aircraft);
	}
	
	public void sortedByRangeOfFlight() {
		List<Aircraft> transportList = company.getTransportList();
		Collections.sort(transportList, new SortedByRangeOfFlight());
		showListTransport();
	}
	
	public void totalCapacityCargoAndCarrying() {
		Print.print("Total Carrying Capasity = " + totalCarryingCapasity());
		Print.print("Total Capacity Cargo = " + totalCapacityCargo());
	}
	
	public float totalCarryingCapasity() {
		float result = 0;
		for(int i = 0; i < company.getAmountTransport(); i++) {
			result += company.getTransport(i).getCarryingCapasity();
		}
		return result;
	}
	
	public float totalCapacityCargo() {
		float result = 0;
		for(int i = 0; i < company.getAmountTransport(); i++) {
			result += company.getTransport(i).getCapacityCargo();
		}
		return result;
	}
	
	public void showListTransport() {
		for(int i = 0; i < company.getAmountTransport(); i++) {
			Print.print(company.getTransport(i).toString());
		}
	}
	
	public void createNewFlight(int number) {
		Flight flight = new Flight(number);
		company.addFlight(flight);
	}
	
	public Flight searchFlight(int number) {
		for(int i = 0; i < company.getAmountFlight(); i++) {
			int tempNumber = company.getFlight(i).getNumber();
			if(tempNumber == number){
				return company.getFlight(i);
			}
		}
		return null;
	}
	
	public void searchByParameters(float minFuelConsumption, float maxFuelConsumption) {
		for(int i = 0; i < company.getAmountTransport(); i++) {
			float temp = company.getTransport(i).getFuelConsumption();
			if(temp >= minFuelConsumption && temp <= maxFuelConsumption) {
				Print.print(company.getTransport(i).toString());
			}
		}
	}
}
