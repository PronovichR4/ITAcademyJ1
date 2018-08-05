package homework.homework10.Task02.cars;

public class SUV extends Car {

    private int rideHight;

    public SUV(String brand, String model, int year, String typeOfFuel, String typeOfGearbox, int rideHight) {
        super(brand, model, year, typeOfFuel, typeOfGearbox);
        this.rideHight = rideHight;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        SUV suv = (SUV) o;
        return rideHight == suv.rideHight;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * rideHight;
    }

    public int getRideHight() {
        return rideHight;
    }
}
