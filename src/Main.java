public class Main {

    // Задание 1
    // Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера или
    // телефона, а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться мобильным приложением.
    // Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку на скачивание
    // приложения. Но мы не знаем, iOS или Android он использует.
    //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее
    // сообщение для обоих вариантов.
    //Объявите переменную clientOS, которая равна 0 или 1. Где 0 — iOS, 1 — Android.
    //При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
    //Например, для iOS оно будет звучать так:
    //«Установите версию приложения для iOS по ссылке».
    //А для Android так:
    //«Установите версию приложения для Android по ссылке».

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int clientOS = 0;
        int clientDeviceYear = 2010;
        if ((clientOS == 0) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ((clientOS == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if ((clientOS == 1) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((clientOS == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int year = 2204;

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if ((year % 4 != 0) || (year % 100 == 0)) {
            System.out.println(year + " год не является високосным.");
        } else System.out.println(year + " год является високосным.");
    }

    public static void task3() {
        int deliveryDistance = 55;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        }
        if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            deliveryDays = 2;
        }
        if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
            deliveryDays = 3;
        }
        switch (deliveryDays) {
            case 1:
            case 2:
            case 3:
                System.out.println("Потребуется дней: " + deliveryDays);
                break;
        }
    }

    public static void task4() {
        int monthNumber = 12;
        char Month = 'z';
        if ((monthNumber == 12) || (monthNumber == 1) || (monthNumber == 2)) {
            Month = 'z';
        }
        if ((monthNumber >= 3) && (monthNumber <= 5)) {
            Month = 'v';
        }
        if ((monthNumber >= 6) && (monthNumber <= 8)) {
            Month = 'l';
        }
        if ((monthNumber >= 9) && (monthNumber <= 11)) {
            Month = 'o';
        }
        switch (Month) {
            case 'z':
                System.out.println(monthNumber + " месяц относиться к сезону зима.");
                break;
            case 'v':
                System.out.println(monthNumber + " месяц относиться к сезону весна.");
                break;
            case 'l':
                System.out.println(monthNumber + " месяц относиться к сезону лето.");
                break;
            case 'o':
                System.out.println(monthNumber + " месяц относиться к сезону осень.");
                break;
            default:
                System.out.println("Такого месяцф не существует");
        }
    }
}