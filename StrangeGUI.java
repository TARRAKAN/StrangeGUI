import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StrangeGUI implements ActionListener{
    JFrame frame;    
    
    public static void main(String[] args){
        StrangeGUI gui = new StrangeGUI();
        gui.go();
    }
    
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Изменить цвет");
        button.addActionListener(this);
        DrawPanel drawPanel = new DrawPanel();
        DrawPanel2D drawPanel2D = new DrawPanel2D();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, drawPanel);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel2D);
        frame.setSize(300, 600);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }

}                          
