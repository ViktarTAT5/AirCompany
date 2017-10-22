package by.htp.airline.domen;

public class Aircraft {
	private int id;
	private Tipe tipe;
	private String model;
	private int capacityPasangers;
	private float capacityCargo;
	private float carryingCapasity;
	private float rangeOfFlight;
	private float fuelConsumption;
	
	public Aircraft(int id, Tipe tipe, String model, int capacityPasangers, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption) {
		super();
		this.id = id;
		this.tipe = tipe;
		this.model = model;
		this.capacityPasangers = capacityPasangers;
		this.capacityCargo = capacityCargo;
		this.carryingCapasity = carryingCapasity;
		this.rangeOfFlight = rangeOfFlight;
		this.fuelConsumption = fuelConsumption;
	}

	public int getId() {
		return id;
	}

	public Tipe getTipe() {
		return tipe;
	}

	public String getModel() {
		return model;
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
		return "Aircraft [model=" + model + ", tipe=" + tipe + ", id=" + id + ", capacityPasangers=" + capacityPasangers
				+ ", capacityCargo=" + capacityCargo + ", carryingCapasity=" + carryingCapasity + ", rangeOfFlight="
				+ rangeOfFlight + ", fuelConsumption=" + fuelConsumption + "]";
	}
	
	
	
}
