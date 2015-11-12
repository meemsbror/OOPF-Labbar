package lab1;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class SnakeBodyTile extends RectangularTile{
	public SnakeBodyTile(){
		super(Color.GREEN);
	}	
	public void draw(final Graphics g, final int x, final int y,final Dimension d){
		super.draw(g,x,y,d);
		g.setColor(Color.BLACK);
		g.drawOval(x+d.width/3,y+d.height/4,d.width,d.height);
		g.drawOval(x+d.width/17,y+d.height/2,d.width,d.height);
		g.drawOval(x+d.width/0.5,y+d.height/4.5,d.width,d.height);
	}	
}
