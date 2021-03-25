package com.empwagebuildersolution;

public class EmpWageBuilderSolution {

	public static void main(String[] args) {
		System.out.println("Welcome to empwage");
		int IS_EMP_PRESENT=1;
		final int EMP_RATE_PER_HR=20;
		final int IS_FULL_TIME_HRS=8;
		double empCheck = Math.floor(Math.random() * 10 %2 );
		if(empCheck == IS_EMP_PRESENT) {	
			System.out.println("Employee is Present");
			int salary = EMP_RATE_PER_HR * IS_FULL_TIME_HRS;
			System.out.println("Salary  "+salary);
		}



	}

}
