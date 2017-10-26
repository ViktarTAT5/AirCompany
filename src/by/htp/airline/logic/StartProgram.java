package by.htp.airline.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.airline.domen.Company;
import by.htp.airline.domen.transport.aircraft.Aircraft;
import by.htp.airline.util.FileReader;

public class StartProgram {
	private String nameFileTransportList = "C:\\Users\\VIKTAR\\eclipse-workspace\\AirCompany\\transportList.txt";
	
	public void start(Company company){
		List<String> list;
		List<Aircraft> transportList = new ArrayList<>();
		list = FileReader.readerList(nameFileTransportList);
		
		for(String i : list){
			transportList.add(FactoryAircraft.createAircraft(i));
		}
		company.setTransportList(transportList);
	}
}
