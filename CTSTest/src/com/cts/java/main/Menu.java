package com.cts.java.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.cts.java.beans.Asset;
import com.cts.java.beans.Employee;
import com.cts.java.db.Database;

public class Menu
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of Employees :");
		String employeeCntStr = br.readLine();
		int employeeCnt = Integer.parseInt(employeeCntStr);

		for(int i = 1; i <= employeeCnt; i++)
		{
			System.out.println("Enter the employee details " + i + " :");

			System.out.println("Employee Name:");
			String employeeName = br.readLine();

			System.out.println("Employee Number:");
			String employeeNumber = br.readLine();

			Employee employee = new Employee();
			employee.setId(employeeNumber);
			employee.setName(employeeName);
			
			System.out.println("Enter the number of Assets used :");
			String assetCntStr = br.readLine();
			int assetCnt = Integer.parseInt(assetCntStr);

			System.out.println("");
			
			for(int j = 1; j <= assetCnt; j++)
			{
				System.out.println("Enter the asset details " + j + " :");

				System.out.println("Asset Name:");
				String assetName = br.readLine();

				System.out.println("Asset Number:");
				String assetNumber = br.readLine();
				
				Asset asset = new Asset();
				asset.setId(assetNumber);
				asset.setName(assetName);
				
				employee.addAssetIdToList(assetNumber);
				Database.addAsset(assetNumber, asset);
			}
			
			Database.addEmployee(employeeNumber, employee);
		}
		
		System.out.println("");

		Database.displayAllEmployees();
		
		System.out.println("");

		System.out.println("Enter the user name to find asset details:");
		String employeeNameToFindAsset = br.readLine();

		List<String> assetIdList = Database.getAssetForEmployee(employeeNameToFindAsset);

		System.out.println("");

		Database.displayAssets(assetIdList, employeeNameToFindAsset);
		
		System.out.println("");

		System.out.println("Enter the assetId to find asset users:");
		String assetIdoFindUsers = br.readLine();

		List<Employee> employeeList = Database.getEmployeeForAsset(assetIdoFindUsers);

		System.out.println("");

		Database.displayEmployeesForAsset(employeeList, assetIdoFindUsers);
		
		System.out.println("");
	}
}
