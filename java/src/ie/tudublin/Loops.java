package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(500, 500, P2D);
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		println(mode);
	}

	float magicMap(float a, float b, float c, float d, float e) {
		float output;
		a -= b;
		c -= b;
		e -= d;

		output = ((a / c) * e) + d;

		return output;
	}

	float magicMap1(float a, float b, float c, float d, float e) {
		float r1 = c - b;
		float r2 = e - d;
		float howFar = a - b;

		return d + ((howFar / r1) * r2);
	}

	float offset = 0;

	public void draw() {
		switch (mode) {
			case 0:
				background(0);
				int bars = (int) (mouseX / 20.0f);
				float w = width / (float) bars;
				for (int i = 0; i < bars; i++) {
					noStroke();
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}
				break;
			case 1: {
				background(0);
				int squares = (int) (mouseX / 20.0f);
				float h = width / (float) squares;
				for (int i = 0; i < squares; i++) {
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					rect((width - h) - x, x, h, h);
				}
			}
				break;
			case 2:
				background(255);
				int circles = (int) (mouseX / 20.0f);
				offset += (mouseY / 100.0f);
				float d = width / (float) circles;
				for (int j = 0; j < circles; j++) {
					for (int i = 0; i < circles; i++) {
						noStroke();
						float c = map((i + j + offset), 0, circles * 2, 0, 255) % 256;
						fill(c, 255, 255);
						float x = map(i, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						float y = map(j, 0, circles - 1, d / 2.0f, width - (d / 2.0f)); 
						circle(x, y, d);
					}
				}
				break;
			case 3:
				background(0);
				colorMode(HSB);
				float border = width * 0.1f;
				for(int i = -5; i <= 5; i ++)
				{
					float x = map(i, -5, 5, border, width - border);
					stroke(0, 255, 0);
					line(x, border, x, height - border);
					line(border, x, width - border, x);
					fill(255);
					text(i, x, border * 0.5f);
					text(i, border * 0.5f, x);
				}
			case 4:
			{
				background(0);
				stroke(255, 255, 255);	
				float cx = width / 2;
				float cy = height / 2;	
				float radius = 200;		
				int points = (int)map(mouseX, 1, width, 5, 20);
				int sides = points * 2;
				float px = cx;
				float py = cy - radius; 
				for(int i = 0 ; i <= sides ; i ++)
				{
					float r = (i % 2 == 0) ? radius : radius / 2; 
					// float r = radius;
					float theta = map(i, 0, sides, 0, TWO_PI);
					float x = cx + sin(theta) * r;
					float y = cy - cos(theta) * r;
					
					//circle(x, y, 20);
					line(px, py, x, y);
					px = x;
					py = y;
				}

				// map(a,b,c,d,e);
				// a = inputvalue
				// b - c - start and end of the first range
				// d, e 0 - start and and of the end range

				// map(-2, 10, 90, 200, 233);
			}
			break;
			case 5:
			{
				background(0);
				stroke(255);

				int sides = 360;

				for(int i = 0; i < sides; i++)
				{
					int x1 = 250;  int y1 = 100;
					int x2 = 100;  int y2 = 350;
					int x3 = 400;  int y3 = 350;

					noFill();

					//main triangle
					triangle(x1, y1, x2, y2, x3, y3);

					//beam of light
					line(0, 250, 190, 200);

					fill(255, 0, map(i, 0, 255, 0, sides));

					//light inside prism
					triangle(190, 200, 297, 180, 320, 220);

					noStroke();
					
					//light exiting prism 
					//

					//red
					fill(0, 255, 255);
					quad((float)297.00, (float) 180.00, (float)303.67, (float) 186.67, (float)500, (float) 209.0, (float) 500.00, (float)200.0);
					
					//orange
					fill(25, 255, 255);
					quad((float)303.67, (float) 186.67, (float)307.3367, (float) 193.34, (float)500, (float) 218.0, (float) 500.00, (float)209.0);

					//yellow
					fill(40, 255, 255);
					quad((float)307.3367, (float) 193.34, (float)312.0034, (float) 200.01, (float)500, (float) 227.0, (float) 500.00, (float)218.0);

					//green
					fill(60, 255, 255);
					quad((float)310.3367, (float) 200.01, (float)317.0034, (float) 206.68, (float)500, (float) 236.0, (float) 500.00, (float)227.0);

					//blue
					fill(140, 255, 255);
					quad((float)313.3367, (float) 206.68, (float)322.0034, (float) 213.35, (float)500, (float) 245.0, (float) 500.00, (float)236.0);

					//purple
					fill(195, 255, 255);
					quad((float)316.3367, (float) 213.35, (float)327.0034, (float) 220.02, (float)500, (float) 254.0, (float) 500.00, (float)245.0);
				}
			}
			break;
		}
	}
}
