/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleeditor;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author vitya
 */
public class SimpleEditor extends JFrame{
private Container cp;
private JLabel fileName;
private JTextArea text;
private JMenuBar bar;
private JMenu[] menu;
private JMenuItem[] commandMenu;
private JButton[] commandButton;
private SimpleEditorListener listener;

protected SimpleEditor () {
setTitle ("Simple text editor");
init ();
createMenu ();
setVisible (true);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private void init () {
    setTitle ("Simple text editor");
    setResizable (false);
    
    }

    private void createMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
