/**
 * MyStack.java Class Description:
 * This class creates an custom made stack that points to different MyList objects
 * within itself and manipulates those objects as well.
 */
package lab1;
import java.util.*;
/**
 * @author omenafee
 * @version 1.0
 */
public class MyStack {
    private MyList first;//first node in the stack instatiated as null
    private MyList rear;//the last node in the stack instatiated as null
    private MyList current;//the first object in the stack with data
    private StringBuilder stringList;//used for toString method
    private int count = 0;//counts the amount of nodes in the stack
    private MyList removed = new MyList();//a object to assign to removed nodes.
    
    //constructor
    public MyStack(){
        rear = new MyList();
        first = new MyList(rear);
        current = rear;
        count = 0;
    }
    
    //pushes an element of the stack object into the first element of the linkedlist
    public void push(MyList other){
        other.setNext(current);//sets the pointer of the other node to the first object address
        first.setNext(other);//sets the other node as the first node in the stack
        current = other;//changes the current or first object to current object
        count++;//increments count
        
    }
    
    //pops the first element out of the stack and conects the adjacent together without comprimising the stack
    public void pop(){
        removed = current;//the first object with data is being manipulated
        current = current.getNext();//the new current is the node after the previous current
        first.setNext(current);//the first node points to the new current
        removed.setNext(null);//the removed node's pointer is set to null
        count--;//decrements count
    }
    //getter methods
    public int count(){
        return count;
    }
    public MyList getFirst(){
        return first.getNext();
    }
    public MyList getCurrent(){
        return current;
    }
    //toString method
    @Override
    public String toString(){
        stringList = new StringBuilder();
        stringList.append("Nodes:\n");
        for(int x = 0; x < count; x++){
            stringList.append(current.toString());
            current = current.getNext();
        }
        current = first.getNext();
        return stringList.toString();
    }
}
