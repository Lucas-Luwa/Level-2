package PACMAN;

import java.awt.Color;
import java.awt.Graphics;

public class Dot extends GameObject {

	Dot(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	public void update() {

	}

	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
