package oop.exercises.ex41;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Most of my pseudocode was written on a piece of paper for these assignments
//they are transferred into the comments in the code
public class Application {

//Main will be the main area to access all possible class objects
    //this will hold my scanner to read through files

    public static void main(String[] args) {
        NameList newList = new NameList();

        try {
            //file and scanner announced
            File fileOpener = new File("src/main/java/oop/exercises/ex41/exercise41_input.txt");
            Scanner myReader = new Scanner(fileOpener);

            //parse through files if text file isn't empty
            //add this to a class that will hold the list
            while (myReader.hasNextLine()) {
                String filedata = myReader.nextLine();
                newList.addToList(filedata);
                //System.out.println(data);
            }
            //close file once everything is filtered
            myReader.close();
        } catch (FileNotFoundException e) {
            //print any exceptions that occur
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        //print list and send a copy of list to the application side
        ArrayList<String> names = new ArrayList<String>();
        //newList.printList();
        names = newList.printList();

    }
}
