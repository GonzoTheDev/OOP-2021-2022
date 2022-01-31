package ie.tudublin;

import processing.core.PApplet;


public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);

	}

	public void draw()
	{	
		/*
		stroke(255);
		background(250, 250, 0); // single param is grey scale from 0 to 255 i.e. 1 byte of data ala 8 bits
		line(10, 10, 200, 200); // x1, y1, x2, y2
		circle(200, 250, 50); // cx, cy, r
		ellipse(50, 200, 90, 200); // cx, cy, w, h

		fill(0,0,255);
		//noFill();
		//noStroke();

		rectMode(CENTER);
		rect(300, 20, 100, 20); // tlx, tly, w , h

		rectMode(CORNER);
		rect(300, 20, 100, 20); // tlx, tly, w , h

		point(20, 300); // single pixel coordinates

		triangle(10, 400, 50, 450, 300, 200); // x1, y1, x2, y2, x3, y3
		*/
		stroke(255);
		background(255, 0, 0);

		fill(255, 255, 0);
		noStroke();
		circle(250, 250, 400);

		fill(129, 252, 230);
		noStroke();
		triangle(250, 10, 460, 400, 20, 400);

		fill(250);
		noStroke();
		ellipse(245, 200, 205, 100);

		fill(0);
		noStroke();
		circle(245, 200, 50);

	}
}
