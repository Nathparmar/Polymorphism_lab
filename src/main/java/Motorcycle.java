import Interfaces.IWheelie;

public class Motorcycle extends Vehicle  implements IWheelie {

    private Boolean sideCar;

    public Motorcycle(String name){
        super(name);
        this.sideCar = false;
    }

    public Boolean wheelie(){
        return true;
    }

    @Override
    public int numberOfWheels(){
        return 2;
    }

    @Override
    public int maxOccupancy(){
        return 2;
    }

    public String wheelie(int distance){
        return this.name + "'s can wheelie up to " + distance +"m";
    }
}
