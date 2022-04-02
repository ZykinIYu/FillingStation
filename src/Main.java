public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Информация о системе");
        System.out.print("Операционная система: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.print("Количество ядер процессора: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Количество памяти, доступной JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb\n");

        System.out.println("Задание 2");
        int fuelType = 95;
        int amount = 400;
        double fuel92Price = 60.2;
        double fuel95Price = 67.33;
        double fuelPrice = 0;
        double totalPrice;
        int minAmount = 1;
        int maxAmount = 400;

        System.out.println("Система расчета стоимости топлива");

        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println("Указан неверный тип топлива");
        }

        if (amount < minAmount) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            System.out.println("Количество топлива уменьшено до: " + maxAmount);
            amount = maxAmount;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");

    }
}
