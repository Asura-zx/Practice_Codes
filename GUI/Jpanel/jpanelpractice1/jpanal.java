package GUI.Jpanel.jpanelpractice1;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jpanal {
    public static void main(String args[]) {
        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);
        
        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250, 0, 250, 250);

        JPanel greenPanal=new JPanel();
        greenPanal.setBackground(Color.GREEN);
        greenPanal.setBounds(0, 250, 500, 250);

        JLabel label=new JLabel();
        Border border=BorderFactory.createLineBorder(Color.GREEN);
        ImageIcon image=new ImageIcon("C:\\Users\\lamsa\\OneDrive\\Desktop\\vscode\\java\\GUI\\Label\\labelpractice1\\question.jpg");
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

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        greenPanal.add(label);

        frame.add(greenPanal);

    }
    
}
