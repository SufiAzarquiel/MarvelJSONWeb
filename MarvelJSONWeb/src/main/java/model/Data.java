package model;

import java.util.List;

public class Data {
	private List<Item> results;

	public List<Item> getResults() {
		return results;
	}

	public void setResults(List<Item> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Data [results=" + results + "]";
	}
}
