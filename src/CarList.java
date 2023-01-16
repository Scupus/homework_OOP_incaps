public class CarList {
    private Transport.Car[] cars = new Transport.Car[10];

    {
        cars[0] = new Transport.Car("Lada", "Granta", 1.7f, "Желтый", 2015, "Россия", "Механика",
                "Седан", "в345тм", 5, "Зимняя");
        cars[1] = new Transport.Car("AUDI", "A8 50 L TDI", 3.0f, "Черный", 2020, "Германия","Автомат",
                "Пикап", "р387cм", 4, "Летняя");
        cars[2] = new Transport.Car("BMW", "Z8", 3.0f, "Черный", 2021, "Германия", "Автомат",
                "Кабриолет", "к614мс", 6, "Летняя");
        cars[3] = new Transport.Car("Kia", "Sportage 4", 2.4f, "Красный", 2018, "Южная корея", "Механика",
                "Седан", "д320дч", 4,"Летняя");
    }
    public void printCarList() {

        for (int i = 0; i < Transport.Car.getCount() - 1; i++) {
            System.out.println(cars[i]);
        }
    }
}
