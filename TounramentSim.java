import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TournamentSim extends JPanel{
    Team[] teams = new Team[16];
    JFrame frame;
    int box_width = 80;
    int box_height = 40;
    int increment = 20;
    Font font = new Font("Arial",Font.BOLD,13);
    public TournamentSim(int width,int height) {
        frame = new JFrame("Tournament");
        frame.add(this);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

    }
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setFont(font);
        g.setColor(Color.BLUE);
        g.fillRect(0,0,frame.getWidth(),frame.getHeight());
        g.setColor(new Color(234,182,118));
        int counter = 0;
        for (int i = 0; i < 9; i ++) {
            g.setColor(new Color(234,182,118));
            g.fillRect(20, increment, box_width, box_height);

            g.setColor(Color.BLACK);
            g.drawString("Team Name", 20,increment+30);

            g.setColor(new Color(234,182,118));
            g.fillRect(400, increment, box_width, box_height);

            g.setColor(Color.BLACK);
            g.drawString("Team name", 400, increment+30);
            increment += 65;
        }

    }
}
