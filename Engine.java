public class Engine {

    private String Manufacturer;
    private double hoursePower;
    private int Cylinders;

//default constructor for Engine
    public Engine () {
        Manufacturer = "N/A";
        hoursePower = -1.0;
        Cylinders = -1;
    }
    public Engine(String Manufacturer, double hoursePower, int Cylinders) {
        this.Manufacturer = Manufacturer;
        this.hoursePower = hoursePower;
        this.Cylinders = Cylinders;
    }

    // the getter for manufacturer
    public String getManufacturer(){
        return Manufacturer;

    }

    // The setter for manufacturer
    public void setManufacturer(String Manufacturer){
        this.Manufacturer = Manufacturer;
    }


    // the getter for hoursePower
    public double getHoursePower(){
        return hoursePower;

    }

    // The setter for Cylinders
    public void setCylinders(int Cylinders){
        this.Cylinders = Cylinders;
    }

    // the getter for Cylinders
    public int getCylinders(){
        return Cylinders;

    }

    // The setter for horsePower
    public void setHoursePower(double hoursePower){
        this.hoursePower = hoursePower;
    }

    public String toString() {
        return Manufacturer + "\n" +
                hoursePower + "\n" +
                Cylinders;
    }


}
