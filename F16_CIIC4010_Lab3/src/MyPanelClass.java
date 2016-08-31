import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.WHITE);
		g.fillRect(x1, y1, width + 1, height + 1);

		//                        //Draw a border
		//                        g.setColor(Color.CYAN);
		//                        g.drawRect(x1, y1, width, height);
		//                        
		//                        //Draw second inner border
		//                        g.setColor(Color.RED);
		//                        g.drawRect(x1 + 8, y1 + 8, width - 16, height -16);
		//                        
		//                        g.setColor(Color.WHITE);
		//                        g.drawLine(x1, y1, x2, y2);
		//                        
		//                        g.setColor(Color.BLACK);
		//                        g.drawLine(width, y1 , x1, height);
		//                        
		//                        g.setColor(Color.BLACK);
		//                        g.fillOval( (x2 - 54) / 2, (y2 - 54) / 2, 55, 55);

		//                        Polygon p = new Polygon();
		//                        p.addPoint(x1 + 5, y1 + 25);
		//                        p.addPoint(x1 + 20, y1 + 10);
		//                        p.addPoint(x1 + 35, y1 + 25);
		//                        p.addPoint(x1 + 25, y1 + 25);
		//                        p.addPoint(x1 + 25, y1 + 45);
		//                        p.addPoint(x1 + 15, y1 + 45);
		//                        p.addPoint(x1 + 15, y1 + 25);
		//                        g.setColor(Color.YELLOW);
		//                        g.fillPolygon(p);

		g.setColor(Color.RED);
		g.fillRect(x1, y1, 200, 25);
		g.fillRect(x1, 50, 200, 25);
		g.fillRect(x1, 100, 200, 25);

		Polygon triangle = new Polygon();
		triangle.addPoint(x1, y1);
		triangle.addPoint(100, 63);
		triangle.addPoint(x1, 125);
		g.setColor(Color.BLUE);
		g.fillPolygon(triangle);


		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 15, y1 + 55);
		p2.addPoint(x1 + 31, y1 + 55);
		p2.addPoint(x1 + 37, y1 + 40);
		p2.addPoint(x1 + 43, y1 + 55);
		p2.addPoint(x1 + 59, y1 + 55);
		p2.addPoint(x1 + 46, y1 + 65);
		p2.addPoint(x1 + 51, y1 + 80);
		p2.addPoint(x1 + 37, y1 + 70);
		p2.addPoint(x1 + 24, y1 + 80);
		p2.addPoint(x1 + 27, y1 + 65);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);
	}
}