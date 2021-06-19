package oop.exercises.ex42;

import java.util.ArrayList;

public class NameList {
    //class that holds possible name lists
    //array list named names
    public static ArrayList<String> namesTable = new ArrayList<String>();
    public static ArrayList<String> lastName = new ArrayList<String>();
    public static ArrayList<String> firstName = new ArrayList<String>();
    public static ArrayList<String> salary = new ArrayList<String>();
    //empty constructor as this objects won't really be taking initial stats
    public NameList(){

    }
    //add list function to add new names
    //This version adds a specific amount of spaces to format the table before splitting up strings between various array lists
    public static void addToList(String appstring)
    {

        int size = appstring.length();
        String space1="";
        String space2="";

        int lNameSize=0;
        int fNameSize=0;
        int sSize=0;

        String lNameSizeS="";
        String fNameSizeS="";
        String sSizeS="";
        String mover="";
        //System.out.println("poop");
        String compare = "--------------------------";
        //names.add(appstring);
        char[] holder = appstring.toCharArray();
        int length = 0;
        int i = 0;

        while(holder[i]!=',')
        {
            length++;
            i++;
        }
        lNameSizeS=appstring.substring(0,length);
        mover=appstring.substring(length+1,appstring.length());


        //System.out.println(lNameSizeS);
        //System.out.println(mover);

        char[] holder2 = mover.toCharArray();
        length = 0;
        i = 0;
        while(holder2[i]!=',')
        {
            length++;
            i++;
        }
        fNameSizeS=mover.substring(0,length);
        mover=mover.substring(length+1,mover.length());


        //System.out.println(fNameSizeS);
        //System.out.println(mover);
        sSizeS=mover;
        //System.out.println(sSizeS);

        lNameSize=lNameSizeS.length();
        fNameSize=fNameSizeS.length();
        sSize=sSizeS.length();


        for(int k=0;k<compare.length();k++)
        {

            if(lNameSize<compare.length())
            {
                space1= space1+" ";
                lNameSize++;

            }
            if(fNameSize<compare.length())
            {
                space2= space2+" ";
                fNameSize++;

            }

        }
        namesTable.add(lNameSizeS+space1+fNameSizeS+space2+sSizeS);
        lastName.add(lNameSizeS);
        firstName.add(fNameSizeS);
        salary.add(sSizeS);
        //System.out.println(namesTable);

    }



    //print function to print final list, returns a copy to the application area
    //nothing about printing is different
    public static ArrayList printList()
    {
        System.out.println("Last                      First                     Salary");
        System.out.println("----------------------------------------------------------");
        for(int i=0; i<namesTable.size();i++)
        {
            System.out.println(namesTable.get(i));
        }

        //System.out.print(names);


        return namesTable;
    }
}