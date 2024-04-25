public abstract class WalkBehindMower extends Mower {
    private double cutWidth, wheelDiameter;

    //default constructor for WalkBehindMower
    public WalkBehindMower () {
    }

    // setter for cutWidth
    public void setCutWidth (double cutWidth) {
        this.cutWidth = cutWidth;
    }

    //getter for cut width
    public double getCutWidth () {
        return cutWidth;
    }

    // setter for wheelDiameter
    public void setWheelDiameter (double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    // getter for wheelDiameter
    public double getWheelDiameter () {
        return wheelDiameter;
    }


    public String toString() {
        return  super.toString() + "\n" + cutWidth + "\n" +
                wheelDiameter;
    }

}

