package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {

    // First way to initialize an array
    float[] rainfall = { 45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58 };

    // Second way to initialize an array
    float[] a1 = new float[100];

    // Third way to initialize an array
    float[] a2; // This would produce a null pointer exception as no memory has been allocated yet


    String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    public void settings() 
    {
        size(500,500);
    }

    public void setup()
    {

        // Forward iteration
        for(int i = 0; i < rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        // Enhanced for loop equivelant to foreach
        // Limited in that you can't get the index of each element of the array
        for(float r:rainfall)
        {
            println(r);
        }

        // Backwords iteration
        for(int i = rainfall.length-1; i >= 0; i--)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        // Initialize max and min values as first element in array
        float max = rainfall[0];
        float min = rainfall[0];

        // Iterate over the array
        for(int i = 1; i < rainfall.length; i++)
        {
            // If min is greater than the current iteration array value set min to the array value
            if(min > rainfall[i])
            {
                min = rainfall[i];
            }

            // If max is less than the current iteration array value set max to the array value
            if(max < rainfall[i])
            {
                max = rainfall[i];
            }
        }

        // Print the results
        println("The max is: " + max + "\n");
        println("The min is: " + min + "\n");

    }

    public void draw()
    {

    }
}
