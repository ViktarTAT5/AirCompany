package by.htp.airline.launch;

import by.htp.airline.domen.Aircraft;
import by.htp.airline.domen.Company;
import by.htp.airline.domen.Tipe;
import by.htp.airline.logic.Dispatcher;

public class Main {
	public static void main(String[] args) {
		Company company = new Company();
		Aircraft plan1 = new Aircraft(11, Tipe.PASSENGER_AIRPLANE, "Boing", 100, 30, 50, 1000, 5);
		Aircraft plan2 = new Aircraft(12, Tipe.PASSENGER_AIRPLANE, "Boing", 100, 30, 50, 1000, 5);
		Aircraft plan3 = new Aircraft(13, Tipe.PASSENGER_AIRPLANE, "Boing 314", 120, 40, 55, 2500, 6.8f);
		Aircraft plan4 = new Aircraft(14, Tipe.PASSENGER_AIRPLANE, "Ink", 60, 15, 30, 800, 3.5f);
		Aircraft plan5 = new Aircraft(15, Tipe.CARGO_AIRPLANE, "HIlco", 60, 15, 30, 800, 3.5f);
		
		company.addTransport(plan1);
		company.addTransport(plan2);
		company.addTransport(plan3);
		company.addTransport(plan4);
		company.addTransport(plan5);
		
		Dispatcher dispatcher = company.getDispatcher();
		dispatcher.showListTransport();
		dispatcher.totalCapacityCargoAndCarrying();
		dispatcher.sortedByRangeOfFlight();
		
		
	}
}
