package by.htp.airline.domen.transport.train;

public class DieselTrain extends Train{
	private int capacityTank;

	public DieselTrain() {
	}

	public DieselTrain(String title, int widthTrack, int capacityTank) {
		super(title, widthTrack);
		this.capacityTank = capacityTank;
	}

	public int getCapacityTank() {
		return capacityTank;
	}

	public void setCapacityTank(int capacityTank) {
		this.capacityTank = capacityTank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacityTank;
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
		DieselTrain other = (DieselTrain) obj;
		if (capacityTank != other.capacityTank)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DieselTrain [" + super.toString() + " capacityTank=" + capacityTank + "]";
	}
}
