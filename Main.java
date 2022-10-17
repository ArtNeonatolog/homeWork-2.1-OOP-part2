public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    private static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        Car car1 = new Car ("Lada", "Granta", 1.7f, "желтый", 2015, "Россия");
        car1.informationOfTheCar();
        System.out.println();

        Car car2 = new Car ("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        car2.informationOfTheCar();
        System.out.println();

        Car car3 = new Car ("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        car3.informationOfTheCar();
        System.out.println();

        Car car4 = new Car ("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        car4.informationOfTheCar();
        System.out.println();

        Car car5 = new Car ("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        car5.informationOfTheCar();
        System.out.println();
    }

    private static void task1() {
        System.out.println();
        System.out.println("Задание 1");
        Human human1 = new Human ("Максим", 35, "Минск", "бренд-менеджер");
        human1.informationOgHuman();
        System.out.println();

        Human human2 = new Human ("Аня", 29, "Москва", "методист образовательных программ");
        human2.informationOgHuman();
        System.out.println();

        Human human3 = new Human ("Катя", 28, "Калининград", "продакт-менеджер");
        human3.informationOgHuman();
        System.out.println();

        Human human4 = new Human ("Артем", 27, "Москва", "директор по развитию бизнеса");
        human3.informationOgHuman();
        System.out.println();

    }
}
