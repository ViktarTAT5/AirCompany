package by.htp.airline.domen.transport.ship;

import by.htp.airline.domen.transport.Transport;

public abstract class Ship extends Transport{
	private int displacement;

	public Ship() {

	}

	public Ship(String title, int displacement) {
		super(title);
		this.displacement = displacement;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + displacement;
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
		Ship other = (Ship) obj;
		if (displacement != other.displacement)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " displacement=" + displacement + ",";
	}

}
