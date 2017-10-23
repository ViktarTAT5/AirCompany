package by.htp.airline.domen.cargo;

import java.util.ArrayList;
import java.util.List;

public class CargoList {
	private int id;
	private List<Cargo> cargoList;
	private float totalWeight;
	private float totalScope;
	
	public CargoList(int id) {
		this.id = id;
		cargoList = new ArrayList<Cargo>();
	}
	
	public void addCargo(Cargo cargo) {
		cargoList.add(cargo);
	}
	
	public Cargo getCargo(int index) {
		return cargoList.get(index);
	}
	
	public void delCargo(int index) {
		cargoList.remove(index);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public int getSize() {
		return cargoList.size();
	}
	
	
}
