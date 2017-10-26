package by.htp.airline.domen.transport.aircraft;

public class CargoAirplane extends Aircraft {
	private float heightOfCargoHatch;
	private float widthOfCargoHatch;
	private String loadingMechanism;

	public CargoAirplane() {

	}

	public CargoAirplane(String title, String model, int id, float capacityCargo, float carryingCapasity,
			float rangeOfFlight, float fuelConsumption, float heightOfCargoHatch, float widthOfCargoHatch,
			String loadingMechanism) {
		super(title, model, id, capacityCargo, carryingCapasity, rangeOfFlight, fuelConsumption);
		this.heightOfCargoHatch = heightOfCargoHatch;
		this.widthOfCargoHatch = widthOfCargoHatch;
		this.loadingMechanism = loadingMechanism;
	}

	public float getHeightOfCargoHatch() {
		return heightOfCargoHatch;
	}

	public void setHeightOfCargoHatch(float heightOfCargoHatch) {
		this.heightOfCargoHatch = heightOfCargoHatch;
	}

	public float getWidthOfCargoHatch() {
		return widthOfCargoHatch;
	}

	public void setWidthOfCargoHatch(float widthOfCargoHatch) {
		this.widthOfCargoHatch = widthOfCargoHatch;
	}

	public String getLoadingMechanism() {
		return loadingMechanism;
	}

	public void setLoadingMechanism(String loadingMechanism) {
		this.loadingMechanism = loadingMechanism;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(heightOfCargoHatch);
		result = prime * result + ((loadingMechanism == null) ? 0 : loadingMechanism.hashCode());
		result = prime * result + Float.floatToIntBits(widthOfCargoHatch);
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
		CargoAirplane other = (CargoAirplane) obj;
		if (Float.floatToIntBits(heightOfCargoHatch) != Float.floatToIntBits(other.heightOfCargoHatch))
			return false;
		if (loadingMechanism == null) {
			if (other.loadingMechanism != null)
				return false;
		} else if (!loadingMechanism.equals(other.loadingMechanism))
			return false;
		if (Float.floatToIntBits(widthOfCargoHatch) != Float.floatToIntBits(other.widthOfCargoHatch))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CargoAirplane [" + super.toString() + " heightOfCargoHatch=" + heightOfCargoHatch
				+ ", widthOfCargoHatch=" + widthOfCargoHatch + ", loadingMechanism=" + loadingMechanism + "]";
	}

}
