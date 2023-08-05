public abstract class Passengers  {
    private String name;
    private String ID;
    private double  trip_cost;
    private Car booking;

    public Car getBooking() {
        return booking;
    }

    public void setBooking(Car booking) {
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }


    public Passengers(String name,String ID){
    this.name=name;
    this.ID=ID;



    }
    public abstract void booking(Car car) throws Exception;
    public abstract void display();

}
