public class CommercialMower extends LawnTractor{
    private boolean zeroTurnRadius;
    private double operatingHours;

    //default constructor for CommercialMower
    public CommercialMower () {
        operatingHours = -1;
        zeroTurnRadius = false;
        mowerType = "C";
    }

    // the getter for zeroTurnRadius
    public boolean isZeroTurnRadius(){
        return zeroTurnRadius;

    }

    // The setter for ZeroTurnRadius
    public void setZeroTurnRadius(boolean zeroTurnRadius){
        this.zeroTurnRadius = zeroTurnRadius;
    }


    // the getter for getOperatingHours
    public double getOperatingHours(){
        return operatingHours;

    }

    // The setter for setOperatingHours
    public void setOperatingHours(double operatingHours){
        this.operatingHours = operatingHours;
    }


    public String toString() {
        return  super.toString() + "\n" + operatingHours + "\n" +
                zeroTurnRadius;

    }
}
