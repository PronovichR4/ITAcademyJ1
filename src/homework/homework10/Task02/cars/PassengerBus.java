package homework.homework10.Task02.cars;

public class PassengerBus extends Car {

    private int pasengerSeats;

    public PassengerBus(String brand, String model, int year, String typeOfFuel, String typeOfGearbox, int pasengerSeats) {
        super(brand, model, year, typeOfFuel, typeOfGearbox);
        this.pasengerSeats = pasengerSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        PassengerBus bus = (PassengerBus) o;
        return pasengerSeats == bus.pasengerSeats;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * pasengerSeats;
    }

    @Override
    public String toString() {
        return super.toString() + " количество пассажирских мест:" + getPasengerSeats();
    }

    public int getPasengerSeats() {
        return pasengerSeats;
    }
}
