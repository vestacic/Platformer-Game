package Main;

import Inputs.KeyboardInput;
import Inputs.MouseInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    public GamePanel(){
        addKeyListener(new KeyboardInput());
        addMouseListener(new MouseInput());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100,100,200,50);
    }
}
