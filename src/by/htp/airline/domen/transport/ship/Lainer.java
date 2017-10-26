package by.htp.airline.domen.transport.ship;

public class Lainer extends Ship {
	private int numberOfPassenger;

	public Lainer() {

	}

	public Lainer(String title, String model, int id, int displacement, int numberOfPassenger) {
		super(title, model, id, displacement);
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfPassenger;
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
		Lainer other = (Lainer) obj;
		if (numberOfPassenger != other.numberOfPassenger)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lainer [" + super.toString() + "numberOfPassenger=" + numberOfPassenger + "]";
	}

}
