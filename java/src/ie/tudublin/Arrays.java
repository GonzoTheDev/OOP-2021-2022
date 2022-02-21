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
        for(int i = 0; i < rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        // Enhanced for loop equivelant to foreach
        for(float r:rainfall)
        {
            println(r);
        }
    }

    public void draw()
    {

    }
}
