import transaport.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        cars[0] = new Car("Lada", "Granta", 1.7f, "Желтый", 2015, "Россия", "Механика",
                "Седан", "в345тм", 5, true, null);
        cars[1] = new Car("AUDI", "A8 50 L TDI", 3.0f, "Черный", 2020, "Германия", "Автомат",
                "Пикап", "р387cм", 4, false, new Car.Key(true,false));
        cars[2] = new Car("BMW", "Z8", 3.0f, "Черный", 2021, "Германия", "Автомат",
                "Кабриолет", "к614мс", 6, false, null);
        cars[3] = new Car("Kia", "Sportage 4", 2.4f, "Красный", 2018, "Южная корея", "Механика",
                "Седан", "д320дч", 4, false, new Car.Key(false,false));


        for (int i = 0; i < Car.getCount() - 1; i++) {
            System.out.println(cars[i]);
        }
        cars[3].changeTires(1);
        System.out.println(cars[3]);

    }

}