import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Plane plane;

    CabinCrewMember cabin1;
    CabinCrewMember cabin2;
    Passenger passenger1;
    Passenger passenger2;

    Date date;


    @Before
    public void before(){
        date = new Date(1672747200000L);
        pilot = new Pilot("Max Power", CrewRank.CAPTAIN, "MP098765");
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "CDG12345", "CDG", "GLA", date);
        cabin1 = new CabinCrewMember("Jane Plane", CrewRank.FLIGHT_ATTENDANT);
        cabin2 = new CabinCrewMember("Icarus Soleil", CrewRank.WING_CLIPPER);
        passenger1 = new Passenger("Samuel Jackson", 2);
        passenger2 = new Passenger("Ignatious Popp", 6);

    }

    @Test
    public void findAvailableSeats(){
        assertEquals(200, flight.availableSeats());
    }

    @Test
    public void addPassengerToFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.amountOfPassengers());
        assertEquals(198, flight.availableSeats());
    }

    @Test
    public void hasPreciseDepartureTime(){
        assertEquals(date, flight.getDepartureTime());
        System.out.println(date);
    }
}
