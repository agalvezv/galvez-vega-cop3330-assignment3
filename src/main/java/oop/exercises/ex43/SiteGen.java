package oop.exercises.ex43;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SiteGen {
    //Strings for every received type.
    //Constructor in this case will be empty
    //opting for get and setters
    static String siteName;
    static String author;
    static String jsCheck;
    static String cssCheck;
    static String pathway;
    static boolean success = false;

    public SiteGen(){

    }
    //getting all String values
    public void getSiteName(String siteName)
    {
        this.siteName = siteName;
        //System.out.println(siteName);
    }

    public void getAuthor(String author)
    {
        this.author = author;
    }

    public void getJSCheck(String jsCheck)
    {
        this.jsCheck = jsCheck;
        this.jsCheck=jsCheck.toLowerCase();
    }

    public void getCSSCheck(String cssCheck)
    {
        this.cssCheck = cssCheck;
        this.cssCheck = cssCheck.toLowerCase();
    }

    public void generateSite()
    {
        pathway="src/main/java/oop/exercises/ex43/"+siteName;
        try {
            Path path = Paths.get(pathway);
            File myObj = new File(pathway+"/index.html");
            Files.createDirectories(path);
            /*
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
             */
            //jsCheck.toLowerCase();
            if(jsCheck.equals("yes")||jsCheck.equals("y"))
            {
                Path path2 = Paths.get(pathway+"/js");
                Files.createDirectories(path2);

            }

            //cssCheck.toLowerCase();
            if(cssCheck.equals("yes")||cssCheck.equals("y"))
            {
                Path path2 = Paths.get(pathway+"/css");
                Files.createDirectories(path2);

            }
            success = true;

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            success = false;
        }

    }
    public static void writeInSite()
    {
        if(success=true)
        {
            pathway="src/main/java/oop/exercises/ex43/"+siteName+"/index.html";
            try {
                FileWriter myWriter = new FileWriter(pathway);
                myWriter.write("<!DOCTYPE html>\n");
                myWriter.write("<html>\n");
                myWriter.write("<!--Newly Generated Website-->\n");
                myWriter.write("<head>\n");
                myWriter.write("<title>"+siteName+"</title>\n");
                myWriter.write("<meta name=\""+author+"\" content=\"HTML\">\n");
                myWriter.write("</head>\n");
                myWriter.write("<body>\n");
                myWriter.write("<p>My site is currently empty save for the title and meta stuff!</p>\n");
                myWriter.write("</body>\n");
                myWriter.write("</html>\n");
                myWriter.close();
                //System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("Cannot write in website because it wasn't created");
        }
    }
    public static void printWebGen()
    {
        if(success==true)
        {
            System.out.println("Created ./website/"+siteName);
            System.out.println("Created ./website/"+siteName+"/index.html");
            //jsCheck.toLowerCase();
            if(jsCheck.equals("yes")||jsCheck.equals("y"))
            {
                System.out.println("Created ./website/"+siteName+"/js/");

            }

           // cssCheck.toLowerCase();
            if(cssCheck.equals("yes")||cssCheck.equals("y"))
            {
                System.out.println("Created ./website/"+siteName+"/css/");

            }
        }
        else
        {
            System.out.println("The files weren't able to be constructed");
        }
    }

}
