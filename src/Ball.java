import java.awt.*;

/*
 * Kevin Nguyen
 * 04/16/2024
 * Creates fields color and size for Ball, uses compareTo to compare size of Balls,
 * and uses toString to return the color and size
 */

public class Ball implements Comparable<Ball> {

    // instance fields
    private Color color;
    private int size;

    // constructors
    // we don't have a default constructor anymore
    public Ball(Color color, int size) {
        this.color = color;
        this.size = size;
    }

    // getters
    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    // compareTo compares size of Balls
    @Override
    public int compareTo(Ball other) {
        if (this.size < other.size) {
            return -1;
        } else if (this.size > other.size) {
            return 1;
        }
        return 0;
    }

    // toString()
    @Override
    public String toString() {
        return "Ball Color: [red = " + color.getRed() +
                " green = " + color.getGreen() +
                " blue = " + color.getBlue() +
                "] Ball size: " + getSize() + " inches";
    }
}
