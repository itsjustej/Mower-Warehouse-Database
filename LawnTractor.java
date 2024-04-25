
public class LawnTractor extends Mower{
    private Engine engine;
    private String model;
    private double deckWidth;

    // Constructors for LawnTractor (needs default constructor for engine to run)
    public LawnTractor(){
        mowerType = " L";
    }
    public LawnTractor(String Manufacturer, String serialNumber, int year, Engine engine, String model, double deckWidth) {
        super(Manufacturer, year, serialNumber);
        this.engine = engine;
        this.model = model;
        this.deckWidth = deckWidth;
    }

    // the getter for model
    public String getModel(){
        return model;

    }

    // The setter for model
    public void setModel(String Model){
        this.model = Model;
    }


    // the getter for deckwidth
    public double getDeckWidth(){
        return deckWidth;
    }

    // The setter for deckwidth
    public void setDeckWidth(double deckWidth){
        this.deckWidth = deckWidth;
    }

    // the getter for engine
    public Engine getEngine(){
        return engine;

    }

    // The setter for engine
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String toString() {
        return super.toString() + "\n" +
                engine + "\n" +
                model + "\n" +
                deckWidth;
    }


}
