package oop.exercises.ex41;

import java.util.ArrayList;

public class NameList {
    //class that holds possible name lists
    //array list named names
    public static ArrayList<String> names = new ArrayList<String>();
    //empty constructor as this objects won't really be taking initial stats
    public NameList(){

    }
    //add list function to add new names
    public static void addToList(String appstring)
    {
        names.add(appstring);
    }
    //print function to print final list, returns a copy to the application area
    public static ArrayList printList()
    {

        for(int i=0; i<names.size();i++)
        {
            System.out.println(names.get(i));
        }

        //System.out.print(names);
        return names;
    }
}
