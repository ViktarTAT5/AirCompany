package by.htp.airline.logic;

import by.htp.airline.domen.Company;
import by.htp.airline.domen.Flight;
import by.htp.airline.domen.cargo.Cargo;
import by.htp.airline.domen.cargo.CargoList;
import by.htp.airline.util.Print;

public class CargoMaster {
	private CargoList cargoList;
	private Company company;

	public CargoMaster(Company company) {
		this.company = company;
	}

	public void createNewCargoList(int id) {
		if (cargoList == null) {
			cargoList = new CargoList(id);
		} else {
			Print.print("CargoMaster processes another CargoList");
		}
	}

	public void addCargo(Cargo cargo) {
		cargoList.addCargo(cargo);
		float total = cargoList.getTotalWeight();
		cargoList.setTotalWeight(total + cargo.getWeight());
		total = cargoList.getTotalScope();
		cargoList.setTotalScope(total + cargo.getScope());
	}

	public void delCargo(int id) {
		int index = searchCargoById(id);
		float total = cargoList.getTotalWeight();
		Cargo cargo = cargoList.getCargo(index);
		cargoList.setTotalWeight(total - cargo.getWeight());
		total = cargoList.getTotalScope();
		cargoList.setTotalScope(total - cargo.getScope());
		cargoList.delCargo(index);
	}

	public int searchCargoById(int id) {
		for (int i = 0; i < cargoList.getSize(); i++) {
			if (cargoList.getCargo(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public void transferCargoList(int nomberFlight) {
		Dispatcher dispatcher = company.getDispatcher();
		Flight flight = dispatcher.searchFlight(nomberFlight);
		if (flight != null) {
			flight.setCargoList(cargoList);
			cargoList = null;
		}
	}

	public boolean verificationParametes(Flight flight) {
		if (flight != null) {
			if (flight.getAircraft() != null && flight.getCargoList() != null) {
				float totalWeight = flight.getCargoList().getTotalWeight();
				float totalScope = flight.getCargoList().getTotalScope();
				float capacityCargo = flight.getAircraft().getCapacityCargo();
				float carryingCapasity = flight.getAircraft().getCarryingCapasity();
				if (totalWeight <= carryingCapasity && totalScope <= capacityCargo) {
					return true;
				}
			} Print.print("Absent Aircraft or Cargo List");
		}
		return false;
	}

	public void showCargoList() {
		if (cargoList != null) {
			for (int i = 0; i < cargoList.getSize(); i++) {
				Print.print(cargoList.getCargo(i).toString());
			}
			Print.print("Total weight= " + cargoList.getTotalWeight() + ", Total scope= " + cargoList.getTotalScope());
		} else {
			Print.print("CargoList is empty");
		}
	}
}
