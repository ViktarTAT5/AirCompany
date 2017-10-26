package by.htp.airline.domen.transport.aircraft;

public class PassengerAirplane extends Aircraft {
	private int capacityPasangers;
	private int numberOfDesks;

	public PassengerAirplane() {

	}

	public PassengerAirplane(String title, String model, int id, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption, int capacityPasangers, int numberOfDesks) {
		super(title, model, id, capacityCargo, carryingCapasity, rangeOfFlight, fuelConsumption);
		this.capacityPasangers = capacityPasangers;
		this.numberOfDesks = numberOfDesks;
	}

	
	public int getCapacityPasangers() {
		return capacityPasangers;
	}

	public void setCapacityPasangers(int capacityPasangers) {
		this.capacityPasangers = capacityPasangers;
	}

	public int getNumberOfDesks() {
		return numberOfDesks;
	}

	public void setNumberOfDesks(int numberOfDesks) {
		this.numberOfDesks = numberOfDesks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacityPasangers;
		result = prime * result + numberOfDesks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassengerAirplane other = (PassengerAirplane) obj;
		if (capacityPasangers != other.capacityPasangers)
			return false;
		if (numberOfDesks != other.numberOfDesks)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PassengerAirplane [" + super.toString() + "capacityPasangers=" + capacityPasangers + ", numberOfDesks=" + numberOfDesks + "]";
	}

}
