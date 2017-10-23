package by.htp.airline.domen.cargo;

public class Cargo {
	private String title;
	private int id;
	private float weight;
	private float scope;

	public Cargo(String title, int id, float weight, float scope) {
		this.title = title;
		this.id = id;
		this.weight = weight;
		this.scope = scope;
	}

	public String getTitle() {
		return title;
	}

	public int getId() {
		return id;
	}

	public float getWeight() {
		return weight;
	}

	public float getScope() {
		return scope;
	}

	@Override
	public String toString() {
		return "Cargo [title=" + title + ", id=" + id + ", weight=" + weight + ", scope=" + scope + "]";
	}

}
