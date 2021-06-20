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

import static java.lang.System.out;

public class Application {
    static Scanner inputs = new Scanner(System.in);


    public static void main(String[] args) {
        //String names[] = new String[10];
        String name = "";
        //double prices[] = new double[10];
        double price=0.00;
        //int quantities[] = new int[10];
        int quantity=0;
        int counter = 0;
        List<Product> products = new ArrayList<Product>();
        File input = new File("src/main/java/oop/exercises/ex44/exercise44_input.json");
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray jsonArrayofProducts = fileObject.get("products").getAsJsonArray();


            for(JsonElement productelement : jsonArrayofProducts)
            {

                System.out.println(counter);
                JsonObject productJsonObject = productelement.getAsJsonObject();
                //names[counter] = productJsonObject.get("name").getAsString();
                name= productJsonObject.get("name").getAsString();
                price = productJsonObject.get("price").getAsDouble();
                quantity = productJsonObject.get("quantity").getAsInt();
                //prices[counter] = productJsonObject.get("price").getAsDouble();
                //quantities[counter] = productJsonObject.get("quantity").getAsInt();
                //System.out.println(name);
                //Product product = new Product(names[counter], price, quantity);
                //out.println(product.name);
                //out.println(product.price);
                //out.println(product.quantity);
                //products.add(product);
                products.add(new Product(name,price,quantity));
                counter++;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String response="";
        boolean searchCheck = false;

        while(searchCheck == false)
        {
            System.out.println("What is the product name?");
            response=inputs.nextLine();
            System.out.println(response);

            for(int i=0; i<products.size();i++)
            {
                if(products.get(i).name.equals(response))
                {
                    System.out.println(products.get(i).price);
                    System.out.println(products.get(i).quantity);

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
