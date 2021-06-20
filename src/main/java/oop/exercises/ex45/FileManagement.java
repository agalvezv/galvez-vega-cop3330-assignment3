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

    public String readFile;
    public String outputFile;
    ArrayList<String> readFileAL = new ArrayList<>();




    public FileManagement(String response, String wordChange, String newWord) {
        this.response = response;
        this.wordChange = wordChange;
        this.newWord=newWord;

    }
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
