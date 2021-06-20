package oop.exercises.ex45;

import java.util.Scanner;

public class Application {
    //44 was more difficult to test
    //moving most work into a File class that will
    //deal with reading and writing
    //Application will focus on user input
    //and other potential inputs

    //scanner will be for reading user inputs as required
    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {
        //This will ask for the file name.
        //strings are made for the word in question to change and the new word to replace it
        String response="";
        System.out.println("Print the name of your output file: ");
        response = inputs.nextLine();
        //I'm setting them as strings for future changes that are less hardwritten
        String wordChange = "utilize";
        String newWord = "use";
        //An object is open and sent the strings
        FileManagement manageFile = new FileManagement(response, wordChange, newWord);
        //read the file and place it into an array list
        manageFile.readFile();
        //use the array list to make a string and format it for the new output file
        manageFile.formatString();
        //write a file with the formatted string
        manageFile.writeFile();


    }
}
