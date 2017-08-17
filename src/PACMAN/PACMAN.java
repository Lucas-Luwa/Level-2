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

			if (x <= -width)

			{
				collisionBox.x = 800;
			}
			if (x >= 800 + width)

			{
				collisionBox.x = 0;
			}
		}
		x = collisionBox.x;
		y = collisionBox.y;

	}

	void draw(Graphics g) {

		g.drawImage(GamePanel.PACRIMG, x, y, width, height, null);

	}

	public void setCollidingObject(GameObject o) {
		CollidingObject = o;
	}

}
