package day5;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;
	
	ScaryMaze() throws Exception {
		//1. Use this online tool to make a maze image and drop it into your day5 package: http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("ScaryMaze.jpg"));
		//2. set the mouse pointer to the start of your maze using:
		new Robot().mouseMove(100, 100);
		
		//new Robot().mouseMove(xPosition, yPosition)
		
		//3. add a mouse motion listener using:
		//addMouseMotionListener(this)
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		//4. print the mouseColor variable to see what color the mouse is touching
		System.out.println(mouseColor);

		//5. make a variable to hold the background color. 
		int background = -1;
		int endColor =-15949022;
		
		

		//6. if the mouse falls off the path (if it is on the background)
		if(background == mouseColor) {
			scare();
			JOptionPane.showMessageDialog(null, "You Lose!");
		}
		if(mouseColor == -15949022) {
			JOptionPane.showMessageDialog(null, "You Win!");
			showImage("trophy.jpg");
		}
		
				// call the scare method
		
		//10. if the mouse is on the end color
				
				// pop up a message to tell them they won
		
	}

	private void showImage() {
		// TODO Auto-generated method stub
		
	}

	private void scare() {
		System.out.println("BOO!");
		//7. find a scary sound and put it in the day5 package where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		showScaryImage("scaryface.jpg");
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("jumpscare.wav"));
		
		//8. play the scary sound. Hint: type "sound" and then a period.	
		sound.play();
		
		
		//9. drop an image into your day5 package, and use the showScaryImage method to scare your victim!
   
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource("scaryface.jpg"));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}
	private void showImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource("trophy.jpg"));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Adi's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	
}



