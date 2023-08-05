public class Main {
    public static void main(String[] args) throws Exception {
        Passengers[] P=new Passengers[2];
            Route route=new Route("Jeddah","Makkah" ,10000);
            Car c1=new Car("134J",route,4);
            Route route1=new Route("Riyadh","Jeddah",10000);
            Car car=new Car("12edx",route1,0);

            P[0]=new Subscribers_Passengers("Genesis","GV80");
            P[0].booking(c1);
            P[0].display();

            System.out.println("------------------------------------------------------------------------------");

            P[1]=new Non_Subscribers_passengers("Lexus","GS350",true);
            P[1].booking(car);
            P[1].display();
    }
}