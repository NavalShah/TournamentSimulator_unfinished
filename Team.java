import javax.swing.*;
import java.awt.*;
public class Team {
    double rating;
    Player[] players = new Player[11];
    public void increaseRating(double increment) {
        rating += increment;
    }
    public Team() {

    }

    public static void main(String[] args) {

    }
}

