/**
 * This class represents a box and its main characteristics.
 * @author Asus
 */
public class Box {
    
    /**
     * Kind of material.
     */
    public String material;
    /**
     * Box depth.
     */
    public Float deep;
    /**
     * Box width.
     */
    public Float width;
    /**
     * Box large
     */
    public Float large;
    /**
     * Box area.
     */
    private Float area;
    /**
     * Box volume.
     */
    public Float volume;
    /**
     * If the box has a top or not. 
     */
    protected boolean top=true;

    /**
     * Gets box material
     * @return Box material
     */
    public String getMaterial() {
        return material;
    }
    /**
     * Sets box material
     * @param material Box material
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    /**
     * Gets box deep
     * @return box deep
     */
    public Float getDeep() {
        return deep;
    }
    /**
     * Sets box deep
     * @param deep box deep
     */
    public void setDeep(Float deep) {
        this.deep = deep;
    }
    /**
     * Gets box width.
     * @return box width.
     */
    public Float getWidth() {
        return width;
    }
    /**
     * Sets box width.
     * @param width Box width.
     */
    public void setWidth(Float width) {
        this.width = width;
    }
    /**
     * Gets box large.
     * @return Box large.
     */
    public Float getLarge() {
        return large;
    }
    /**
     * Sets box large.
     * @param large Box large.
     */
    public void setLarge(Float large) {
        this.large = large;
    }
    /**
     * Gets box volume.
     * @return Box volume.
     */
    public Float getVolume (){
        area=large*width;
        this.volume =large*width*deep;
        System.out.println("The volume of the box is " + volume + "m3");
        return volume;
    }
    /**
     * Gets if the box has a top or not. 
     * @return if the box has a top or not. 
     */
    public boolean getTop() {
        if (top==true) {
            System.out.println("The box has a top");
        } else {
            System.out.println("The box doesn't have a top");
        }        
        return top;
    }
    /**
     * Sets if the box has a top or not. 
     * @param top True if the box has a top. False if the box doesn't have a top. 
     */
    public void setTop(boolean top) {
        this.top = top;
    }
    
}

