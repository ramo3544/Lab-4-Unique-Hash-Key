/*
 * Description: Creates a HashMap using the HashObject class and the data files 
 * in the package to utilize the HashMap class. The driver creates the objects,
 * append them to the HashMap, and generates a unique key for each object using
 * the parameters. Then the driver searhes the HashMap for matches within
 * the second input file in the same manner by comparing the HashObjects and
 * printing the results to the output page.
 */
package lab4;
import java.util.*;
import java.io.*;
/**
 * @author Omar Menafee
 * @version V1.12.03.2018
 */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap hashMap = new HashMap(100,.75f);//HashMap object with 100 items and .75 load factor.
        File data = new File("Lab4InputFile1.txt");//input data as file type
        File searchData = new File("Lab4InputFile2.txt");//search data as file type
        Scanner input = new Scanner(data);//reading the input data into the scanner
        boolean found = false;//boolean for when a key in the HashMap is found.
        
//Initializing all the data from within the first input file into the HashMap
        while(input.hasNext()){
            int key = Integer.parseInt(input.next());//original key/integer in the file
            String value = input.next();//string value in the file
            int hashKey = getKey(key,value);//calls getKey function to recieve new encrypted hash key
            hashMap.put(hashKey,new HashObject(key,value));//puts the HashObject and new hash key into the map
        }//end-while
        
        System.out.println("Hash Map Size:\t" + hashMap.size() + "\n");//prints the size of hash map
        System.out.println(hashMap);//prints the results of the hash map
        System.out.println("//////////////////////////////////");//spacing for the rest of the data
        input = new Scanner(searchData);//reads the search data in the second input file
        
        while(input.hasNext()){
            int key = Integer.parseInt(input.next());//gets key/integer in the file
            String value = input.next();//gets the string value in the file
            int hashKey = getKey(key,value);//gets a new unique hash key from the file depending on the data
            found = hashMap.containsKey(hashKey);//looks for key in the hashmap
            if(found){//if a match is made
                //prints a message and the toString of the matching object
                System.out.println(key + ", " + value + ": [Object was found: " + "Hash Key: " + hashKey + "]");
                System.out.println(hashMap.get(hashKey).toString());
            }
            else{
                //prints a cannot be found message
                System.out.println(key + ", " + value + ": [cannot be found: " + "Hash Key: " + hashKey + "]\n\n");
            }
        }//end-while
    }//end-main
    
    /*
     * public static int getKey(int key, String value)
     * @param int key: the initial key number used for calculations in the HashObject
     * @param String value: the contents of the HashObject
     * @return int: a unique key made from combining both the string and the key.
     *
    */
    public static int getKey(int key, String value){
        //multiplies two elements from both parameters turn the number into a 32 bit number
        //Then mod the number using a prime number.
        return (key * value.charAt(1)*2^32)%4027;
    }
}
