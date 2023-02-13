import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Date date;

    @Before
    public void before(){
        date = new Date(1672747200000L);
        pilot = new Pilot("Max Power", CrewRank.CAPTAIN, "MP098765");
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "CDG12345", "CDG", "GLA", date);
        flightManager = new FlightManager(flight);
        passenger1 = new Passenger("Samuel Jackson", 2);
        passenger2 = new Passenger("Ignatious Popp", 6);
    }

    @Test
    public void canFindPassengerWeight(){
        assertEquals(50, flightManager.calculateReservedWeight());
    }

    @Test
    public void canFindWeightBooked(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(8, flightManager.passengerWeight());
    }

    @Test
    public void canFindRemainingWeight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(9992, flightManager.weightAfterBookings());
    }

}
