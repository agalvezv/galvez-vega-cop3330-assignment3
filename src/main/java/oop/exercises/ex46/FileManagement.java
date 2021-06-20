package oop.exercises.ex46;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileManagement {
//inputs are replaced with lists that will gather information as needed
    public String readFile;
    ArrayList<String> readFileAL = new ArrayList<>();
    ArrayList<String> namesFinal = new ArrayList<>();
    ArrayList<Integer> countFinal = new ArrayList<>();



//the constructor is empty as there are no inputs
    public FileManagement() {


    }
//get set was also changed as needed, mostly focuses on array lists now
    public String getReadFile() {
        return readFile;
    }

    public void setReadFile(String readFile) {
        this.readFile = readFile;
    }


    public ArrayList<String> getReadFileAL() {
        return readFileAL;
    }

    public void setReadFileAL(ArrayList<String> readFileAL) {
        this.readFileAL = readFileAL;
    }

    public ArrayList<String> getNamesFinal() {
        return namesFinal;
    }

    public void setNamesFinal(ArrayList<String> namesFinal) {
        this.namesFinal = namesFinal;
    }

    public ArrayList<Integer> getCountFinal() {
        return countFinal;
    }

    public void setCountFinal(ArrayList<Integer> countFinal) {
        this.countFinal = countFinal;
    }

//Read file is exactly the same as ex 45 function
    public void readFile()
    {
        File givenFile = new File("src/main/java/oop/exercises/ex46/exercise46_input.txt");
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
//Format string is also exactly the same until the output file info
    //the output file and changes to the string are removed as this is no longer needed
    public void formatString()
    {
        readFile="";
        for(int i=0;i<readFileAL.size();i++)
        {
            readFile=readFile+ " " + readFileAL.get(i) +"\n";
        }
        //System.out.println(readFile);
        //System.out.println(outputFile);
    }
    //word count is a new function that gets each specific word in the input file
    //the words and counts are added to two different array lists
    public void wordCount()
    {


        ArrayList<String> modtemp = new ArrayList<String>();
        String temp[] = readFile.split(" ");
        String word = "";

        for (int i = 0; i < temp.length; i++)
        {
            if(!(temp[i]).equals("")||!(temp[i]).equals(null))
            {
                modtemp.add(temp[i]);
            }

        }
        //System.out.println(modtemp);
        for (int i = 0; i < modtemp.size(); i++)
        {
            if(modtemp.get(i).equals("\n")||modtemp.get(i).equals(""))
            {
                modtemp.remove(i);
            }
        }
        //System.out.println(modtemp);
        ArrayList<String> cleanNames = new ArrayList<String>();
        //cleanNames.add(" ");
        for (int i = 0; i < modtemp.size(); i++)
        {
            if (!cleanNames.contains(modtemp.get(i))) {

                cleanNames.add(modtemp.get(i));
            }
        }
        //System.out.println(cleanNames);



        for(int i=0; i<cleanNames.size();i++)
        {
            word = cleanNames.get(i);

            int count = 0;
            for (int j = 0; j < temp.length; j++)
            {
                // if match found increase count
                if (word.equals(temp[j]))
                    count++;
            }
            //System.out.println(modtemp.get(i));
            namesFinal.add(cleanNames.get(i));
            //System.out.println(count);
            countFinal.add(count);
        }

        //System.out.println(namesFinal);
        //System.out.println(countFinal);

    }
//The array lists are printed.
    //names are just printed out as it scrolls through the word list
    //an extra loop is used to turn the countFinal value into a series of printed stars
    public void printList(){
        for (int i=0; i<namesFinal.size();i++)
        {
            System.out.print(namesFinal.get(i)+": ");
                    for(int j=0;j< countFinal.get(i);j++)
                    {
                        System.out.print("*");

                    }
            System.out.println("");
        }

    }

}
