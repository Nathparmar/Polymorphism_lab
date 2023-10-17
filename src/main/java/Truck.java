public class Truck extends Vehicle{

    private double load;

    public Truck(String name){
        super(name);
        this.load = 0;
    }

    public double getLoad() {
        return load;
    }

    public void addLoad(double amount){
         this.load += amount;

    }

    public int maxOccupancy(){
        return 5;
    }



}
