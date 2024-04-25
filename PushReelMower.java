public class PushReelMower extends WalkBehindMower{
    private int numWheels;

    public PushReelMower () {
        mowerType = "P";
    }
    public PushReelMower(int numWheels) {
        this.numWheels = numWheels;
    }



    // the getter for numWheels
    public double getNumWheels(){
        return numWheels;

    }

    // The setter for numWheels
    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }

    public String toString() {
        return super.toString() + "\n" + numWheels;
    }


}
