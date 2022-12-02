package GUI.JFRAME.Jframepractice1;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class core {
    public static void main(String args[]){
    JFrame frame=new JFrame();
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("explorer.exe (stopped responding)");
        frame.setVisible(true);
        
        frame.setResizable(false);
        frame.setSize(420,420);
        ImageIcon image=new ImageIcon("C:\\Users\\lamsa\\OneDrive\\Desktop\\vscode\\java\\GUI\\JFRAME\\Jframepractice1\\question.jpg");
        frame.setIconImage(image.getImage());
        
}
}
