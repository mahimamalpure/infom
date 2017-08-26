package com.cts.java.beans;

import java.util.ArrayList;
import java.util.List;

public class Employee 
{
	private String id;
	private String name;
	private List<String> assetIdList = new ArrayList<>();

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getAssetIdList() {
		return assetIdList;
	}
	
	public void addAssetIdToList(String assetNumber) {
		this.assetIdList.add(assetNumber);
	}
}