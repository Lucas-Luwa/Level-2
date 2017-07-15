package PACMAN;

import java.awt.Color;
import java.awt.Graphics;

public class PACMAN extends GameObject {

	int speed;

	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	boolean colliding = false;

	GameObject CollidingObject;

	PACMAN(int x, int y, int width, int height) {
		super(x, y, width, height);

		speed = 3;

	}

	void update() {
		// collisionBox.setBounds(x, y, width, height);
				if (colliding) {
					int xdif = collisionBox.x - CollidingObject.collisionBox.x;
					int ydif = collisionBox.y - CollidingObject.collisionBox.y;
					collisionBox.x -= xdif;
					collisionBox.y -= ydif;
					System.out.println(xdif+ ":)");
					System.out.println(ydif);

				}
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
		if(x<=0) {
			x = 800;
		}
		if(x>=800) {
			x = 50;
		}

		

		x = collisionBox.x;
		y = collisionBox.y;

	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);

	}

	public void setCollidingObject(GameObject o) {
		CollidingObject = o;
	}

}
