package by.htp.airline.domen;

import java.util.ArrayList;

import by.htp.airline.domen.aircraft.Aircraft;
import by.htp.airline.logic.Dispatcher;

public class Company {
	private ArrayList<Aircraft> transportList = new ArrayList();
	
	private Dispatcher dispatcher;
	
	public Company() {
		dispatcher = new Dispatcher(this);
	}
	
	public Dispatcher getDispatcher() {
		return dispatcher;
	}
	
	public ArrayList<Aircraft> getTransportList(){
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
	
	public void SetTransport(int index, Aircraft aircraft) {
		if(aircraft != null) {
		transportList.set(index, aircraft);
		}
	}
	
	public int getAmountTransport() {
		return transportList.size();
	}
}
