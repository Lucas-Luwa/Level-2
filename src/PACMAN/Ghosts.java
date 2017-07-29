package PACMAN;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Ghosts extends GameObject {
	PACMAN PM;
	int speed;

	GameObject CollidingObject;
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	boolean colliding = false;
	ArrayList<Integer> xv = new ArrayList<Integer>();
	ArrayList<Integer> yv = new ArrayList<Integer>();

	public Ghosts(int x, int y, int width, int height, PACMAN PM) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		this.PM = PM;
		speed = 1;
	}

	void update() {
		if (PM.x < x) {
			left = true;
		} else {
			left = false;
		}
		if (PM.y > y) {
			down = true;
		} else {
			down = false;
		}
		if (PM.x > x) {
			right = true;
		} else {
			right = false;
		}
		if (PM.y < y) {
			up = true;
		} else {
			up = false;
		}

		if (colliding) {
			int CX = CollidingObject.x;
			int CY = CollidingObject.y;
			int CW = CollidingObject.width;
			int CH = CollidingObject.height;

			if (y > CY && y < CY + CH) {
				collisionBox.y += speed;
			} else if (y < CY && y + height > CY) {
				collisionBox.y -= speed;
			}
			if (x < CX && x + width > CX) {
				collisionBox.x -= speed;
			}

			else if (x > CX && x + width > CX + CW) {
				collisionBox.x += speed;
			}

		} else

		{

			if (left) {

				collisionBox.x -= speed;

			}
			if (right) {

				collisionBox.x += speed;

			}
			if (up) {

				collisionBox.y -= speed;

			}
			if (down) {

				collisionBox.y += speed;

			}
		}
		System.out.println("hi");
		x = collisionBox.x;
		y = collisionBox.y;

	}

	void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}

	public void setCollidingObject(GameObject o1) {
		CollidingObject = o1;

	}

	void move() {
		x += 100;
	}
}
