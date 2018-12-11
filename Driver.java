/**
 * Class Description:
 * 
 * This class uses a main method to display all the actions required for Lab 1.
 * Including the pushing of all elements from the text file and popping of
 * three elements within the stack.
 */
package lab1;
import java.util.*;
import java.io.*;
/**
 * @author omenafee
 * @version 1.0
 */
public class Driver {
    
    public static void main(String args[]) throws FileNotFoundException{
        //used try block to catch some exceptions
        try{
            
            File dataFile = new File("Lab1InputFile.txt");//grabs the data file from the computer
            Scanner data = new Scanner(dataFile);//scans the data in the file
            MyStack stack = new MyStack();//new stack
            
            //pushes all items from the file into the stack 
            while(data.hasNextLine()){
                stack.push(new MyList(data.nextLine(),data.nextLine(),Integer.parseInt(data.nextLine()),stack.getCurrent()));
            }
            //prints all the data to the output, the number of nodes, and the current node
            System.out.println(stack.toString());
            System.out.println("Node Count:\t" + stack.count());
            System.out.println("First Node:\t" + stack.getCurrent().toString());
            
            //pops three items out of the stack
            for(int x = 0; x < 3; x++){
                stack.pop();
            }
            //prints all the data to the output, the number of nodes, and the current node
            System.out.println("\n" + stack.toString());
            System.out.println("Node Count:\t" + stack.count());
            System.out.println("First Node:\t" + stack.getCurrent().toString());
            
            //pops the rest of the items out of the stack
            for(int x = 0; x < 4; x++){
                stack.pop();
            }
            System.out.println("\n" + stack.toString());
            System.out.println("Node Count:\t" + stack.count());
            System.out.println("First Node:\t" + stack.getCurrent().toString());
            
        }
        catch(FileNotFoundException e1){
            //returns an error message if the file was not recieved correctly
            System.err.println("Error: Issue with recieving file. Please check file type. e.g something.txt\n\n" + e1);
        }
        catch(NullPointerException e2){
            //returns a error message if one of the nodes return as null
            System.err.println("Error: Checking of last element in stack result in nullpointer error. Please check code:\n\n" + e2);
        }
    }
}
