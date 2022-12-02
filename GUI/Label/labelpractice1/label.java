package GUI.Label.labelpractice1;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;;
public class label {
    public static void main(String args[]){
        Border border=BorderFactory.createLineBorder(Color.GREEN,3);
        ImageIcon image=new ImageIcon("C:\\Users\\lamsa\\OneDrive\\Desktop\\vscode\\java\\GUI\\Label\\labelpractice1\\question.jpg");
        JFrame frame=new JFrame();
        JLabel label=new JLabel();
        label.setText("bro, you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        //label.text
        label.setForeground(Color.GREEN);
        label.setIconTextGap(-50);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        //label.setBounds(100, 100, 250, 0250);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("label practice");
        frame.setSize(1000,1000);
       // frame.setLayout(null);
        frame.add(label);
        frame.pack();
    }
}
//C:\Users\lamsa\OneDrive\Desktop\vscode\java\GUI\Label\labelpractice1\question.jpg