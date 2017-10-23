package by.htp.airline.domen.cargo;

import java.util.ArrayList;
import java.util.List;

public class CargoList {
	private List<Cargo> cargoList;
	private float totalWeight;
	private float totalScope;
	
	public CargoList() {
		cargoList = new ArrayList<Cargo>();
	}
	
	public void add(Cargo cargo) {
		cargoList.add(cargo);
	}
	
	public Cargo get(int index) {
		return cargoList.get(index);
	}

	public float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}

	public float getTotalScope() {
		return totalScope;
	}

	public void setTotalScope(float totalScope) {
		this.totalScope = totalScope;
	}
	
	
}
