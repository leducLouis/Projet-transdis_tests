package test_swing;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO;
import javax.swing.JButton;
  
public class Bouton_Accueil extends JButton implements MouseListener{
  private String name;
  private Image img;
  private Book_List_Window mainWindow;

  public Bouton_Accueil(String str, Book_List_Window Window){
    super(str);
    this.name = str;
    mainWindow = Window;
  this.addMouseListener(this);
  }


  public void mouseClicked(MouseEvent event) {
                      
  }

  public void mouseEntered(MouseEvent event) {
    
  }

  public void mouseExited(MouseEvent event) {
  
  }

  public void mousePressed(MouseEvent event) {
    
  }

 
  public void mouseReleased(MouseEvent event) {
	//mainWindow.dispatchEvent(new WindowEvent(mainWindow, WindowEvent.WINDOW_CLOSING));
    //Window_home Accueil = new Window_home();
	mainWindow.dispose();
     
    }              
  }       