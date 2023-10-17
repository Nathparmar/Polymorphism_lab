public abstract class Vehicle {

    protected String name;

    public Vehicle (String name){
        this.name = name;
    }

//    public int maxOccupancy(){
//        return 5;
//    }

    public abstract int maxOccupancy(); //abstract method

    public int numberOfWheels(){
        return 4;
    }

    public String fuelType(){
        return "Diesel";
    }

    public Boolean manual(){
        return true;
    }






}
