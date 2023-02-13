import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;

    Passenger passenger;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight (Pilot pilot, Plane plane, String flightNo, String destination, String departureAirport, Date departureTime){
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    


    public Plane getPlane() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }



    public int availableSeats(){
        int capacity = this.plane.getModel().getCapacity();
        int available = capacity - this.passengers.size();
        return available;

    }

    public void addPassenger(Passenger passenger){
        if (plane.getModel().getCapacity() > passengers.size()){
            passengers.add(0, passenger);
        }
    }

    public int amountOfPassengers() {
        return passengers.size();
    }
}
