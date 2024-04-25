public abstract class Mower{

    private String Manufacturer, serialNumber;

    protected String mowerType = "#";
    private int year;
    Mower(){
    }

    public Mower(String Manufacturer, int year, String serialNumber){
        this.Manufacturer = Manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    // the getter for manufacturer
    public String getManufacturer(){
        return Manufacturer;

    }

    // The setter for manufacturer
    public void setManufacturer(String Manufacturer){
        this.Manufacturer = Manufacturer;
    }

    // The getter for year
    public int getYear(){
        return year;

    }

    // The setter for year
    public void setYear(int Year){
        this.year = Year;
    }
    public String getSerialNumber(){
        return serialNumber;

    }

    // The setter for manufacturer
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String toString() {
        return Manufacturer  + "\n" +
                year  + "\n" +
                serialNumber + "\n" +
                mowerType;
    }
}
