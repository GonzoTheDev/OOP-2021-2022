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

	
	public void draw()
	{
		float newMap = map(-2, 10,90,200,233);
		System.out.println(newMap);
		switch(mode)	
		{
			case 0:
				break;
			case 1:
				
				break;
				//map(a,b,c,d,e);
				//a = inputvalue
				// b - c - start and end of the first range
				// d - e - start and end of the second range

		}
	}
}
