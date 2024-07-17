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
        byte yearOfProduct = 14;
        boolean isProductYearBefore2015 = (yearOfProduct < 15);
        if (isProductYearBefore2015 && clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (isProductYearBefore2015 && !clientOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!isProductYearBefore2015 && clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!isProductYearBefore2015 && !clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }
}