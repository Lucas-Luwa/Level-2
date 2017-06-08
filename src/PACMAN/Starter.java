package PACMAN;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Starter {
	public static void main(String[] args) {
		Starter S = new Starter();
		S.Create();
	}

	void Create() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		f.setVisible(true);
		f.setSize(1000, 1000);
	
	
	}
	

}