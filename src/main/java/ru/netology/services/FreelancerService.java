package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // количество месяцев
        int money = 0; // количество денег на счету первоначально
        for (int month = 0; month < 12; month = month + 1) {
            if (money >= threshold) { // можем ли отдыхать?
                count = count + 1; // увеличиваем кол-во месяцев
                money = (money - expenses) / 3;

            } else {
                // работаем
                money = money + income - expenses;
            }
        }
        return count;
    }
}

