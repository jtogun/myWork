package assignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;


public class BelishaBeacon {	
	private Timer timer;
	private boolean changingToGray = false;
	
	public BelishaBeacon(){
		JFrame body = new JFrame();
		body.setLayout(new BorderLayout());
		body.setTitle("belisha beacon");
		body.setSize(500, 700);
		
		JButton flashBtn = new JButton("flash");
		flashBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				timer.start();
			}
		});
		
		JButton steadyBtn = new JButton("steady");
		steadyBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				timer.stop();
			}
		});
		
		final Drawing beacon = new Drawing();
		
		timer = new Timer(500, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				beacon.repaint();
			}
		});
				
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1,2,5, 0));
		controlPanel.add(flashBtn);
		controlPanel.add(steadyBtn);
		
		body.add(controlPanel, BorderLayout.SOUTH);
		body.add(beacon);
		body.setVisible(true);
		body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private class Drawing extends JPanel {

		public void paintComponent(Graphics g){
			Graphics2D shapes = (Graphics2D) g;
			
			Ellipse2D.Double ball = new Ellipse2D.Double(200, 100, 100, 100);
			Rectangle b1 = new Rectangle (245, 200, 10, 40);
			Rectangle b2 = new Rectangle (245, 240, 10, 40);
			Rectangle b3 = new Rectangle (245, 280, 10, 40);
			Rectangle b4 = new Rectangle (245, 320, 10, 40);
			Rectangle b5 = new Rectangle (245, 360, 10, 40);
			Rectangle b6 = new Rectangle (245, 400, 10, 40);
			Rectangle b7 = new Rectangle (245, 440, 10, 40);
			Rectangle b8 = new Rectangle (245, 480, 10, 40);
			Rectangle b9 = new Rectangle (245, 520, 10, 40);
			Rectangle b10 = new Rectangle (245, 560, 10, 40);
			
			
			shapes.setColor(Color.ORANGE);
			shapes.fill(ball);
			shapes.setColor(Color.BLACK);
			shapes.fill(b1);
			shapes.fill(b3);
			shapes.fill(b5);
			shapes.fill(b7);
			shapes.fill(b9);
			
			shapes.draw(ball);
			shapes.draw(b1);
			shapes.draw(b2);
			shapes.draw(b3);
			shapes.draw(b4);
			shapes.draw(b5);
			shapes.draw(b6);
			shapes.draw(b7);
			shapes.draw(b8);
			shapes.draw(b9);
			shapes.draw(b10);
			
			if (changingToGray = !changingToGray) {
				shapes.setColor(Color.lightGray);
				shapes.fill(new Ellipse2D.Double(200, 100,100,100));
			}
			
		}
	}
	
	 public static void main(String[] args) {
	        new BelishaBeacon();
	     }
}
