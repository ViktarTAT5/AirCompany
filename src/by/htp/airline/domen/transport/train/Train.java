package by.htp.airline.domen.transport.train;

import by.htp.airline.domen.transport.Transport;

public abstract class Train extends Transport {
	private int widthTrack;

	public Train() {
	}

	public Train(String title, String model, int id, int widthTrack) {
		super(title, model, id);
		this.widthTrack = widthTrack;
	}

	public int getWidthTrack() {
		return widthTrack;
	}

	public void setWidthTrack(int widthTrack) {
		this.widthTrack = widthTrack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + widthTrack;
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
		Train other = (Train) obj;
		if (widthTrack != other.widthTrack)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " widthTrack= " + widthTrack + ", ";
	}
}
