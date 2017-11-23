package lab8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class lab81{
    public static void main(String[] args) {
        JFrame frame=new JFrame("Test");
        frame.setBounds(0, 0,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(){
            Graphics2D g2;

            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g2=(Graphics2D)g;
                g2.setColor(Color.BLACK);
                g2.drawLine(20, 400, 400, 400);
                g2.drawLine(20, 400, 20, 200);
                g2.drawLine(400, 200, 400, 400);
                g2.drawLine(20, 200, 400, 200);
                g2.drawLine(215, 100, 400, 200);
                g2.drawLine(215, 100, 20, 200);
            }
        };
        frame.setContentPane(contentPane);
    }
}
