package ru.netology.services;

public class MonthlyVacationsService {

    public int monthlyVacationsCounter(int income, int expenses, int threshold) {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative");
        }
        if (expenses < 0) {
            throw new IllegalArgumentException("Expenses cannot be negative");
        }
        if (threshold < 0) {
            throw new IllegalArgumentException("Threshold cannot be negative");
        }

        int employeeMoney = 0;
        int counterVacationMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (employeeMoney >= threshold) {
                employeeMoney = (employeeMoney - expenses) / 3;
                counterVacationMonth++;
            } else {
                employeeMoney += income - expenses;
            }
        }
        return counterVacationMonth;
    }
}
