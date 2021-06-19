package oop.exercises.ex43;

import java.util.Scanner;

public class Application {
    static Scanner inputs = new Scanner(System.in);
    //User writes to here
    public static void main(String[] args) {
        SiteGen newSite = new SiteGen();
        //user asks for site name
        String given ="";
        System.out.println("Site name:");
        given = inputs.nextLine();
        newSite.getSiteName(given);
        //function


        //user asks for author name
        System.out.println("Author:");
        given = inputs.nextLine();
        newSite.getAuthor(given);
        //function


        //ask if a folder for javascript is included?
        System.out.println("Do you want a folder for JavaScript?");
        given = inputs.nextLine();
        newSite.getJSCheck(given);
        //function

        //ask if a folder for CSS is included.
        System.out.println("Do you want a folder for CSS?");
        given = inputs.nextLine();
        newSite.getCSSCheck(given);
        newSite.generateSite();
        newSite.writeInSite();
        newSite.printWebGen();
        //print output.

    }
}
