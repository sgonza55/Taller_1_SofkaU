
/**
 *It represents the main characteristics of a Bank Account. 
 * @author Santiago González
 */
public class BankAccount {
    
    /** 
     * It means the Bank Account number.
     */
    private int accountNumber;
    /**
     * It means the ID type. For example: C.C, Passport or others. 
     */
    private String IDtype;
    /**
     * It means the ID number.
     */
    private int ID;
    /**
     * It means if the Bank Account is activated or not.
     */
    protected boolean activated=true;

    /**
     * Gets the Bank Account Number.
     * @return Bank Account Number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Sets the Bank Account Number.
     * @param accountNumber Bank Account Number.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Gets the ID type. 
     * @return Type of ID. 
     */
    public String getIDtype() {
        return IDtype;
    }
    /** 
     * Sets the ID type.
     * @param IDtype Type of ID.
     */
    public void setIDtype(String IDtype) {
        this.IDtype = IDtype;
    }
    /**
     * Gets number of ID.
     * @return ID number. 
     */
    public int getID() {
        return ID;
    }
    /**
     * Sets number of ID.
     * @param ID ID number.
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Gets if Bank Account is activated or not.
     * @return If the Bank Account is activated or not. 
     */
    public boolean getActivated() {
        if (activated==true) {
            System.out.println("It's activated");
            
        } else {
            System.out.println("It is not activated");
        }        
        return activated;
    }
    /**
     * Sets if Bank Account is activated or not.
     * @param activated True if Bank Account is activated. False if Bank Account isn't activated.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Gets the ID type and the number.
     * @return The type and number of ID.
     */
    public String getFullID() {
        return IDtype + " " + ID;
    }
}
