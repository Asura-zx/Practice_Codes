package OOP.INHERITENCE;
import java.awt.event.*;
import java.text.Format;

import javax.swing.*;
public class WindowCloser extends WindowAdapter{
    
    public WindowCloser(){}

    public void windowClosing(WindowEvent wE){
        JOptionPane pane=new JOptionPane();
        JFrame frame=new JFrame();
        pane.showMessageDialog(frame, "Program Exit !", "Exit", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
 