import java.util.Objects;

public class Transport {
    public static class Car {
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
        private String typeOfTires;
        private final long id = count;
        private static long count = 1L;


        public Car(String brand, String model, float engineVolume, String color, int year, String country, String typeOfGear, String typeOfBodywork, String registrationNumber, int seatsQuantity, String typeOfTires) {
            this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
            this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
            this.engineVolume = (engineVolume <= 0) ? engineVolume : 1.5f;
            this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? color : "Белый";
            this.year = (year >= 2000) ? year : 2000;
            this.country = (country != null && country.isEmpty() != true && country.isBlank() != true) ? country : "Англия";
            this.typeOfGear = (typeOfGear != null && typeOfGear.isEmpty() != true && typeOfGear.isBlank() != true) ? typeOfGear : "Default";
            this.typeOfBodywork = (typeOfBodywork != null && typeOfBodywork.isEmpty() != true && typeOfBodywork.isBlank() != true) ? typeOfBodywork : "Седан";
            this.registrationNumber = registrationNumber;
            this.seatsQuantity = seatsQuantity;
            this.typeOfTires = typeOfTires;
            count++;
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

        public String getTypeOfTires() {
            return typeOfTires;
        }

        public void setTypeOfTires(String typeOfTires) {
            this.typeOfTires = typeOfTires;
        }


        public static long getCount() {
            return count;
        }

        public long getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Машина №" + id + "; марка:" + getBrand() + "; модель:" + getModel() + "; объем двигателя: " + getEngineVolume() +
                    "; цвет: " + getColor() + "; год выпуска: " + getYear() + "; страна производитель - " + getCountry() + "; тип коробки передач: " + getTypeOfGear() +
                    "; тип кузова: " + getTypeOfBodywork() + "; регистрационный номер: " + getRegistrationNumber() + "; количество мест: " + getSeatsQuantity() +
                    "; тип резины: " + getTypeOfTires();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return Float.compare(car.engineVolume, engineVolume) == 0 && year == car.year && seatsQuantity == car.seatsQuantity && id == car.id && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && country.equals(car.country) && typeOfGear.equals(car.typeOfGear) && typeOfBodywork.equals(car.typeOfBodywork) && registrationNumber.equals(car.registrationNumber) && typeOfTires.equals(car.typeOfTires);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, model, engineVolume, color, year, country, typeOfGear, typeOfBodywork, registrationNumber, seatsQuantity, typeOfTires, id);
        }

        public static class Key {
            private final boolean noKeyIgnition;
            private final boolean distantIgnition;


        }
    }
}


