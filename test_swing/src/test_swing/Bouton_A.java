package test_swing;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Bouton_A extends JButton implements ActionListener {
	private String name;
	private Book_List_Window _mainWindow;
	
	public Bouton_A(Book_List_Window book_List_Window) {
		super();
		this.setName("Accueil");
		_mainWindow = book_List_Window;
	}

	public void Button_A(Book_List_Window mainWindow){
	}
	
	public void actionPerformed(ActionEvent e) {
		_mainWindow.dispatchEvent(new WindowEvent(_mainWindow, WindowEvent.WINDOW_CLOSING));
	}
	
}
