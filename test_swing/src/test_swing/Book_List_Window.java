package test_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Book_List_Window extends JFrame implements ListSelectionListener, ActionListener{
	JList liste = new JList();
	private JPanel header = new JPanel();
	private JPanel container = new JPanel();
	private JButton bouton = new JButton("<< Accueil");
	JLabel etiquette = new JLabel("Stock de livres");
	Book_List_Window windMain = this;
	

	public Book_List_Window() {
		this.setTitle("Stock de livre");
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		
		//Les données du tableau
	    Object[][] data = {
	      {"Histoire Seconde", "9782868890061", new JButton("25€") },
	      {"Physique premiere S", "9782868890062", "60€"},
	      {"Géographie 3 eme", "9782868890065", "30€"},
	      {"Francais 6eme", "9782868890068", "15€"}
	    };

	    //Les titres des colonnes
	    String  title[] = {"Nom Livre", "ISBN", "Prix neuf"};
	    
	    ZModel model = new ZModel(data, title);
	    JTable tableau = new JTable(model);
	    tableau.setDefaultRenderer(JButton.class, new TableComponents());
	    JPanel container2 = new JPanel();
	    container2.add(new JScrollPane(tableau));
	    
		container.setLayout(new BorderLayout());
		container.add(container2, BorderLayout.CENTER);
		bouton.setHorizontalAlignment(JButton.CENTER);;
		container.add(bouton, BorderLayout.NORTH);
		this.setContentPane(container);
		setVisible(true);
		
		bouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				windMain.dispose();
				
			}
		});
	}

	 public void valueChanged(ListSelectionEvent evt) { 
	 etiquette.setText((String)liste.getSelectedValue());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

