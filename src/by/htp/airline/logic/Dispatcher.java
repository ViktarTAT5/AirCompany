package by.htp.airline.logic;

import by.htp.airline.domen.Company;
import by.htp.airline.util.Print;

public class Dispatcher {
	Company company;
	
	public Dispatcher(Company company) {
		this.company = company;
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
	
	public void totalCapacityCargoAndCarrying() {
		Print.print("Total Carrying Capasity = " + totalCarryingCapasity());
		Print.print("Total Capacity Cargo = " + totalCapacityCargo());
	}
	
	
	public void showListTransport() {
		for(int i = 0; i < company.getAmountTransport(); i++) {
			Print.print(company.getTransport(i).toString());
		}
	}
	
	
}
