package test_swing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("Stock des livres");
  private JButton bouton2 = new JButton("Liste des adherents");
  private JButton bouton3 = new JButton("Liste des adhesions");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Gestion/Informations/recherche");
  private int compteur = 0;

  public Fenetre(){
    this.setTitle("Accueil");
    this.setSize(800, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);

    bouton.addActionListener(this);
    bouton2.addActionListener(this);

    JPanel container2 = new JPanel();
    container2.add(bouton);
    container2.add(bouton2);
    container2.add(bouton3);
    container.add(container2, BorderLayout.CENTER);

    Font police = new Font("Tahoma", Font.BOLD, 16);
    label.setFont(police);
    label.setForeground(Color.blue);
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);
  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	this.compteur++;
    //label.setText("Vous avez cliqué " + this.compteur + " fois");
	Fenetre fen = new Fenetre();
	
}

  //…
}