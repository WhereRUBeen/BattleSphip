package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class principale extends JFrame {
	
	
	
	
	public  static void principale() {
		
		class EcouteurBoutons implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				System.out.println("boutton " + btn.getText() + " appuyer");

			}

		}
		
		
	JFrame fenetreBattleship = new JFrame("Battleship");
	fenetreBattleship.setSize(500, 1000);
	fenetreBattleship.setDefaultCloseOperation(EXIT_ON_CLOSE);
	fenetreBattleship.setLayout(new GridLayout(7, 1));
	fenetreBattleship.getContentPane().setBackground(new Color(0, 203, 173));
	fenetreBattleship.setVisible(true);
	
	EcouteurBoutons ecouteur = new EcouteurBoutons();
	String[] nomboutons = { "1", "2", "3", "4", "5","6","7","8","10" };
	for (String txt : nomboutons) {
		JButton btn = new JButton(txt);
		btn.addActionListener(ecouteur);
		.add(btn);
	}
	
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		principale();
		

	}

}
