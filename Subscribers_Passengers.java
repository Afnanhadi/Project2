public class Subscribers_Passengers extends Passengers{



    public Subscribers_Passengers(String name, String ID) {
        super(name, ID);

    }


    @Override
    public void booking(Car car) {
        setBooking(car);
        double tripcose=car.getRoute().getPrice()*50/100;
        setTrip_cost(tripcose);
    }

    @Override
    public void display() {
     System.out.println("Name:  "+ getName());
     System.out.println("ID:  "+ getID());
     System.out.println("code: "+getBooking().getCode());
     System.out.println("Price:  "+getBooking().getRoute().getPrice());
     System.out.println("Trip Cost:"+ getTrip_cost());
    }
}
