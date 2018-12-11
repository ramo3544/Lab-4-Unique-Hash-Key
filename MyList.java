/**
 * MyList.java Class Description:
 * This class creates a object for which to test the MyStack.java file
 * and uses elements from college courses to show the elements of MyList.java
 */
package lab1;

/**
 * @author omenafee
 * @version 1.0
 */
public class MyList{
    private String courseName;//name of the college course
    private String courseID;//number to indicate the id of course
    private int creditHours;//number of credits for course
    private MyList next;//pointer to the next node
    
    public MyList(String courseName, String courseID, int creditHours, MyList next) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.creditHours = creditHours;
        this.next = next;
    }
    //default constructor
    public MyList(){
        courseName = "N/A";
        courseID = "N/A";
        creditHours = 0;
        next = null;
    }
    //pointer constructor: creates an object so that the parameter can be the pointer to the next object
    public MyList(MyList other){
        courseName = "N/A";
        courseID = "N/A";
        creditHours = 0;
        next = other;
    }
    
    //getter methods
    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public MyList getNext() {
        return next;
    }
    
    //setter methods
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setNext(MyList next) {
        this.next = next;
    }
    //toString method
    public String toString() {
        return "\nMyList{" + "courseName=" + courseName + ", courseID=" + courseID + ", creditHours=" + creditHours + '}';
    }
    
}

