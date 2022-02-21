package com.bridgelabz.employee;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int PRESENT_NUMBER_RANGE = 3;
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int WORKING_HOUR = 8;
		final int MAX_WORKING_DAY = 20;

		double totalWorkingHour = 0;

		for (int day = 0; day < MAX_WORKING_DAY; day++) {
			int isPresent = (int) (Math.random() * PRESENT_NUMBER_RANGE);
			switch (isPresent) {
			case PRESENT:
				totalWorkingHour = totalWorkingHour + WORKING_HOUR;
				break;

			case PART_TIME: {
				totalWorkingHour = totalWorkingHour + WORKING_HOUR / 2;
			}
				break;
			}
		}
		double salary = totalWorkingHour * WAGE_PER_HOUR;
		System.out
				.println("Employee monthly wage : $" + salary + " USD (total working hour : " + totalWorkingHour + ")");
	}

}