public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String name, int numberOfDoors){
        super(name);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Overloaded method to set the number of doors with a boolean parameter
    public void setNumberOfDoors(boolean hasTwoDoors) {
        this.numberOfDoors = hasTwoDoors ? 2 : 4;
    }

    public int maxOccupancy(){
        return 5;
    }







}
