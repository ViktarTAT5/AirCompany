package by.htp.airline.domen.transport.ship.bulkcarrier;

import by.htp.airline.domen.transport.ship.Bulkcarrier;

public class Rouler extends Bulkcarrier {
	private int numberOfCars;

	public Rouler() {

	}

	public Rouler(String title, int displacement, float cargoCapacity, int numberOfCars) {
		super(title, displacement, cargoCapacity);
		this.numberOfCars = numberOfCars;
	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfCars;
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
		Rouler other = (Rouler) obj;
		if (numberOfCars != other.numberOfCars)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rouler [" + super.toString() + " numberOfCars=" + numberOfCars + "]";
	}

}
