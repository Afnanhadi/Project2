public class Car  {
    private String code;
    private Route Route ;
    private int maxCapacity;
  public Car(String code,Route Route,  int maxCapacity){
      this.code=code;
      this.Route=Route;
      this.maxCapacity=maxCapacity;
  }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return Route;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setRoute(Route route) {
        Route = route;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
