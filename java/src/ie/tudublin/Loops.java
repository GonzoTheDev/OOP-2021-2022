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
		background(0);

		int max = 0;
		int rec1 = 0;
		int rec2 = 50;

        for(int i = 0; i < 10;  i++)
		{
			
			if(i > 0)
			{
				max = max + 20;
				rec1 = rec1 + 50;
				rec2 = rec2 + 50;
			}
			noStroke();
            fill(max, 300, 300);
			rect(rec1, 0, rec2, 500);

            
        }


		switch(mode)	
		{
			case 0:
				break;
			case 1:
				break;
		}
	}
}
