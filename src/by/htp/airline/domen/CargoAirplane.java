package by.htp.airline.domen;

public class CargoAirplane extends Aircraft {
	public CargoAirplane(String model, int id, int capacityPasangers, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption) {
		super(model, id, capacityPasangers, capacityCargo, carryingCapasity, rangeOfFlight, fuelConsumption);
		}
	
	@Override
	public String toString() {
		return "CargoAirplane " + super.toString();
	}
}
