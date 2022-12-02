package OOP.INHERITENCE;

import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PolyTestView extends JFrame implements StandardColors{
    JTextArea frameTextArea;
    Container frameContainer;

    public PolyTestView(){
        super("PolyTestView Application");
        init();
    }

    public void init(){
        //Jframe method to close the window
        //addWindowListener(new WindowCloser());

        frameContainer=getContentPane();
        frameTextArea=new JTextArea("\tDieselElectric Test Class",50,50);

        frameTextArea.setEditable(true);
        frameTextArea.setLineWrap(true);
        frameContainer.add(frameTextArea);
        setBackground(Color.GRAY);
        setSize(520,300);
        setVisible(true);
        setResizable(false);
        runGeneralTest();
    }

    public void runGeneralTest(){
        DieselElectric deObjectB=new DieselElectric("DE0001");
        DieselElectric deObjectR=new DieselElectric("DE0002");
        DieselElectric deObjectG=new DieselElectric("DE0003");
        DieselElectric deObjectY=new DieselElectric("DE0004");
        DieselElectric deObjectW=new DieselElectric("DE0005");
        DieselElectric deObjectK=new DieselElectric("DE0006");

        deObjectB.setExtColor(StandardColors.BLU);
        deObjectR.setExtColor(StandardColors.RED);
        deObjectG.setExtColor(StandardColors.GRN);
        deObjectY.setExtColor(StandardColors.YLW);
        deObjectW.setExtColor(StandardColors.WHT);
        deObjectK.setExtColor(StandardColors.BLK);

        //calling JTextArea=append() method
        frameTextArea.append("\n\n    Interface colors \n");
        frameTextArea.append("\n\n A. StandardColors.BLU : \t"+StandardColors.BLU+ "\t"+deObjectB.getExtColor());
        frameTextArea.append("\n\n A. StandardColors.RED : \t"+StandardColors.RED+ "\t"+deObjectR.getExtColor());
        frameTextArea.append("\n\n A. StandardColors.GRN : \t"+StandardColors.GRN+ "\t"+deObjectG.getExtColor());
        frameTextArea.append("\n\n A. StandardColors.YLW : \t"+StandardColors.YLW+ "\t"+deObjectY.getExtColor());
        frameTextArea.append("\n\n A. StandardColors.WHT : \t"+StandardColors.WHT+ "\t"+deObjectW.getExtColor());
        frameTextArea.append("\n\n A. StandardColors.BLK : \t"+StandardColors.BLK+ "\t"+deObjectK.getExtColor());
    }
    
    public static void main(String[] args) {
        new PolyTestView();
    }

}
