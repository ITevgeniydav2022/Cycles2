public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total += salary;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }
        System.out.println(i + " месяца ");

        // Задание 2
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int totalPopulation = 12_000_000;
        int manWasBorn = 17;
        int deadMans = 8;
        int totalFertility = (totalPopulation / 1000) * (manWasBorn - deadMans);
        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation + totalFertility;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation + " человек ");

        }
        // Задание 4
        System.out.println("Задание 4");
        int salary1 = 15_000;
        int percent = 7;
        int desiredAmount = 12_000_000;
        int month = 0;
        while (salary1 < desiredAmount) {
            salary1 = salary1 + (salary1 * percent / 100);
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений " + salary1);
        }
        System.out.println(month + " месяцев ");

        // Задание 5
        System.out.println("Задание 5");
        int salary2 = 15_000;
        int percent1 = 7;
        int desiredAmount1 = 12_000_000;
        int month1 = 0;
        while (salary2 < desiredAmount1) {
            salary2 = salary2 + (salary2 * percent1 / 100);
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " ,сумма накоплений " + salary2);
            }
        }
        // Задание 6
        System.out.println("Задание 6");
        int salary3 = 15_000;
        int percent2 = 7;
        month = 0;
        int years = 9;
        int monthsYear = 12;

        while (month < years * monthsYear) {
            salary3 = salary3 + (salary3 * percent2 / 100);
            month++;
            if (month % 6 == 0) {
                System.out.println("Накопления за " + month + " месяцев составляет " + salary3);
            }
        }
        // Задание 7
        System.out.println("Задание 7");
        int firstFriday = 2;

        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            firstFriday += 7;
        }
        // Задание 8
        System.out.println("Задание 8");
        final int COMETS_PASSING = 79;
        int currentYear = 2022;
        int openingBalance = currentYear - 200;
        int closeBalance = currentYear + 100;
        int period = 0;

        while (period <= currentYear) {
            period += COMETS_PASSING;

            if (period >= openingBalance && period <= closeBalance) {
                System.out.println("Комета пролетит в " + period + " году");
            }
        }
        // Задание 9
        System.out.println("Задание 9");
        int multiplier = 2;
        for (int m = 1; m <= 10; m++) {
            System.out.println(multiplier + "" + "*" + m + "=" + multiplier * m);
        }
    }
}

