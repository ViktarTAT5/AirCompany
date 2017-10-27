package by.htp.airline.launch;



import by.htp.airline.logic.Menu;
import by.htp.airline.logic.StartProgram;

public class Main {
	public static void main(String[] args) {
		

		StartProgram start = new StartProgram();
		start.start();
		Menu menu = new Menu(start.getCompany());
		
		do{
			menu.askCommand();
			menu.handlerComand();
		}while(menu.isFlag());
		
		
		

//		dispatcher.searchByParameters(4, 5);
		
//		dispatcher.createNewFlight(11);
//		Flight flight = dispatcher.searchFlight(11);
//		dispatcher.fitAircraftInFlight(11, plan6);
//		
//		CargoMaster cargoMaster = company.getCargoMaster();
//		cargoMaster.createNewCargoList(123);
//		cargoMaster.addCargo(new Cargo("car", 456, 1.5f, 5));
//		cargoMaster.addCargo(new Cargo("spares", 325, 0.5f, 1));
//		cargoMaster.showCargoList();
//		
//		cargoMaster.transferCargoList(11);
//		cargoMaster.showCargoList();
	
		
	}
}
