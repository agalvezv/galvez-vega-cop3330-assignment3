package oop.exercises.ex45;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManagement {
    //These are the inputs gathered from application
    public String response;
    public String wordChange;
    public String newWord;
    //these inputs manage the read and future new text file
    public String readFile;
    public String outputFile;
    ArrayList<String> readFileAL = new ArrayList<>();



//constructor takes in the strings in play
    //the name of the future file, the word to change, the word replacing the old word
    public FileManagement(String response, String wordChange, String newWord) {
        this.response = response;
        this.wordChange = wordChange;
        this.newWord=newWord;

    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getWordChange() {
        return wordChange;
    }

    public void setWordChange(String wordChange) {
        this.wordChange = wordChange;
    }

    public String getNewWord() {
        return newWord;
    }

    public void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    public String getReadFile() {
        return readFile;
    }

    public void setReadFile(String readFile) {
        this.readFile = readFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public ArrayList<String> getReadFileAL() {
        return readFileAL;
    }

    public void setReadFileAL(ArrayList<String> readFileAL) {
        this.readFileAL = readFileAL;
    }

    //read file uses a try catch (seems to be necessary with reading files)
    //to take in the information
    //this is added to a string array list
    public void readFile()
    {
        File givenFile = new File("src/main/java/oop/exercises/ex45/exercise45_input.txt");
        try{
            Scanner readgFile = new Scanner(givenFile);
            while(readgFile.hasNext())
            {
                readFile = readgFile.nextLine();
                readFileAL.add(readFile);
            }
            readgFile.close();

        }
        catch(Exception e)
        {
            System.out.println("There was an error.");
        }


    }
    //the array list is put to use
    //it is added into readFile, which is emptied beforehand, and used to resemble the text file
    //replaceAll then replaces all words involved
    //outputFile stores the future string to turn into the text file
    public void formatString()
    {
        readFile="";
        for(int i=0;i<readFileAL.size();i++)
        {
            readFile=readFile+ " " + readFileAL.get(i) +"\n";
        }
        //System.out.println(readFile);
        outputFile = readFile.replaceAll(wordChange,newWord);
        //System.out.println(outputFile);
    }
    //Another try catch is use for writing a new file
    //the new file is made or an error is sent
    //outputfile is written into the new text file
    //everything is closed
    public void writeFile()
    {
        try
        {
            FileWriter writeFile = new FileWriter("src/main/java/oop/exercises/ex45/"+response);
            writeFile.write(outputFile);
            writeFile.close();
        }
        catch(Exception w)
        {
            System.out.println("There was an error.");
        }

    }
}
