import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class TournamentSim extends JPanel implements KeyListener{
    int simulation = 0;
    Team[] teams = new Team[16];
    JFrame frame;
    int box_width = 80;
    int box_height = 40;
    int increment = 20;
    Font font = new Font("Arial",Font.BOLD,13);
    BufferedImage bracket;
    public TournamentSim(int width,int height) {
        frame = new JFrame("Tournament");
        frame.add(this);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.addKeyListener(this);
        try {
            bracket = ImageIO.read(new File("/Users/manu/Desktop/bracket.png"));
        }
        catch(IOException io) {
            System.err.println("Image error");
        }
        bracket = resize(bracket,700,450);

    }
    public BufferedImage resize(BufferedImage image, int width, int height) {
        Image temp = image.getScaledInstance(width,height,Image.SCALE_SMOOTH);
        BufferedImage scaledVersion = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = scaledVersion.createGraphics();
        g2.drawImage(temp,0,0,null);
        g2.dispose();
        return scaledVersion;
    }
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.fillRect(0,0,frame.getWidth(),frame.getHeight());
        g.setColor(new Color(234,182,118));
        if(simulation >= 0) {
            int counter = 0;
            for (int i = 0; i < 9; i++) {
                //g.setColor(new Color(234,182,118));
                //g.fillRect(20, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                //g.drawString("Team Name", 20,increment+30);

                //g.setColor(new Color(234,182,118));
                //g.fillRect(400, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                g.drawString("Team name", 30, increment + 150);
                g.drawString("Team name", 600, increment + 150);
                increment += 50;
            }
        }
        increment = 200;
        if(simulation >= 1) {
            int counter = 0;
            for (int i = 0; i < 2; i++) {
                //g.setColor(new Color(234,182,118));
                //g.fillRect(20, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                //g.drawString("Team Name", 20,increment+30);

                //g.setColor(new Color(234,182,118));
                //g.fillRect(400, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                g.drawString("Team name", 130, increment);
                g.drawString("Team name", 500, increment);
                increment += 75;
            }
            increment += 25;

            for (int i = 0; i < 2; i++) {
                //g.setColor(new Color(234,182,118));
                //g.fillRect(20, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                //g.drawString("Team Name", 20,increment+30);

                //g.setColor(new Color(234,182,118));
                //g.fillRect(400, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                g.drawString("Team name", 130, increment);
                g.drawString("Team name", 500, increment);
                increment += 90;
            }
        }
        increment = 235;
        if (simulation >= 2){
            for (int i = 0; i < 2; i++) {
                //g.setColor(new Color(234,182,118));
                //g.fillRect(20, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                //g.drawString("Team Name", 20,increment+30);

                //g.setColor(new Color(234,182,118));
                //g.fillRect(400, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                g.drawString("Team name", 200, increment);
                g.drawString("Team name", 400, increment);
                increment += 175;
            }
        }
        increment = 325;
        if (simulation >= 3) {
            for (int i = 0; i < 1; i++) {
                //g.setColor(new Color(234,182,118));
                //g.fillRect(20, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                //g.drawString("Team Name", 20,increment+30);

                //g.setColor(new Color(234,182,118));
                //g.fillRect(400, increment, box_width, box_height);

                g.setColor(Color.BLACK);
                g.drawString("Team name", 270, increment);
                g.drawString("Team name", 400, increment);
            }
        }
        g.drawImage(bracket,0,100,this);
        }
        public void keyPressed (KeyEvent e) {
            if (e.getKeyCode() == 10) {
                simulation += 1;
            }
        }
        public void keyReleased(KeyEvent e) {

        }
        public void keyTyped(KeyEvent e) {

        }



}

