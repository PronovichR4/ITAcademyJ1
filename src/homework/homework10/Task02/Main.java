package homework.homework10.Task02;

import homework.homework10.Task02.cars.*;

public class Main {

    public static void main(String[] args) {
        Car VitoLong = new PassengerBus("Mercedes", "Vito", 2005, "diesel", "automat", 9);
        Car T5 = new PassengerBus("Volksvagen", "T5 Shuttle", 2006, "benzine", "mechanical", 9);
        Car T4 = new Truck("Volksvagen", "Transporter T4", 2000, "benzine", "mechanical", 700);
        Car Transit = new Truck("Ford", "Transit", 1997, "diesel", "mechanical", 650);
        Car B6 = new Sedan("Volksvagen", "Passat B6", 2008, "diesel", "mechanical", "middle");
        Car Logan = new Sedan("Renault", "Logan", 2006, "benzine", "mechanical", "economy");
        Car Xc = new SUV("Volvo", "XC60", 2012, "benzine", "automat", 25);
        Car X = new SUV("BMW", "X5", 2007, "benzine", "automat", 27);

        Garage garage = new Garage();

        garage.parking(VitoLong);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T4);
        garage.parking(Transit);
        garage.parking(B6);
        garage.parking(Logan);
        garage.parking(Xc);
        garage.parking(X);

        System.out.println(garage.exitCar(T5));
        System.out.println(garage.exitCar(T5));
        System.out.println(garage.exitCar(X));
        System.out.println(garage.exitCar(X));
        System.out.println(garage.numberOfTypeAutoInGarage(T5));
    }
}
