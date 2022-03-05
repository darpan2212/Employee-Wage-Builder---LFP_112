package com.bridgelabz.employee;

public class EmployeeWageBuilder {

	final int PRESENT_NUMBER_RANGE = 3;
	final int PRESENT = 1;
	final int PART_TIME = 2;
	final int WORKING_HOUR = 8;

	public int getWorkingHour(int empPresent) {
		switch (empPresent) {
		case PRESENT:
			return WORKING_HOUR;

		case PART_TIME:
			return WORKING_HOUR / 2;

		}
		return 0;
	}

	public double calculateEmpWage(String company, int maxWorkingDay, int maxWorkingHour, int wagePerHour) {
		System.out.println("Calculating the wage for " + company + "'s employee");
		int totalWorkingHour = 0;
		int day = 0;

		while (day < maxWorkingDay && totalWorkingHour < maxWorkingHour) {
			int isPresent;
			int remainingWorkingHour = maxWorkingHour - totalWorkingHour;
			if (remainingWorkingHour < WORKING_HOUR && !(remainingWorkingHour < (WORKING_HOUR / 2))) {
				isPresent = PART_TIME;
			} else if (remainingWorkingHour < (WORKING_HOUR / 2)) {
				break;
			} else {
				isPresent = (int) (Math.random() * PRESENT_NUMBER_RANGE);
			}

			totalWorkingHour = totalWorkingHour + getWorkingHour(isPresent);
			day++;
		}

		double salary = totalWorkingHour * wagePerHour;
		System.out
				.println("Employee monthly wage : $" + salary + " USD (total working hour : " + totalWorkingHour + ")");
		System.out.println("Total working day : " + day);
		return salary;
	}

	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.calculateEmpWage("Dmart", 20, 80, 20);
		System.out.println("---------------------------------");
		empWageBuilder.calculateEmpWage("RIL", 15, 50, 30);
		System.out.println("---------------------------------");
		empWageBuilder.calculateEmpWage("TCS", 18, 60, 40);
	}
}