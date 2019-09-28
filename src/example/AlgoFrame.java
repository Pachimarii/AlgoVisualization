package example;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class AlgoFrame extends JFrame {
	private int canvasWidth;
	private int canvasHeight;
	
	public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
		super(title);
		
		this.canvasWidth=canvasWidth;
		this.canvasHeight=canvasHeight;
		
		AlgoCanvas canvas = new AlgoCanvas();
		canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
		setContentPane(canvas);
		pack();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public AlgoFrame(String title) {
		this(title, 1024, 768);
	}
	
	public int getCanvasWidth() {return canvasWidth;}
	public int getCanvasHeight() {return canvasHeight;}
	
	private class AlgoCanvas extends JPanel {
		
		@Override
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
//			g.drawOval(50, 50, 300, 300);
			Graphics2D g2d = (Graphics2D)g;
			
			int strokeWidth = 5;
			g2d.setStroke(new BasicStroke(strokeWidth));
			g2d.setColor(Color.PINK);
//			50.2 to float: (1) (float)50.2,  (2) 50.2f
			Ellipse2D circle = new Ellipse2D.Double(50,50,300,300);
			g2d.draw(circle);
			
			g2d.setColor(Color.LIGHT_GRAY);
			g2d.setStroke(new BasicStroke(1));
			Ellipse2D round =  new Ellipse2D.Double(50,50,300,300);
			g2d.fill(round);
		}
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(canvasWidth, canvasHeight);
		}
	}
}