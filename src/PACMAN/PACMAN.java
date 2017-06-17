package PACMAN;

import java.awt.Color;
import java.awt.Graphics;

public class PACMAN extends GameObject{
	int x;
	int speed;
	int y;
	int width;
	int height;
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	PACMAN(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
		} else if (x <= 20) {
			x = 20; 
		} else if (y >= 835) {
			y = 835;
		} else if (y <= 20) {
			y = 20;
		}
		if(x >= 475 && y >= 794 && y<=823){
			x = 475;
			y = 800;
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
