public class Non_Subscribers_passengers extends Passengers {
    private boolean  discountcoupon;


    public Non_Subscribers_passengers(String name, String ID,boolean discountcoupon) {
        super(name, ID);
        this.discountcoupon=discountcoupon;
    }


    @Override
    public void booking(Car car) {
            setBooking(car);
            double Tripcose;

            if (discountcoupon) {
                Tripcose = car.getRoute().getPrice() - (car.getRoute().getPrice() * 0.1);
            } else {
                Tripcose = car.getRoute().getPrice();

            }
            setTrip_cost(Tripcose);
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
