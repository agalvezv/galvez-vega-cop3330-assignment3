package oop.exercises.ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Application {
    static Scanner inputs = new Scanner(System.in);


    public static void main(String[] args) {
        //Holders for the future pieces of the object
        String name = "";

        double price=0.00;

        int quantity=0;
        int counter = 0;
        //array list created to contain objects
        List<Product> products = new ArrayList<Product>();

        //parse through the json and get necessary info
        File input = new File("src/main/java/oop/exercises/ex44/exercise44_input.json");
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray jsonArrayofProducts = fileObject.get("products").getAsJsonArray();


            for(JsonElement productelement : jsonArrayofProducts)
            {
                //turn json object array into a array list of object orientation
                //System.out.println(counter);
                JsonObject productJsonObject = productelement.getAsJsonObject();

                name= productJsonObject.get("name").getAsString();
                price = productJsonObject.get("price").getAsDouble();
                quantity = productJsonObject.get("quantity").getAsInt();

                products.add(new Product(name,price,quantity));
                counter++;

            }


        } catch (FileNotFoundException e) {
            //failure
            e.printStackTrace();
        }
        //loop takes in a name from the user
        //if it isn't found it restarts
        //if it is found it will print out the appropriate part of the list.

        String response="";
        boolean searchCheck = false;

        while(searchCheck == false)
        {
            System.out.println("What is the product name?");
            response=inputs.nextLine();
            //System.out.println(response);

            for(int i=0; i<products.size();i++)
            {
                if(products.get(i).name.equals(response))
                {

                    //System.out.println(products.get(i).price);
                    System.out.println("Name: " + products.get(i).name);
                    System.out.printf("Price: %.2f\n", products.get(i).price);
                    System.out.println("Quantity: " + products.get(i).quantity);

                    searchCheck=true;
                }
            }
            if(searchCheck == false)
            {
                System.out.println("Sorry, that product was not found in our inventory.");

            }
        }


    }
}
