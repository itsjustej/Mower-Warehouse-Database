public class GasPoweredMower extends WalkBehindMower {private Engine engine;
    private boolean selfPropelled;

    // contructor for GasPoweredMower
    public GasPoweredMower () {
        engine = new Engine ();
        selfPropelled = false;
        mowerType = "G";
    }

    //setter for engine
    public void setEngine (Engine engine) {
        this.engine = engine;
    }

    // getter for engine
    public Engine getEngine () {
        return engine;
    }

    //setter for self propelled
    public void setSelfPropelled (boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }

    //getter for self propelled
    public boolean isSelfPropelled () {
        return selfPropelled;
    }


    public String toString () {
         return super.toString() + "\n" + engine + "\n" +
                selfPropelled;
    }
}
