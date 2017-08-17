package PACMAN;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ObjectManager {
	PACMAN P;
	Ghosts Gerald;

	ArrayList<GameObject> objects;

	private int score = 0;

	long enemyTimer = 0;
	int enemySpawnTime = 1000;

	public ObjectManager(PACMAN P, Ghosts Gerald) {
		objects = new ArrayList<GameObject>();
		this.P = P;
		this.Gerald = Gerald;

	}

	public ObjectManager(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
		}
		checkCollision();
		purgeObjects();
	}

	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}

	public void checkCollision() {
		boolean c = false;
		boolean G1 = false;

		for (int i = 0; i < objects.size(); i++) {
			GameObject o1 = objects.get(i);
			if (P.collisionBox.intersects(o1.collisionBox)) {
				if (o1 instanceof Wall) {
					c = true;
					P.setCollidingObject(o1);
				}
				if (o1 instanceof Dot) {
					o1.isAlive = false;
					score += 1;

				}
			}
			if (Gerald.collisionBox.intersects(o1.collisionBox)) {
				if (o1 instanceof PACMAN) {
					G1 = true;
					Gerald.setCollidingObject(o1);
					P.isAlive = false;
					JOptionPane.showMessageDialog(null, "You Lost! Press ''ok'' to see your score.");
				}

			}

			P.colliding = c;

		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int s) {
		score = s;
	}

	public void reset() {
		objects.clear();
	}
}
