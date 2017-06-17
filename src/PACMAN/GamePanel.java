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
	PACMAN PM = new PACMAN(250, 700, 50, 50);
	ObjectManager OM = new ObjectManager();
	GamePanel() {
		t = new Timer(1000 / 60, this);
		try {
			PACIMG = ImageIO.read(this.getClass().getResourceAsStream("PAC3.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OM.addObject(PM); 

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
			PM.Up();

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			PM.left = true;
			PM.Right();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			PM.left();
			PM.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			PM.Down();
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
		g.drawString("Press 'Enter' to continue.", 120, 400);
	}

	void drawGameState(Graphics g) {
		g.drawImage(PACIMG, 0, 0, 814, 900, null);
		OM.draw(g);
		
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 814, 900);
		g.setColor(Color.blue);
		g.setFont(titleFont3);
		g.drawString("Game Over!", 40, 200);
		g.setFont(titleFont4);
		g.drawString("Points: " + "", 200, 400);

	}

}
