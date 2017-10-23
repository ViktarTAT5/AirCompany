package by.htp.airline.domen;

public class Aircraft {
	private int id;
	private String model;
	private int capacityPasangers;
	private float capacityCargo;
	private float carryingCapasity;
	private float rangeOfFlight;
	private float fuelConsumption;
	
	public Aircraft(String model, int id, int capacityPasangers, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption) {
		this.model = model;
		this.id = id;
		this.capacityPasangers = capacityPasangers;
		this.capacityCargo = capacityCargo;
		this.carryingCapasity = carryingCapasity;
		this.rangeOfFlight = rangeOfFlight;
		this.fuelConsumption = fuelConsumption;
	}
	
	public String getModel() {
		return model;
	}

	public int getId() {
		return id;
	}

		public int getCapacityPasangers() {
		return capacityPasangers;
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

	@Override
	public String toString() {
		return "[model=" + model + ", id=" + id + ", capacityPasangers=" + capacityPasangers
				+ ", capacityCargo=" + capacityCargo + ", carryingCapasity=" + carryingCapasity + ", rangeOfFlight="
				+ rangeOfFlight + ", fuelConsumption=" + fuelConsumption + "]";
	}
	
	
	
}
