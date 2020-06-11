package com.lea.myGatherUtils.comparatorUtil;

import java.util.Objects;

public class Item implements Comparable<Item> {
	private String description;
	private int partNumber;
	
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

	public String toString() {
		return "[description=" + description + ", partNumber=" + partNumber + "]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(this == otherObject) return true;
		if(getClass() != otherObject.getClass()) return false;
		Item other = (Item)otherObject;
		return Objects.equals(description, other.description) && partNumber == other.partNumber;
	}
	
	public int hashCode() {
		return Objects.hash(description, partNumber);
	}
	
	public int compareTo(Item other) {
		return Integer.compare(partNumber, other.partNumber);
	}
	
}
