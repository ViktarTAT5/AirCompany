package by.htp.airline.domen;

import java.util.ArrayList;
import java.util.List;
import by.htp.airline.domen.transport.aircraft.Aircraft;
import by.htp.airline.logic.CargoMaster;
import by.htp.airline.logic.Dispatcher;

public class Company {
	private List<Aircraft> transportList;
	private List<Flight> flightList;
	private Dispatcher dispatcher;
	private CargoMaster cargoMaster;
	
	public Company() {
		dispatcher = new Dispatcher(this);
		cargoMaster = new CargoMaster(this);
		transportList = new ArrayList<>();
		flightList = new ArrayList<>();
	}
	
	public Dispatcher getDispatcher() {
		return dispatcher;
	}
	
	public CargoMaster getCargoMaster() {
		return cargoMaster;
	}
	
	public void setTransportList(List<Aircraft> transportList) {
		this.transportList = transportList;
	}

	public List<Aircraft> getTransportList(){
		return transportList;
	}
	
	public void addTransport(Aircraft aircraft) {
		if(aircraft != null) {
		transportList.add(aircraft);
		}
	}
	
	public Aircraft getTransport(int index) {
		return transportList.get(index);
	}
	
	public void setTransport(int index, Aircraft aircraft) {
		if(aircraft != null) {
		transportList.set(index, aircraft);
		}
	}
	
	public int getAmountTransport() {
		return transportList.size();
	}
	
	public void addFlight(Flight flight) {
		flightList.add(flight);
	}
	
	public int getAmountFlight(){
		return flightList.size();
	}
	
	public Flight getFlight(int index) {
		return flightList.get(index);
	}
}
