package by.htp.airline.domen.transport.aircraft;

import by.htp.airline.domen.transport.Transport;

public class Aircraft extends Transport {

	private float capacityCargo;
	private float carryingCapasity;
	private float rangeOfFlight;
	private float fuelConsumption;

	public Aircraft() {

	}

	public Aircraft(String title, String model, int id, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption) {
		super(title, model, id);
		this.capacityCargo = capacityCargo;
		this.carryingCapasity = carryingCapasity;
		this.rangeOfFlight = rangeOfFlight;
		this.fuelConsumption = fuelConsumption;
	}

	public float getCapacityCargo() {
		return capacityCargo;
	}

	public float getCarryingCapasity() {
		return carryingCapasity;
	}

	public float getRangeOfFlight() {
		return rangeOfFlight;
	}

	public float getFuelConsumption() {
		return fuelConsumption;
	}

	public void setCapacityCargo(float capacityCargo) {
		this.capacityCargo = capacityCargo;
	}

	public void setCarryingCapasity(float carryingCapasity) {
		this.carryingCapasity = carryingCapasity;
	}

	public void setRangeOfFlight(float rangeOfFlight) {
		this.rangeOfFlight = rangeOfFlight;
	}

	public void setFuelConsumption(float fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(capacityCargo);
		result = prime * result + Float.floatToIntBits(carryingCapasity);
		result = prime * result + Float.floatToIntBits(fuelConsumption);
		result = prime * result + Float.floatToIntBits(rangeOfFlight);
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
		Aircraft other = (Aircraft) obj;
		if (Float.floatToIntBits(capacityCargo) != Float.floatToIntBits(other.capacityCargo))
			return false;
		if (Float.floatToIntBits(carryingCapasity) != Float.floatToIntBits(other.carryingCapasity))
			return false;
		if (Float.floatToIntBits(fuelConsumption) != Float.floatToIntBits(other.fuelConsumption))
			return false;
		if (Float.floatToIntBits(rangeOfFlight) != Float.floatToIntBits(other.rangeOfFlight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " capacityCargo= " + capacityCargo + ", carryingCapasity= " + carryingCapasity
				+ ", rangeOfFlight= " + rangeOfFlight + ", fuelConsumption= " + fuelConsumption + ",";
	}

}
