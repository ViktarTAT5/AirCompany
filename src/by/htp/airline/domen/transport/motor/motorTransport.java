package by.htp.airline.domen.transport.motor;

import by.htp.airline.domen.transport.Transport;

public abstract class motorTransport extends Transport {
	private String engineType;

	public motorTransport() {

	}

	public motorTransport(String title, String model, int id, String engineType) {
		super(title, model, id);
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
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
		motorTransport other = (motorTransport) obj;
		if (engineType == null) {
			if (other.engineType != null)
				return false;
		} else if (!engineType.equals(other.engineType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "motorTransport [engineType=" + engineType + "]";
	}

	

}
