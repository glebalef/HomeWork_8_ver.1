public class Main {

    public static void main(String[] args) {
        // Задача 1
        int year = 1700;
        indicateLeapYear(year);
        // Задача 2
        int osType = 2;
        int deviceYear = 2008;
        chooseOS(deviceYear, osType);
        // Задача 3
        int distance = 120;
        System.out.println("Потребуется дней: "+calculateDeliveryDays(distance));
    }

    // Метод для Задачи 1
    private static void indicateLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    // Метод для Задачи 2
    private static void chooseOS(int deviceYear, int systemType) {

        if (systemType == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (systemType == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (systemType == 2 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (systemType == 2 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    // Метод для Задачи 3
    private static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryPeriod = deliveryDistance / 40;
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (deliveryPeriod + 1);
            }
        }
    }

