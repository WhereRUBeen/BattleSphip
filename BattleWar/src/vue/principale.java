package vue;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class principale extends JFrame {

	public static void principale() {

		class EcouteurBoutons implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				System.out.println("boutton " + btn.getText() + " appuyer");

			}

		}

		JFrame fenetreBattleship = new JFrame("Battleship");
		fenetreBattleship.setSize(500, 1000);
		fenetreBattleship.setResizable(true);
		fenetreBattleship.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// fenetreBattleship.setLayout(new GridLayout(10, 10));
		fenetreBattleship.getContentPane().setBackground(new Color(0, 203, 173));
		JPanel panel_tableau = new JPanel();
		JPanel panel_tableau1 = new JPanel();
		JPanel lbl_score = new JPanel();
		JPanel lbl_vide = new JPanel();

		lbl_score.add(new JLabel("votre score est ! !"));
		lbl_score.add(new JButton("? "));
		fenetreBattleship.add(lbl_score);

		lbl_vide.setBackground(new Color(0, 203, 173));
		lbl_vide.add(new JLabel(" --------Tresor--------VS---------Brice-------"));

		fenetreBattleship.setLayout(new FlowLayout());
		EcouteurBoutons ecouteur = new EcouteurBoutons();
		String[] nomboutons = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		for (int i = 0; i < 10; i++) {
			for (String txt : nomboutons) {

				panel_tableau.setLayout(new GridLayout(10, 10, 2, 2));
				// JPanel panel_tableau2 = new JPanel();
				JButton btn = new JButton(txt);
				btn.setBackground(new Color(0, 100, 100));
				btn.addActionListener(ecouteur);
				JButton un = new JButton("**");
				;
				// panel_tableau.setLayout(new GridLayout(10, 10, 2, 2));
				if(i < 1 ) {btn.setBackground(new Color(0, 80, 50));
					panel_tableau.add(un);
				btn.setVisible(true);;
				panel_tableau.setFocusable(true);
				panel_tableau.remove(i);
				}
				panel_tableau.add(btn);
				fenetreBattleship.add(panel_tableau);
			}
			fenetreBattleship.setVisible(true);
		}

		fenetreBattleship.add(lbl_vide);

		for (int i = 0; i < 10; i++) {
			for (String txt : nomboutons) {
				panel_tableau1.setLayout(new GridLayout(10, 10, 2, 2));
				// JPanel panel_tableau2 = new JPanel();
				JButton btn = new JButton(txt);
				btn.setBackground(new Color(0, 100, 100));
				btn.addActionListener(ecouteur);
				// panel_tableau.setLayout(new GridLayout(10, 10, 2, 2));
				panel_tableau1.add(btn);
				fenetreBattleship.add(panel_tableau1);
			}
			fenetreBattleship.setVisible(true);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		principale();

	}

}
