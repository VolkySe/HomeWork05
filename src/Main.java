import java.time.LocalDate;

public class Main {
    public static void task1() {
        short year = 2100; //ввод номера года
        if (checkLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static boolean checkLeapYear(int year) {
        boolean isLeapYear = ((year / 400 * 400 == year && year > 1584)
                || (year / 4 * 4 == year && !(year / 100 * 100 == year) && year > 1584));
        return isLeapYear;
    }

    public static void task2() {
        int clientDeviceYear = 2015; //ввод года телефона
        byte clientOS = 1; //повторный ввод типа телефона:  Android - true, iPhone - false
        printAppOffer(clientOS, clientDeviceYear);
    }

    public static void printAppOffer(byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > clientDeviceYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (currentYear > clientDeviceYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (currentYear > clientDeviceYear && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (currentYear > clientDeviceYear && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Используйте веб-версию приложения по ссылке");
        }
    }

    public static void task3() {
//        int deliveryDistance = 20; // ввод расстояния до клиента
//
//        System.out.println("Для доставки на расстояние " + deliveryDistance + " потребуется дней: " + deliveryDays);
//        public static int calculateDeliveryTiming (int deliveryDays) {
//            boolean isLeapYear = ((deliveryDays / 400 * 400 == deliveryDays && deliveryDays > 1584)
//                    || (deliveryDays / 4 * 4 == deliveryDays && !(deliveryDays / 100 * 100 == deliveryDays) && deliveryDays > 1584));
//            return isLeapYear;
//        }
//        public static int calculateDeliveryTiming ( int deliveryDays) {
////            int deliveryLocal = 20; //ближняя доставка не менее одного дня в любом случае
////            int deliveryInterval = 40;
////            int deliveryLimit = 100;
////
////            if (deliveryDistance > deliveryLimit) {
////                System.out.println("Свыше " + deliveryLimit + " км доставки нет");
////            } else if (deliveryDistance < 0) {
////                System.out.println("Введены неточные данные");
////            } else {
////                deliveryDays = 1 + ((deliveryDistance - deliveryLocal) / deliveryInterval);
////            }
////            return deliveryDays;
//        }
    }


    public static void main(String[] args) {
//

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();


//        System.out.println("Task4");
//

//
//        System.out.println("Task5");
//
//        byte monthNumber = 12; // ввод номера месяца
//
//        var seasonName = "осени"; //по умолчанию
//        switch (monthNumber) {
//            case 12, 1, 2:
//                seasonName = "зиме";
//                break;
//            case 3, 4, 5:
//                seasonName = "весне";
//                break;
//            case 6, 7, 8:
//                seasonName = "лету";
//                break;
//            default:
//        }
//        if (monthNumber < 1 && monthNumber > 12) {
//            System.out.println("Нет такого месяца в году: " + monthNumber);
//        } else {
//            System.out.println("Месяц с номером " + monthNumber + " принадлежит " + seasonName);
//        }
    }
}