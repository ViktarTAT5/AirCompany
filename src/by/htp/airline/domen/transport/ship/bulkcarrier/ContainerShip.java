package by.htp.airline.domen.transport.ship.bulkcarrier;

import by.htp.airline.domen.transport.ship.Bulkcarrier;

public class ContainerShip extends Bulkcarrier {
	private int numberOfContainer;

	public ContainerShip() {

	}

	public ContainerShip(String title, int displacement, float cargoCapacity, int numberOfContainer) {
		super(title, displacement, cargoCapacity);
		this.numberOfContainer = numberOfContainer;
	}

	public int getNumberOfContainer() {
		return numberOfContainer;
	}

	public void setNumberOfContainer(int numberOfContainer) {
		this.numberOfContainer = numberOfContainer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfContainer;
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
		ContainerShip other = (ContainerShip) obj;
		if (numberOfContainer != other.numberOfContainer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContainerShip [numberOfContainer=" + numberOfContainer + "]";
	}
}
