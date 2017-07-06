package PACMAN;

import java.awt.Color;
import java.awt.Graphics;

public class PACMAN extends GameObject {

	
	int speed;
	
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;

	PACMAN(int x, int y, int width, int height) {
		super(x, y, width, height);

		speed = 3;

	}

	void update() {
		if (left) {
			x -= speed;
		}
		if (right) {
			x += speed;
		}
		if (up) {
			y -= speed;
		}
		if (down) {
			y += speed;
		}
		if (x >= 744) {
			x = 744;
		}
		if (x <= 20) {
			x = 20;
		}
		if (y >= 835) {
			y = 835;
		}
		if (y <= 20) {
			y = 20;
		}

	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);

	}

	void left() {
		x += 10;
	}

	void Right() {
		x -= 10;
	}

	void Up() {
		y += 10;
	}

	void Down() {
		y -= 10;
	}
}
