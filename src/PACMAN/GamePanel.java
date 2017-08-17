
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
	public static BufferedImage ghostImg;
	public static BufferedImage PACLIMG;
	public static BufferedImage PACDIMG;
	public static BufferedImage PACRIMG;
	public static BufferedImage PACUIMG;
	Font titleFont = new Font("Arial", Font.BOLD, 150);
	Font titleFont2 = new Font("Arial", Font.PLAIN, 50);
	Font titleFont3 = new Font("Arial", Font.BOLD, 120);
	Font titleFont4 = new Font("Arial", Font.PLAIN, 100);
	Font titleFont5 = new Font("Arial", Font.PLAIN, 30);
	Font titleFont6 = new Font("Arial", Font.PLAIN, 15);
	PACMAN PM = new PACMAN(385, 660, 50, 50);
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
	Dot d51 = new Dot(40, 853, 10, 10);
	Dot d52 = new Dot(89, 853, 10, 10);
	Dot d53 = new Dot(138, 853, 10, 10);
	Dot d54 = new Dot(187, 853, 10, 10);
	Dot d55 = new Dot(236, 853, 10, 10);
	Dot d56 = new Dot(285, 853, 10, 10);
	Dot d57 = new Dot(334, 853, 10, 10);
	Dot d58 = new Dot(383, 853, 10, 10);
	Dot d59 = new Dot(432, 853, 10, 10);
	Dot d60 = new Dot(481, 853, 10, 10);
	Dot d61 = new Dot(530, 853, 10, 10);
	Dot d62 = new Dot(579, 853, 10, 10);
	Dot d63 = new Dot(629, 853, 10, 10);
	Dot d64 = new Dot(678, 853, 10, 10);
	Dot d65 = new Dot(728, 853, 10, 10);
	Dot d66 = new Dot(772, 853, 10, 10);
	Dot d67 = new Dot(30, 420, 10, 10);
	Dot d68 = new Dot(80, 420, 10, 10);
	Dot d69 = new Dot(130, 420, 10, 10);
	Dot d70 = new Dot(670, 420, 10, 10);
	Dot d71 = new Dot(720, 420, 10, 10);
	Dot d72 = new Dot(770, 420, 10, 10);
	Dot d73 = new Dot(40, 600, 10, 10);
	Dot d74 = new Dot(40, 640, 10, 10);
	Dot d75 = new Dot(40, 680, 10, 10);
	Dot d76 = new Dot(40, 770, 10, 10);
	Dot d77 = new Dot(40, 812, 10, 10);
	Dot d78 = new Dot(772, 600, 10, 10);
	Dot d79 = new Dot(772, 640, 10, 10);
	Dot d80 = new Dot(772, 680, 10, 10);
	Dot d81 = new Dot(772, 770, 10, 10);
	Dot d82 = new Dot(772, 812, 10, 10);
	Dot d83 = new Dot(360, 812, 10, 10);
	Dot d84 = new Dot(450, 812, 10, 10);
	Dot d85 = new Dot(140, 160, 10, 10);
	Dot d86 = new Dot(90, 160, 10, 10);
	Dot d87 = new Dot(140, 250, 10, 10);
	Dot d88 = new Dot(90, 250, 10, 10);
	Dot d89 = new Dot(240, 160, 10, 10);
	Dot d90 = new Dot(290, 160, 10, 10);
	Dot d91 = new Dot(340, 160, 10, 10);
	Dot d92 = new Dot(390, 160, 10, 10);
	Dot d93 = new Dot(440, 160, 10, 10);
	Dot d94 = new Dot(490, 160, 10, 10);
	Dot d95 = new Dot(540, 160, 10, 10);
	Dot d96 = new Dot(590, 160, 10, 10);
	Dot d97 = new Dot(670, 160, 10, 10);
	Dot d98 = new Dot(720, 160, 10, 10);
	Dot d99 = new Dot(350, 100, 10, 10);
	Dot d100 = new Dot(450, 100, 10, 10);
	Dot d101 = new Dot(660, 250, 10, 10);
	Dot d102 = new Dot(710, 250, 10, 10);
	Dot d103 = new Dot(660, 600, 10, 10);
	Dot d104 = new Dot(710, 600, 10, 10);
	Dot d105 = new Dot(660, 770, 10, 10);
	Dot d106 = new Dot(710, 770, 10, 10);
	Dot d107 = new Dot(140, 600, 10, 10);
	Dot d108 = new Dot(90, 600, 10, 10);
	Dot d109 = new Dot(90, 770, 10, 10);
	Dot d110 = new Dot(140, 770, 10, 10);
	Dot d111 = new Dot(90, 680, 10, 10);
	Dot d112 = new Dot(90, 720, 10, 10);
	Dot d113 = new Dot(710, 680, 10, 10);
	Dot d114 = new Dot(710, 720, 10, 10);
	Dot d115 = new Dot(270, 200, 10, 10);
	Dot d117 = new Dot(270, 240, 10, 10);
	Dot d118 = new Dot(270, 340, 10, 10);
	Dot d119 = new Dot(270, 380, 10, 10);
	Dot d120 = new Dot(270, 420, 10, 10);
	Dot d116 = new Dot(540, 200, 10, 10);
	Dot d129 = new Dot(540, 240, 10, 10);
	Dot d121 = new Dot(270, 462, 10, 10);
	Dot d122 = new Dot(270, 504, 10, 10);
	Dot d123 = new Dot(270, 546, 10, 10);
	Dot d124 = new Dot(270, 588, 10, 10);
	Dot d125 = new Dot(540, 462, 10, 10);
	Dot d126 = new Dot(540, 504, 10, 10);
	Dot d127 = new Dot(540, 546, 10, 10);
	Dot d128 = new Dot(540, 588, 10, 10);
	Dot d130 = new Dot(270, 200, 10, 10);
	Dot d131 = new Dot(540, 240, 10, 10);
	Dot d132 = new Dot(540, 340, 10, 10);
	Dot d133 = new Dot(540, 380, 10, 10);
	Dot d134 = new Dot(540, 420, 10, 10);
	Dot d135 = new Dot(230, 420, 10, 10);
	Dot d136 = new Dot(575, 420, 10, 10);
	Dot d137 = new Dot(230, 590, 10, 10);
	Dot d138 = new Dot(230, 680, 10, 10);
	Dot d139 = new Dot(575, 590, 10, 10);
	Dot d140 = new Dot(575, 680, 10, 10);
	Dot d141 = new Dot(540, 680, 10, 10);
	Dot d142 = new Dot(540, 720, 10, 10);
	Dot d143 = new Dot(540, 760, 10, 10);
	Dot d144 = new Dot(270, 680, 10, 10);
	Dot d145 = new Dot(270, 720, 10, 10);
	Dot d146 = new Dot(270, 760, 10, 10);
	Dot d147 = new Dot(460, 760, 10, 10);
	Dot d148 = new Dot(500, 760, 10, 10);
	Dot d149 = new Dot(320, 760, 10, 10);
	Dot d150 = new Dot(360, 760, 10, 10);
	Dot d151 = new Dot(320, 680, 10, 10);
	Dot d152 = new Dot(360, 680, 10, 10);
	Dot d153 = new Dot(320, 590, 10, 10);
	Dot d154 = new Dot(360, 590, 10, 10);
	Dot d155 = new Dot(320, 340, 10, 10);
	Dot d156 = new Dot(360, 340, 10, 10);
	Dot d157 = new Dot(320, 505, 10, 10);
	Dot d158 = new Dot(360, 505, 10, 10);
	Dot d159 = new Dot(320, 240, 10, 10);
	Dot d160 = new Dot(360, 240, 10, 10);
	Dot d161 = new Dot(460, 680, 10, 10);
	Dot d162 = new Dot(460, 590, 10, 10);
	Dot d163 = new Dot(460, 340, 10, 10);
	Dot d164 = new Dot(460, 505, 10, 10);
	Dot d165 = new Dot(460, 240, 10, 10);
	Dot d166 = new Dot(500, 680, 10, 10);
	Dot d167 = new Dot(500, 590, 10, 10);
	Dot d168 = new Dot(500, 340, 10, 10);
	Dot d169 = new Dot(500, 505, 10, 10);
	Dot d170 = new Dot(500, 240, 10, 10);
	Dot d171 = new Dot(410, 340, 10, 10);
	Dot d172 = new Dot(410, 505, 10, 10);
	Dot d173 = new Dot(360, 286, 10, 10);
	Dot d174 = new Dot(360, 635, 10, 10);
	Dot d175 = new Dot(460, 286, 10, 10);
	Dot d176 = new Dot(460, 635, 10, 10);

	GamePanel() {
		try {

			ghostImg = ImageIO.read(this.getClass().getResourceAsStream("Ghost.gif"));
			PACLIMG = ImageIO.read(this.getClass().getResourceAsStream("PACMAN.png"));
			PACDIMG = ImageIO.read(this.getClass().getResourceAsStream("PacmanD.png"));
			PACRIMG = ImageIO.read(this.getClass().getResourceAsStream("PacmanRT.png"));
			PACUIMG = ImageIO.read(this.getClass().getResourceAsStream("PacmanUP.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		OM.addObject(d51);
		OM.addObject(d52);
		OM.addObject(d53);
		OM.addObject(d54);
		OM.addObject(d55);
		OM.addObject(d56);
		OM.addObject(d57);
		OM.addObject(d58);
		OM.addObject(d59);
		OM.addObject(d60);
		OM.addObject(d61);
		OM.addObject(d62);
		OM.addObject(d63);
		OM.addObject(d64);
		OM.addObject(d65);
		OM.addObject(d66);
		OM.addObject(d67);
		OM.addObject(d68);
		OM.addObject(d69);
		OM.addObject(d70);
		OM.addObject(d71);
		OM.addObject(d72);
		OM.addObject(d73);
		OM.addObject(d74);
		OM.addObject(d75);
		OM.addObject(d76);
		OM.addObject(d77);
		OM.addObject(d78);
		OM.addObject(d79);
		OM.addObject(d80);
		OM.addObject(d81);
		OM.addObject(d82);
		OM.addObject(d83);
		OM.addObject(d84);
		OM.addObject(d85);
		OM.addObject(d86);
		OM.addObject(d87);
		OM.addObject(d88);
		OM.addObject(d89);
		OM.addObject(d90);
		OM.addObject(d91);
		OM.addObject(d92);
		OM.addObject(d93);

		OM.addObject(d94);
		OM.addObject(d95);
		OM.addObject(d96);
		OM.addObject(d97);
		OM.addObject(d98);
		OM.addObject(d99);
		OM.addObject(d100);
		OM.addObject(d101);
		OM.addObject(d102);
		OM.addObject(d103);
		OM.addObject(d104);
		OM.addObject(d105);
		OM.addObject(d106);
		OM.addObject(d107);
		OM.addObject(d108);
		OM.addObject(d109);
		OM.addObject(d110);
		OM.addObject(d111);
		OM.addObject(d112);
		OM.addObject(d113);
		OM.addObject(d114);
		OM.addObject(d115);
		OM.addObject(d116);
		OM.addObject(d117);
		OM.addObject(d118);
		OM.addObject(d119);
		OM.addObject(d120);
		OM.addObject(d121);
		OM.addObject(d122);
		OM.addObject(d123);
		OM.addObject(d124);
		OM.addObject(d125);
		OM.addObject(d126);
		OM.addObject(d127);
		OM.addObject(d128);
		OM.addObject(d129);
		OM.addObject(d130);
		OM.addObject(d131);
		OM.addObject(d132);
		OM.addObject(d134);
		OM.addObject(d133);
		OM.addObject(d135);
		OM.addObject(d136);
		OM.addObject(d137);
		OM.addObject(d138);
		OM.addObject(d139);
		OM.addObject(d140);
		OM.addObject(d141);
		OM.addObject(d142);
		OM.addObject(d143);
		OM.addObject(d144);
		OM.addObject(d145);
		OM.addObject(d146);
		OM.addObject(d147);
		OM.addObject(d148);
		OM.addObject(d149);
		OM.addObject(d150);
		OM.addObject(d151);
		OM.addObject(d152);
		OM.addObject(d154);
		OM.addObject(d153);
		OM.addObject(d155);
		OM.addObject(d156);
		OM.addObject(d157);
		OM.addObject(d158);
		OM.addObject(d159);
		OM.addObject(d160);
		OM.addObject(d161);
		OM.addObject(d162);
		OM.addObject(d163);
		OM.addObject(d164);
		OM.addObject(d165);
		OM.addObject(d166);
		OM.addObject(d167);
		OM.addObject(d168);
		OM.addObject(d169);
		OM.addObject(d170);
		OM.addObject(d171);
		OM.addObject(d172);
		OM.addObject(d173);
		OM.addObject(d174);
		OM.addObject(d175);
		OM.addObject(d176);

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
		if (PM.isAlive == false) {
			currentState = END_STATE;

		}
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
		g.setFont(titleFont5);
		g.drawString("Use the Up, Down, Left and Right Keys to move.", 80, 600);
		g.drawString("Collect all the food to win! Beware: The ghost goes through walls!", 5, 650);
		g.drawString("Final Score Should Be 176! GOOD LUCK.", 100, 700);
		g.setFont(titleFont6);
		g.setColor(Color.RED);
		g.drawString("*HINT: Use tunnels to your advantage!", 280, 800);
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
