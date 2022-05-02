/**
 * This class represents a TV and its main characteristics.
 * @author Santiago González
 */
public class TV {
    
    /**
     * It means the size of TV.
     */
    public Integer inches;
    /**
     * It means the TV's width in cm.
     */
    public Float width;
    /**
     * It means the TV's resolution.
     */
    public String resolution;
    /**
     * It means the TV's technology. Example: LED, QLED, LCD, OLED. 
     */
    public String technology;
    /**
     * It means if the TV is SmartTV or not. 
     */
    protected boolean smartTV=true;
    
    /**
     * Gets the size in inches of the TV. 
     * @return TV size. 
     */
    public Integer getInches() {
        return inches;
    }
    /**
     * Sets the size in inches of the TV.
     * @param inches TV size in inches.
     */
    public void setInches(Integer inches) {
        this.inches = inches;
    }
    /**
     * Gets TV width.
     * @return TV width.
     */
    public Float getWidth() {
        return width;
    }
    /**
     * Sets the TV width. 
     * @param width TV width in cm. 
     */
    public void setWidth(Float width) {
        this.width = width;
    }
    /**
     * Gets the TV resolution.
     * @return TV resolution. 
     */
    public String getResolution() {
        return resolution;
    }
    /**
     * Sets the TV resolution.
     * @param resolution TV resolution. 
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    /**
     * Gets TV technology type.  
     * @return TV technology type. 
     */
    public String getTechnology() {
        return technology;
    }
    /**
     * Sets TV technology type. 
     * @param technology TV technology type. 
     */
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    /**
     * Gets if the TV is Smart TV or not.
     * @return If the TV is Smart TV or not. 
     */
    public boolean getSmartTV() {
        if (smartTV==true) {
            System.out.println("TV is Smart TV");
        } else {
            System.out.println("TV isn't Smart TV");
        }      
        return smartTV;
    }
    /** 
     *Sets if the TV is Smart TV or not.
     * @param smartTV True if the TV is Smart TV. False if the TV isn't Smart TV.
     */
    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

}
