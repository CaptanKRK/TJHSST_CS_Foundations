package Improved_Pong_Project;

import Lab17.Polkadot;
import Lab17.PrizePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class PongFrame extends JPanel {
    private static final int FRAME = 400;
    private static final Color BACKGROUND = new Color(204, 204, 204);
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Ball ball;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Timer t;
    private int right_hits = 0;
    private int left_hits = 0;

    // Constructor to initialize game components
    public PongFrame() {
        myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        myBuffer.setColor(BACKGROUND);
        myBuffer.fillRect(0, 0, FRAME,FRAME);
        // Initialize the ball and paddles
        ball = new Ball(200, 200, 50, Color.BLACK);
        leftPaddle = new Paddle(50, 100, 10, 60, Color.RED);
        rightPaddle = new Paddle(350, 100, 10, 60, Color.BLUE);

        setFocusable(true);

        t = new Timer(5, new Listener());
        t.start();
        // Add KeyListener to move paddles with arrow keys
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                // Move left paddle with W and S keys
                if (keyCode == KeyEvent.VK_W) {
                    leftPaddle.move(-5);  // move up
                } else if (keyCode == KeyEvent.VK_S) {
                    leftPaddle.move(5);   // move down
                }
                // Move right paddle with Up and Down arrow keys
                if (keyCode == KeyEvent.VK_UP) {
                    rightPaddle.move(-5);  // move up
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    rightPaddle.move(5);   // move down
                }
            }
        });

    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0,0,FRAME,FRAME);

            ball.move(FRAME,FRAME);
            collide(ball, leftPaddle);
            collide(ball, rightPaddle);

            ball.draw(myBuffer);

            myBuffer.setColor(Color.BLACK);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            //myBuffer.drawString("Count: "+hits, FRAME-150, 25);
            repaint();
        }
    }
    private void collide(Ball ball, Paddle paddle) {
        double ballLeft = ball.getX();
        double ballRight = ball.getX() + ball.getRadius() * 2;
        double ballTop = ball.getY();
        double ballBottom = ball.getY() + ball.getRadius() * 2;

        double paddleLeft = paddle.getX();
        double paddleRight = paddle.getX() + paddle.getWidth();
        double paddleTop = paddle.getY();
        double paddleBottom = paddle.getY() + paddle.getHeight();

        if (ballRight >= paddleLeft && ballLeft <= paddleRight &&
                ballBottom >= paddleTop && ballTop <= paddleBottom) {
            ball.setdx(-ball.getdx());
            ball.setdy(-ball.getdy());
        }
    }
    // Draw game components
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw ball and paddles
        ball.draw(g);
        leftPaddle.draw(g);
        rightPaddle.draw(g);
    }
}
