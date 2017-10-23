package by.htp.airline.domen.aircraft;

public class PassengerAirplane extends Aircraft {
	public PassengerAirplane(String model, int id, int capacityPasangers, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption) {
		super(model, id, capacityPasangers, capacityCargo, carryingCapasity, rangeOfFlight, fuelConsumption);
	}

	@Override
	public String toString() {
		return "PassengerAirplane " + super.toString();
	}
	
	
}
