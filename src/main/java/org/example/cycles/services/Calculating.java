package org.example.cycles.services;

public class Calculating {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц ");
            System.out.print(month);
            System.out.print(". Денег ");
            System.out.print(money);
            if (money >= threshold) { // можем ли отдыхать?
                System.out.print(". Буду отдыхать. Потратил -");
                System.out.print(expenses);
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                System.out.print(", затем ещё -");
                System.out.println((money / 3) * 2);
                money = money - (money / 3) * 2;

            } else {
                System.out.print(". Прийдётся работать. Заработал +");
                System.out.print(income);
                System.out.print(", потратил -");
                System.out.println(expenses);
                money = money + income;
                money = money - expenses;
            }
        }
        System.out.print("В итоге он отдыхал: ");
        System.out.print(count);
        System.out.print(" месяцев");
        return count;
    }
}