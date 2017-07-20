package PACMAN;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	PACMAN P;
	ArrayList<GameObject> objects;

	private int score = 0;

	long enemyTimer = 0;
	int enemySpawnTime = 1000;

	public ObjectManager(PACMAN P) {
		objects = new ArrayList<GameObject>();
		this.P = P;
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

	// public void manageEnemies(){
	// if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
	// addObject(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50,
	// 50));
	// enemyTimer = System.currentTimeMillis();
	// }
	// }
	//
	public void checkCollision() {
	System.out.println(score);
		boolean c = false;
		for (int i = 0; i < objects.size(); i++) {
			for (int j = i + 1; j < objects.size(); j++) {
				GameObject o1 = objects.get(i);
				GameObject o2 = objects.get(j);

				if (P.collisionBox.intersects(o2.collisionBox)) {
					if(o2 instanceof Wall){
					c = true;
					P.setCollidingObject(o2);
					}
					if(o2 instanceof Dot){
						o2.isAlive = false;
						score+=1;
					}
				}

			}

		}
		P.colliding = c;

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
