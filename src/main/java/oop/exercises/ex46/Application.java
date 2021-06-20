package oop.exercises.ex46;



public class Application {
    //Exercise 46 strips 45 and takes its bare essentials

    //inputs were removed as they were not needed in this situation
    //scanner was removed

    public static void main(String[] args) {

        //An object is open and sent the strings
        FileManagement manageFile = new FileManagement();
        //read the file and place it into an array list
        manageFile.readFile();
        //use the array list to make a string and format it for the new output file
        manageFile.formatString();
        //manageFile.wordCount();
        manageFile.wordCount();
        manageFile.printList();
        //write a file with the formatted string



    }
}
