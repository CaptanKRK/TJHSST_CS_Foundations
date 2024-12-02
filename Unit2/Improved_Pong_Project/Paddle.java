package Improved_Pong_Project;

import java.awt.*;

public class Paddle {
    private double x, y;
    private double width, height;
    private Color color;

    // Constructor
    public Paddle(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getters and setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Instance method to move the paddle
    public void move(double deltaY) {
        this.y += deltaY; // move vertically by deltaY
    }

    // Draw the paddle
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect((int) x, (int) y, (int) width, (int) height);
    }
}