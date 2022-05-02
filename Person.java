/**
 * Library in order to use the type of data Date. 
 */
import java.util.Date;

/**
 *It represents the class person and its main characteristics.
 * @author Santiago González
 */

public class Person {
    
    /**
     * It means the person's name.
     */
    public String name;
    /**
     * It means the person's last name 1. 
     */
    public String lastName1;
    /**
     * It means the person's last name 2.
     */
    public String lastName2;
    /**
     * It means the person's Date of Birth.
     */
    public Date dateBirth;
    /**
     * It means the person's height. 
     */
    public Float height;
    /**
     * It means the person's weight.
     */
    public Float weight;
    
    /**
     * Get the person's name. 
     * @return Person's name. 
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the person's name. 
     * @param name person's name. 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the person's last name 1. 
     * @return person's last name 1. 
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Sets the person's last name 1. 
     * @param lastName1 Person's last name 1. 
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Gets the person's last name 2.
     * @return Person's last name 2. 
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Sets the person's last name 2.
     * @param lastName2 Person's last name 2.
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Gets de person's date of birth.
     * @return Date of the birth.
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Sets de person's date of birth.
     * @param dateBirth Date of birth.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * Gets the person's height. 
     * @return Person's height. 
     */
    public Float getHeight() {
        return height;
    }
    /**
     * Sets person's height. 
     * @param height Person's height. 
     */
    public void setHeight(Float height) {
        this.height = height;
    }
    /**
     * Gets person's weight. 
     * @return Person's weight. 
     */
    public Float getWeight() {
        return weight;
    }
    /**
     * Sets person's weight. 
     * @param weight Person's height. 
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    /**
     * Gets the person's full name.
     * @return person's full name.
     */
    public String getFullName() {
       return name + " " + lastName1 + " " + lastName2;
    }
    /**
     * Gets the weight and height of the person. 
     * @return Weight and height of the person. 
     */
    public String getUnitsHeightAndWeight() {
       return height + "m and " + weight + "kg";
    }

}
