package by.htp.airline.domen.transport.train;

public class ElectricTrain extends Train {
	private int capacityBattery;

	public ElectricTrain() {
	}

	public ElectricTrain(String title, String model, int id, int widthTrack, int capacityBattery) {
		super(title, model, id, widthTrack);
		this.capacityBattery = capacityBattery;
	}

	public int getCapacityBattery() {
		return capacityBattery;
	}

	public void setCapacityBattery(int capacityBattery) {
		this.capacityBattery = capacityBattery;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacityBattery;
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
		ElectricTrain other = (ElectricTrain) obj;
		if (capacityBattery != other.capacityBattery)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ElectricTrain [ " + super.toString() + " capacityBattery=" + capacityBattery + "]";
	}

}
