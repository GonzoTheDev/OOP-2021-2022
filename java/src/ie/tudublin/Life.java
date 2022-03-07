package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {
	
	LifeBoard board;


	public void settings() {
		size(900, 900);
		//fullScreen(P3D, SPAN);
		board = new LifeBoard(500, this);
		board.randomise();
		println(board.countCellsAround(1, 1));
	}

	public void setup() {
		colorMode(HSB);

	}

	
	public void draw() {
		board.render();
		board.update();
	}
}
