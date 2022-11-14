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
        System.out.println(total);
        System.out.println(i);

        // Задание 2
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " " );
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
    }
}