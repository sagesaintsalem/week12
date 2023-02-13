import java.util.ArrayList;

public class FlightManager {

    Flight flight;
    Passenger passenger;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int calculateBaggageWeight(){
        int initialWeight = flight.getPlane().getModel().getTotalWeight();
        return initialWeight / 2;
    }

    public int calculateReservedWeight(){
        int weightForBaggage = calculateBaggageWeight();
        int weightPerPassenger = weightForBaggage / (flight.getPlane().getModel().getCapacity());
        return weightPerPassenger;
    }

    public int passengerWeight(){
        int totalPassengerWeight = 0;
        for (Passenger passenger: this.flight.getPassengers()){
            int baggage = passenger.getBags();
            totalPassengerWeight += baggage;
        }
        return totalPassengerWeight;
    }

    public int weightAfterBookings(){
        int weightForBaggage = calculateBaggageWeight();
        int passengersBaggage = passengerWeight();
        return weightForBaggage - passengersBaggage;
    }
}
