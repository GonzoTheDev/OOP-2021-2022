package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{

    float playerX, playerY, playerWidth;

    public void settings()
	{
        size(500,500);   
	}

	public void setup() 
    {
		colorMode(RGB);

		smooth();

		playerX = width / 2; // Width is a built in variable of PApplet which is the width of the screen
		playerY = height - 50; // Height is another built in variable
		playerWidth = 50;

	}
	
	void drawPlayer(float x, float y, float w) 
	{
		stroke(255);
		rectMode(CENTER);
		noFill();
		rect(x, y, w, 20);
		line(x, y - 10, x, y - 20);

	}

	public void draw()
	{	
		background(0);
		strokeWeight(2);
		drawPlayer(playerX, playerY, playerWidth);
	}
}
