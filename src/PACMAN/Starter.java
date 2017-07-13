package PACMAN;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Starter {
	JFrame f;
	GamePanel p;
	int x = 814;
	int y = 900;

	public static void main(String[] args) {
		Starter S = new Starter();

	}

	Starter() {
		f = new JFrame();
		p = new GamePanel();
		f.setVisible(true);

		p.setPreferredSize(new Dimension(x, y));
		setup();

	}

	void setup() {
		f.add(p);
		f.pack();
		p.startGame();
		f.addKeyListener(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}