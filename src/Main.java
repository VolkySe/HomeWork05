public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");

        boolean clientOS = true; //ввод типа телефона: Android - true, iPhone - false
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Task2");

        byte clientDeviceYear = 14; //ввод года телефона
        clientOS = true; //повторный ввод типа телефона:  Android - true, iPhone - false

        boolean isClientDeviceYearBefore2015 = (clientDeviceYear < 15);
        if (isClientDeviceYearBefore2015 && clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (isClientDeviceYearBefore2015 && !clientOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!isClientDeviceYearBefore2015 && clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!isClientDeviceYearBefore2015 && !clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Воспользуйтесь веб-версией приложения по ссылке");
        }

        System.out.println("Task3");

        short year = 2021; //ввод номера года

        boolean isLeapYear = ((year / 400 * 400 == year && year > 1584)
                || (year / 4 * 4 == year && !(year / 100 * 100 == year) && year > 1584));
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Task4");

        int deliveryLocal = 20; //ближняя доставка не менее одного дня в любом случае
        int deliveryInterval = 40;
        int deliveryLimit = 100;
        int deliveryDays;
        var deliverySynthax = " дня";

        int deliveryDistance = 20; // ввод расстояния до клиента

        if (deliveryDistance > deliveryLimit) {
            System.out.println("Свыше " + deliveryLimit + " км доставки нет");
        } else if (deliveryDistance < 0) {
            System.out.println("Введены неточные данные");
        } else {
            deliveryDays = 1 + ((deliveryDistance - deliveryLocal) / deliveryInterval);
            if (deliveryDays == 1) {
                deliverySynthax = " день";
            }
            System.out.println("Для доставки на расстояние " + deliveryDistance + " потребуется дней: " + deliveryDays + deliverySynthax);
        }

        System.out.println("Task5");

        byte monthNumber = 12; // ввод номера месяца

        var seasonName = "осени"; //по умолчанию
        switch (monthNumber) {
            case 12, 1, 2:
                seasonName = "зиме";
                break;
            case 3, 4, 5:
                seasonName = "весне";
                break;
            case 6, 7, 8:
                seasonName = "лету";
                break;
            default:
        }
        if (monthNumber < 1 && monthNumber > 12) {
            System.out.println("Нет такого месяца в году: " + monthNumber);
        } else {
            System.out.println("Месяц с номером " + monthNumber + " принадлежит " + seasonName);
        }
    }
}
