package com.bridgelabz.employee;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int PRESENT_NUMBER_RANGE = 3;
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int WORKING_HOUR = 8;
		final int MAX_WORKING_DAY = 20;
		final int MAX_WORKING_HOUR = 80;

		int totalWorkingHour = 0;
		int day = 0;

		while (day < MAX_WORKING_DAY && (totalWorkingHour + WORKING_HOUR / 2) < MAX_WORKING_HOUR) {
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
			day++;
		}

		double salary = totalWorkingHour * WAGE_PER_HOUR;
		System.out
				.println("Employee monthly wage : $" + salary + " USD (total working hour : " + totalWorkingHour + ")");
		System.out.println("Total working day : " + day);
	}

}