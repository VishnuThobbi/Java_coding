package com.hsbc.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HSBCCompany {

	static List<Employee> list = new ArrayList<>();

	static void createEmployeeList() {

		for (int i = 0; i < 10; i++) {
			Contractor contractor = new Contractor();
			list.add(contractor);
		}
		for (int i = 0; i < 20; i++) {
			HSBCStaff hsbcStaff = new HSBCStaff();
			list.add(hsbcStaff);
		}

		for (int i = 0; i < 20; i++) {
			HRStaff hrStaff = new HRStaff();
			list.add(hrStaff);
		}

		for (int i = 0; i < 5; i++) {
			HSBCBankStaff bankStaff = new HSBCBankStaff();
			list.add(bankStaff);
		}
		System.out.println(list);

	}

	float calculateTotalSalary() {
		float totalSalary = 0;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCCompany company = new HSBCCompany();
		createEmployeeList();
		float totalSalary = company.calculateTotalSalary();
		System.out.println(totalSalary);
	}

}