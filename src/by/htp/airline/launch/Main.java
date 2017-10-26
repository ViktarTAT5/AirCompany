package by.htp.airline.launch;


import by.htp.airline.domen.Company;
import by.htp.airline.domen.Flight;
import by.htp.airline.domen.cargo.Cargo;
import by.htp.airline.domen.transport.aircraft.Aircraft;
import by.htp.airline.domen.transport.aircraft.CargoAirplane;
import by.htp.airline.domen.transport.aircraft.PassengerAirplane;
import by.htp.airline.logic.CargoMaster;
import by.htp.airline.logic.Dispatcher;

public class Main {
	public static void main(String[] args) {
		Company company = new Company();
//		Aircraft plan1 = new PassengerAirplane("Boing", 11, 100, 30, 50, 1000, 5);
//		Aircraft plan2 = new PassengerAirplane("Boing", 12, 100, 30, 50, 1000, 5);
//		Aircraft plan3 = new PassengerAirplane("Boing 314", 13, 120, 40, 55, 2500, 6.8f);
//		Aircraft plan4 = new PassengerAirplane("Ink", 14, 60, 15, 30, 800, 3.5f);
//		Aircraft plan5 = new PassengerAirplane("HIlco", 15, 60, 15, 30, 800, 3.5f);
//		Aircraft plan6 = new CargoAirplane("Bison", 16, 0, 300, 400, 800, 4f);
		
		company.addTransport(plan1);
		company.addTransport(plan2);
		company.addTransport(plan3);
		company.addTransport(plan4);
		company.addTransport(plan5);
		company.addTransport(plan6);
		
		Dispatcher dispatcher = company.getDispatcher();
		dispatcher.showListTransport();
		dispatcher.totalCapacityCargoAndCarrying();
		dispatcher.sortedByRangeOfFlight();
		dispatcher.searchByParameters(4, 5);
		
		dispatcher.createNewFlight(11);
		Flight flight = dispatcher.searchFlight(11);
		dispatcher.fitAircraftInFlight(11, plan6);
		
		CargoMaster cargoMaster = company.getCargoMaster();
		cargoMaster.createNewCargoList(123);
		cargoMaster.addCargo(new Cargo("car", 456, 1.5f, 5));
		cargoMaster.addCargo(new Cargo("spares", 325, 0.5f, 1));
		cargoMaster.showCargoList();
		
		cargoMaster.transferCargoList(11);
		cargoMaster.showCargoList();
		
		
	}
}
