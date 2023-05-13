import javax.swing.*;
import java.awt.*;
public class Board extends JPanel{
    int width;
    int height;
    JFrame frame;
    Color background_color;
    public Board(int width, int height, Color color) {
        this.background_color = color;
        this.width = width;
        this.height = height; 
        frame = new JFrame();
        frame.add(this);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(background_color);
        g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
    }

    public static void main(String[] args) {
        //Board board = new Board(1150,1150,Color.BLACK);
    }
}

