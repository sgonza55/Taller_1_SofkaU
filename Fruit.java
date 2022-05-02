/**
 * Library in order to create the Array.
 */
import java.util.ArrayList;

/**
 *It represents the main characteristics of a fruit.
 * @author Santiago González
 */

public class Fruit {
    
    /**
     * It means the fruit's name.
     */
    public String name;
    /**
     * It means the average fruit weight in g. 
     */
    private Float averageWeight;
    /**
     * It means the type of color can be the fruit. 
     */
    public ArrayList<String> color = new ArrayList<>();
    /**
     * It means if the fruit needs to put away in the fridge. 
     */
    protected boolean putAwayInFridge=true;
    
    /**
     * Gets the fruit's name.
     * @return name of the fruit.
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the fruit. 
     * @param name fruit's name. 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the average fruit weight in g.
     * @return average fruit weight in g. 
     */
    public Float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Sets the average fruit weight in g. 
     * @param averageWeight average fruit weight in g.
     */
    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Gets a list with the colors of the fruit. 
     * @return A list with the colors of the fruit. 
     */
    public ArrayList<String> getColor() {
        return color;
    }
    /**
     * Sets color(s) of the fruit. 
     * @param color fruit's color. 
     */
    public void setColor(String color) {
        this.color.add(color);
    }
    /**
     * Gets if the fruit needs to put away in the fridge.
     * @return if the fruit needs to put away in the fridge.
     */
    public boolean getPutAwayInFridge() {
        if (putAwayInFridge==true) {
            System.out.println("Put away in the fridge");
            
        } else {
            System.out.println("No need to put away in the fridge");
        }        
        return putAwayInFridge;
    }
    /**
     * Sets if the fruit needs to put away in the fridge.
     * @param putAwayInFridge True if the fruit needs to put away in the fridge. False if the fruit doesn't need to put away in the fridge.
     */
    public void setPutAwayInFridge(boolean putAwayInFridge) {
        this.putAwayInFridge = putAwayInFridge;
    }
    /**
     * Gets the average fruit weight with its specific unit in g. 
     * @return the average fruit weight in g. 
     */
    public String getUnitAverageWeight() {
        return averageWeight + "g";
    }

}
