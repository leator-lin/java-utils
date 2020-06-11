package com.lea.myArrayUtils;

public class Item implements Comparable<Item> {
	private String description;
	private int partNumber;
	
	public Item(int partNumber) {
		super();
		this.partNumber = partNumber;
	}
	
	public Item(String description, int partNumber) {
		super();
		this.description = description;
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	@Override
	public int compareTo(Item o) {
		return partNumber - o.partNumber;
	}

	@Override
	public String toString() {
		return "[description=" + description +", partNumber=" + partNumber + "]";
	}
}
