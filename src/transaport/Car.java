package transaport;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String typeOfGear;
    private final String typeOfBodywork;
    private String registrationNumber;
    private final int seatsQuantity;
    private boolean winterTires;
    private transaport.Car.Key key;
    private final long id = count;
    private static long count = 1L;


    public Car(String brand, String model, float engineVolume, String color, int year, String country, String typeOfGear, String typeOfBodywork, String registrationNumber, int seatsQuantity, boolean winterTires, transaport.Car.Key key) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
        this.engineVolume = (engineVolume <= 0) ? engineVolume : 1.5f;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? color : "Белый";
        this.year = (year >= 2000) ? year : 2000;
        this.country = (country != null && country.isEmpty() != true && country.isBlank() != true) ? country : "Англия";
        this.typeOfGear = (typeOfGear != null && typeOfGear.isEmpty() != true && typeOfGear.isBlank() != true) ? typeOfGear : "Default";
        this.typeOfBodywork = (typeOfBodywork != null && typeOfBodywork.isEmpty() != true && typeOfBodywork.isBlank() != true) ? typeOfBodywork : "Седан";
        this.registrationNumber = (registrationNumber != null && registrationNumber.isEmpty() != true && registrationNumber.isBlank() != true) ? registrationNumber : "оо111оо";
        this.seatsQuantity = (seatsQuantity <= 1 && seatsQuantity <= 12) ? seatsQuantity : 4;
        this.winterTires = winterTires;
        this.key = key;
        count++;
    }

    public static class Key {
        private final boolean distantIgnition;
        private final boolean noKeyAccess;

        public Key(boolean distantIgnition, boolean noKeyAccess) {
            this.distantIgnition = distantIgnition;
            this.noKeyAccess = noKeyAccess;
        }

        public boolean isDistantIgnition() {
            return distantIgnition;
        }

        public boolean isNoKeyIgnition() {
            return noKeyAccess;
        }

        @Override
        public String toString() {
            return (distantIgnition ? " Дистанционный запуск, " : " Нет дистанционного запуска, ") +
                    (noKeyAccess ? " Доступ без ключа." : " Бесключевой доступ отсутствует.");
        }

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeOfGear() {
        return typeOfGear;
    }

    public void setTypeOfGear(String typeOfGear) {
        this.typeOfGear = typeOfGear;
    }

    public String getTypeOfBodywork() {
        return typeOfBodywork;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeatsQuantity() {
        return seatsQuantity;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public transaport.Car.Key getKey() {
        return key;
    }

    public void setKey(transaport.Car.Key key) {
        if (key == null) {
            key = new transaport.Car.Key(false, false);
        }
        this.key = key;
    }

    public long getId() {
        return id;
    }

    public static long getCount() {
        return count;
    }

    public void changeTires(int month) {
        if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
            winterTires = true;
        }
        if (month >= 5 && month <= 10) {
            winterTires = false;
        }
    }


    @Override
    public String toString() {
        return "Машина №" + id + "; марка:" + getBrand() + "; модель:" + getModel() + "; объем двигателя: " + getEngineVolume() +
                "; цвет: " + getColor() + "; год выпуска: " + getYear() + "; страна производитель - " + getCountry() + "; тип коробки передач: " + getTypeOfGear() +
                "; тип кузова: " + getTypeOfBodywork() + "; регистрационный номер: " + getRegistrationNumber() + "; количество мест: " + getSeatsQuantity() +
                "; тип резины: " + (winterTires ? "зимняя; " : "летняя; " + key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        transaport.Car car = (transaport.Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && year == car.year && seatsQuantity == car.seatsQuantity && winterTires == car.winterTires && id == car.id && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && country.equals(car.country) && typeOfGear.equals(car.typeOfGear) && typeOfBodywork.equals(car.typeOfBodywork) && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country, typeOfGear, typeOfBodywork, registrationNumber, seatsQuantity, winterTires, id);
    }
}
