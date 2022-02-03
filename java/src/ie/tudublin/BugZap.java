package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{

	// Player variables
    float playerX, playerY, playerWidth;

	// Bug variables
	float bugX, bugY, bugWidth;

	// Settings method
    public void settings()
	{
        size(500,500);   
	}

	// Setup method
	public void setup() 
    {
		colorMode(RGB);

		smooth();

		playerX = width / 2; // Width is a built in variable of PApplet which is the width of the screen
		playerY = height - 50; // Height is another built in variable
		playerWidth = 50;

		resetBug();
	}
	
	private void resetBug() 
	{
		bugX = random(bugWidth / 2, width - (bugWidth /2));
		bugY = 50;
		bugWidth = 50;
	}

	void drawBug(float x, float y, float w) 
	{
		float halfW = w / 2;
		stroke(255);
		noFill();
		triangle(x - halfW, y + halfW, x, y - halfW, x + halfW, y + halfW);
	}

	void drawPlayer(float x, float y, float w) 
	{
		stroke(255);
		rectMode(CENTER);
		noFill();
		rect(x, y, w, 20);
		line(x, y - 10, x, y - 20);

	}

	float playerSpeed = 5;

	public void keyPressed() 
	{
		if(keyCode == LEFT) // keyCode is built in variable to get keys pressed from keyboard
		{
			playerX -=playerSpeed;
		}
		if(keyCode == RIGHT)
		{
			playerX+=playerSpeed;
		}

		if (key == ' ')
		{	
			float halfW = bugWidth / 2;
			if(playerX > bugX - halfW && playerX < bugX + halfW)
			{
				score++;
				resetBug();
				line(playerX, playerY - 10, playerX, bugY);
			}
			else
			{
				line(playerX, playerY - 10, playerX, 0);
			}
		}
	}

	int score = 0;

	void moveBug()
	{
		bugY++;
		bugX += random(-20, 20);
	}

	public void draw()
	{	
		background(0);
		strokeWeight(2);
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugWidth);
		if (frameCount % 20 == 0) 
		{
			moveBug();
		}
		text("Score: " + score, 50, 50);
	}
}
