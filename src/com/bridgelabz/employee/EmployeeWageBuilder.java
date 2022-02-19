package com.bridgelabz.employee;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int PRESENT_NUMBER_RANGE = 3;
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int WORKING_HOUR = 8;

		int isPresent = (int) (Math.random() * PRESENT_NUMBER_RANGE);

		int empWage;

		switch (isPresent) {
		case PRESENT:
			System.out.println("Employee is present");
			empWage = WAGE_PER_HOUR * WORKING_HOUR;
			break;

		case PART_TIME: {
			System.out.println("Employee is working part time");
			empWage = WAGE_PER_HOUR * (WORKING_HOUR / 2);
		}
			break;

		default:
			System.out.println("Employee is absent");
			empWage = 0;
			break;
		}
		System.out.println("Emp wage : $" + empWage + " USD");
	}

}