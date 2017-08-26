package com.cts.java.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cts.java.beans.Asset;
import com.cts.java.beans.Employee;

public class Database 
{
	private static Map<String, Employee> employeeMap = new HashMap<String, Employee>();
	private static Map<String, Asset> assetMap = new HashMap<String, Asset>();
	
	public static void addEmployee(String employeeId, Employee employee)
	{
		employeeMap.put(employeeId, employee);
	}
	
	public static void addAsset(String assetId, Asset asset)
	{
		assetMap.put(assetId, asset);
	}
	
	public static Employee getEmployee(String employeeId)
	{
		return employeeMap.get(employeeId);
	}
	
	public static Asset getAsset(String assetId)
	{
		return assetMap.get(assetId);
	}

	public static void displayAllEmployees() 
	{
		Set<String> keyset = employeeMap.keySet();
		Iterator<String> itr = keyset.iterator();
		
		System.out.println("EmployeeId EmployeeName");

		while(itr.hasNext())
		{
			String employeeId = itr.next();
			Employee employee = employeeMap.get(employeeId);
			
			System.out.println(employee.getId() + " " + employee.getName());
		}
	}

	public static List<String> getAssetForEmployee(String employeeNameToFindAsset) 
	{
		Set<String> keyset = employeeMap.keySet();
		Iterator<String> itr = keyset.iterator();

		while(itr.hasNext())
		{
			String employeeId = itr.next();
			Employee employee = employeeMap.get(employeeId);

			if(employee.getName().equals(employeeNameToFindAsset))
			{
				return employee.getAssetIdList();
			}
		}
		
		return null;
	}
	
	public static void displayAssets(List<String> assetIdList, String employeeNameToFindAsset) 
	{
		System.out.println("Assets for " + employeeNameToFindAsset + " are:");
		System.out.println("AssetId AssetName");

		for(int i = 0; i < assetIdList.size(); i++)
		{
			String assetId = assetIdList.get(i);		
			Asset asset = getAsset(assetId);
			System.out.println(asset.getId() + " " + asset.getName());
		}
	}

	public static List<Employee> getEmployeeForAsset(String assetIdoFindUsers) 
	{
		List<Employee> employeeList = new ArrayList<>();
		
		Set<String> keyset = employeeMap.keySet();
		Iterator<String> itr = keyset.iterator();

		while(itr.hasNext())
		{
			String employeeId = itr.next();
			Employee employee = employeeMap.get(employeeId);

			List<String> assetIdList = employee.getAssetIdList();
			
			if(assetIdList.contains(assetIdoFindUsers))
			{
				employeeList.add(employee);
			}
		}
		
		return employeeList;
	}
	
	public static void displayEmployeesForAsset(List<Employee> employeeList, String assetIdoFindUsers) 
	{
		System.out.println("Users for " + assetIdoFindUsers + " are:");
		System.out.println("EmployeeId EmployeeName");

		for(int i = 0; i < employeeList.size(); i++)
		{
			Employee employee = employeeList.get(i);		
			System.out.println(employee.getId() + " " + employee.getName());
		}
	}
}