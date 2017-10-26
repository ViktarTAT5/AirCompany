package by.htp.airline.domen.transport.ship;

public class Bulkcarrier extends Ship {
	private float cargoCapacity;

	public Bulkcarrier() {

	}

	public Bulkcarrier(String title, String model, int id, int displacement, float cargoCapacity) {
		super(title, model, id, displacement);
		this.cargoCapacity = cargoCapacity;
	}

	public float getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(float cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(cargoCapacity);
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
		Bulkcarrier other = (Bulkcarrier) obj;
		if (Float.floatToIntBits(cargoCapacity) != Float.floatToIntBits(other.cargoCapacity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bulkcarrier [" + super.toString() + " cargoCapacity=" + cargoCapacity + "]";
	}

}
