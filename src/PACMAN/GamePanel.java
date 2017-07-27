package PACMAN;

import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	public static BufferedImage PACIMG;
	Font titleFont = new Font("Arial", Font.BOLD, 150);
	Font titleFont2 = new Font("Arial", Font.PLAIN, 50);
	Font titleFont3 = new Font("Arial", Font.BOLD, 120);
	Font titleFont4 = new Font("Arial", Font.PLAIN, 100);
	PACMAN PM = new PACMAN(100, 750, 50, 50);
	Ghosts Gerald = new Ghosts(400, 400, 40, 40, PM);

	ObjectManager OM = new ObjectManager(PM, Gerald);

	Dot d = new Dot(50, 50, 10, 10);
	Dot d2 = new Dot(100, 50, 10, 10);
	Dot d3 = new Dot(150, 50, 10, 10);
	Dot d4 = new Dot(200, 50, 10, 10);
	Dot d5 = new Dot(250, 50, 10, 10);
	Dot d6 = new Dot(300, 50, 10, 10);
	Dot d7 = new Dot(350, 50, 10, 10);
	Dot d8 = new Dot(700, 50, 10, 10);
	Dot d9 = new Dot(450, 50, 10, 10);
	Dot d10 = new Dot(500, 50, 10, 10);
	Dot d11 = new Dot(550, 50, 10, 10);
	Dot d12 = new Dot(600, 50, 10, 10);
	Dot d13 = new Dot(650, 50, 10, 10);
	Dot d14 = new Dot(750, 50, 10, 10);
	Dot d15 = new Dot(35, 100, 10, 10);
	Dot d16 = new Dot(35, 150, 10, 10);
	Dot d17 = new Dot(35, 200, 10, 10);
	Dot d18 = new Dot(35, 250, 10, 10);
	Dot d19 = new Dot(765, 150, 10, 10);
	Dot d20 = new Dot(765, 200, 10, 10);
	Dot d21 = new Dot(765, 250, 10, 10);
	Dot d22 = new Dot(765, 100, 10, 10);
	Dot d23 = new Dot(185, 100, 10, 10);
	Dot d24 = new Dot(185, 151, 10, 10);
	Dot d25 = new Dot(185, 202, 10, 10);
	Dot d26 = new Dot(185, 253, 10, 10);
	Dot d27 = new Dot(185, 304, 10, 10);
	Dot d28 = new Dot(185, 406, 10, 10);
	Dot d29 = new Dot(185, 457, 10, 10);
	Dot d30 = new Dot(185, 508, 10, 10);
	Dot d31 = new Dot(185, 559, 10, 10);
	Dot d32 = new Dot(185, 610, 10, 10);
	Dot d33 = new Dot(185, 661, 10, 10);
	Dot d34 = new Dot(185, 712, 10, 10);
	Dot d35 = new Dot(185, 763, 10, 10);
	Dot d36 = new Dot(620, 100, 10, 10);
	Dot d37 = new Dot(620, 151, 10, 10);
	Dot d38 = new Dot(620, 202, 10, 10);
	Dot d39 = new Dot(620, 253, 10, 10);
	Dot d40 = new Dot(620, 304, 10, 10);
	Dot d41 = new Dot(620, 355, 10, 10);
	Dot d42 = new Dot(620, 406, 10, 10);
	Dot d43 = new Dot(620, 457, 10, 10);
	Dot d44 = new Dot(620, 508, 10, 10);
	Dot d45 = new Dot(620, 559, 10, 10);
	Dot d46 = new Dot(620, 610, 10, 10);
	Dot d47 = new Dot(620, 661, 10, 10);
	Dot d48 = new Dot(620, 712, 10, 10);
	Dot d49 = new Dot(620, 763, 10, 10);
	Dot d50 = new Dot(185, 355, 10, 10);

	GamePanel() {
		t = new Timer(1000 / 60, this);
		try {
			PACIMG = ImageIO.read(this.getClass().getResourceAsStream("PAC3.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OM.addObject(Gerald);

		OM.addObject(PM);
		OM.addObject(d3);
		OM.addObject(d);
		OM.addObject(d2);
		OM.addObject(d4);
		OM.addObject(d5);
		OM.addObject(d6);
		OM.addObject(d7);
		OM.addObject(d8);
		OM.addObject(d9);
		OM.addObject(d10);
		OM.addObject(d11);
		OM.addObject(d12);
		OM.addObject(d13);
		OM.addObject(d14);
		OM.addObject(d15);
		OM.addObject(d16);
		OM.addObject(d17);
		OM.addObject(d18);
		OM.addObject(d19);
		OM.addObject(d20);
		OM.addObject(d21);
		OM.addObject(d22);
		OM.addObject(d23);
		OM.addObject(d24);
		OM.addObject(d25);
		OM.addObject(d26);
		OM.addObject(d27);
		OM.addObject(d28);
		OM.addObject(d29);
		OM.addObject(d30);
		OM.addObject(d31);
		OM.addObject(d32);
		OM.addObject(d33);
		OM.addObject(d34);
		OM.addObject(d35);
		OM.addObject(d36);
		OM.addObject(d37);
		OM.addObject(d38);
		OM.addObject(d39);
		OM.addObject(d40);
		OM.addObject(d41);
		OM.addObject(d42);
		OM.addObject(d43);
		OM.addObject(d44);
		OM.addObject(d45);
		OM.addObject(d46);
		OM.addObject(d47);
		OM.addObject(d48);
		OM.addObject(d49);
		OM.addObject(d50);
		OM.addObject(new Wall(80, 80, 77, 50));
		OM.addObject(new Wall(225, 80, 107, 50));
		OM.addObject(new Wall(485, 80, 107, 50));
		OM.addObject(new Wall(658, 80, 79, 50));
		OM.addObject(new Wall(398, 10, 20, 120));
		OM.addObject(new Wall(398, 715, 20, 110));
		OM.addObject(new Wall(224, 195, 20, 194));
		OM.addObject(new Wall(224, 456, 20, 108));
		OM.addObject(new Wall(224, 715, 20, 110));
		OM.addObject(new Wall(571, 715, 20, 110));
		OM.addObject(new Wall(571, 456, 20, 108));
		OM.addObject(new Wall(571, 195, 20, 194));
		OM.addObject(new Wall(398, 195, 20, 110));
		OM.addObject(new Wall(658, 630, 20, 108));
		OM.addObject(new Wall(498, 368, 10, 110));
		OM.addObject(new Wall(308, 368, 10, 110));
		OM.addObject(new Wall(138, 630, 20, 108));
		OM.addObject(new Wall(398, 541, 20, 110));
		OM.addObject(new Wall(658, 454, 150, 110));
		OM.addObject(new Wall(658, 282, 150, 110));
		OM.addObject(new Wall(9, 454, 150, 110));
		OM.addObject(new Wall(9, 282, 150, 110));
		OM.addObject(new Wall(310, 468, 190, 10));
		OM.addObject(new Wall(310, 368, 70, 10));
		OM.addObject(new Wall(438, 368, 70, 10));
		OM.addObject(new Wall(78, 196, 80, 20));
		OM.addObject(new Wall(658, 196, 80, 20));
		OM.addObject(new Wall(308, 196, 198, 20));
		OM.addObject(new Wall(308, 544, 198, 20));
		OM.addObject(new Wall(308, 716, 198, 20));
		OM.addObject(new Wall(484, 282, 90, 20));
		OM.addObject(new Wall(224, 282, 106, 20));
		OM.addObject(new Wall(80, 629, 70, 20));
		OM.addObject(new Wall(224, 629, 106, 20));
		OM.addObject(new Wall(484, 629, 108, 20));
		OM.addObject(new Wall(658, 629, 80, 20));
		OM.addObject(new Wall(78, 803, 253, 20));
		OM.addObject(new Wall(483, 803, 253, 20));
		OM.addObject(new Wall(0, 716, 70, 20));
		OM.addObject(new Wall(744, 716, 70, 20));
		OM.addObject(new Wall(0, 0, 810, 18));
		OM.addObject(new Wall(800, 0, 18, 390));
		OM.addObject(new Wall(0, 0, 18, 390));
		OM.addObject(new Wall(800, 455, 18, 450));
		OM.addObject(new Wall(0, 455, 18, 450));
		OM.addObject(new Wall(0, 884, 900, 20));
	}

	void startGame() {
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			} else {
				currentState++;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			PM.down = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			PM.left = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			PM.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {

			PM.up = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		PM.left = false;
		PM.right = false;
		PM.up = false;
		PM.down = false;
	}

	void updateMenuState() {

	}

	void updateGameState() {
		OM.update();

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 814, 900);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("PAC MAN!", 30, 200);
		g.setFont(titleFont2);
		g.drawString("Press ''Enter'' to continue.", 120, 400);
	}

	void drawGameState(Graphics g) {
		g.drawImage(PACIMG, 0, 0, 814, 900, null);
		OM.draw(g);
		g.setColor(Color.YELLOW);

	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 814, 900);
		g.setColor(Color.blue);
		g.setFont(titleFont3);
		g.drawString("Game Over!", 40, 200);
		g.setFont(titleFont4);
		g.drawString("Points: " + OM.getScore(), 200, 400);

	}

}
