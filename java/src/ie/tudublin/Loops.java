package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	public void magicMap(float i, float a, float b, float c, float d) 
	{
		float div = (d - c) / (b - a);
		for(i = a; i < b; i++)
		{
			
		}
		
	}

	
	public void draw()
	{
		switch(mode)	
		{
			case 0:
				background(0);
				int bars = 10;
				float w = width / (float) bars;
				float colorGap = 255 / (float) bars;

				for(int i = 0; i < bars;  i++)
				{
					noStroke();
					fill(colorGap * i, 255, 255);
					rect(i * w, 0, w, height);	
				}

				break;
			case 1:
				int color = 0;
				int square1 = 0;
				int square2 = 50;
				int square3 = 0;
				int square4 = 50;
		
				for(int i = 0; i < 10;  i++)
				{
					
					if(i > 0)
					{
						color = color + 20;
						square1 = square1 + 50;
						//square2 = square2 + 50;
						square3 = square3 + 50;
						//square4 = square4 + 50;
					}
					noStroke();
					fill(color, 300, 300);
					rect(square1, square3, square2, square4);
		
					
				}
				break;
		}
	}
}
