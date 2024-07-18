public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");

        boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Task2");

        byte yearOfMobile = 14;
        boolean isYearOfMobileBefore2015 = (yearOfMobile < 15);
        if (isYearOfMobileBefore2015 && clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (isYearOfMobileBefore2015 && !clientOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!isYearOfMobileBefore2015 && clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!isYearOfMobileBefore2015 && !clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Воспользуйтесь веб-версией приложения по ссылке");
        }

        System.out.println("Task3");

        short year = 2021;

        boolean isLeapYear = ((year / 400 * 400 == year && year > 1584)
                || (year / 4 * 4 == year && !(year / 100 * 100 == year) && year > 1584));
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Task4");

        int deliveryDistance = 95;
        int intervalDelivery = 40;
        int deliveryAdditionalDays;
        var syntaxDelivery = " дня";
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryAdditionalDays = 0;
            syntaxDelivery += " день";
        } else if (deliveryDistance <= deliveryDistance + intervalDelivery){
            deliveryAdditionalDays = 1;
        } else if (deliveryDistance <= deliveryDistance + intervalDelivery * 2){
            deliveryAdditionalDays = 2;
        } else {

        }


    }
}