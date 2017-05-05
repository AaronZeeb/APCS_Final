import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.awt.Ellipse;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
public class TitleScreen extends JComponent
{
    int x,y,w,h,i,count;
    Graphics2D g2;
    Color mycolor;
    
    Rectangle box;
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        box = new Rectangle(1,1,800,400);
        g2.setColor(mycolor);
        g2.fill(box);

    }
    
    public void nextFrame(int time)
    {
		if(time>=5 &&time<=10)
			mycolor=new Color(25,76,32);
		else
			mycolor=Color.BLUE;
        repaint();
    }
}
