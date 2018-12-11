/*
 *Description: A basic holder class for the HashMap used to get data
 *from the input files to have the driver compile correctly
 */
package lab4;

/**
 *
 * @author Omar Menafee
 * @version V1.12.03.2018
 */
public class HashObject {
    private int value;//key and value of the object
    private String str;//contents in the contained object.
    
    //default constructor
    public HashObject(){
        this(0,"N/A");
    }
    public HashObject(int value, String str){
        this.value = value;
        this.str = str;
    }
    //getter methods
    public int getValue() {
        return value;
    }

    public String getStr() {
        return str;
    }
    //setter methods

    public void setValue(int value) {
        this.value = value;
    }

    public void setStr(String str) {
        this.str = str;
    }
    //toString method
    public String toString(){
        return "Key: " + value + "\n" +
               " Value: " + str + "\n\n";
    }
    
}
