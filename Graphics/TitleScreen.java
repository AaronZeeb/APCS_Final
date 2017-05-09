import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.awt.Ellipse;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;


import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
public class TitleScreen extends JComponent
{
    int x,y,w,h,i,count;
    Graphics2D g2;
    Color mycolor;

    Rectangle box;
    
    /**
     * Constructor that takes no arguments
     */
    public TitleScreen()
    {
      /* not needed but use it to show students the implicit call to super()
       * child constructors always call a parent constructor
       */
      super();
    }
         /**
     * Constructor that takes a file name and creates the picture
     * @param fileName the name of the file to create the picture from
     */
    public TitleScreen(String fileName)
    {
      // let the parent class handle this fileName
      super(fileName);
    }
         /**
     * Constructor that takes the width and height
     * @param width the width of the desired picture
     * @param height the height of the desired picture
     */
    public TitleScreen(int width, int height)
    {
      // let the parent class handle this width and height
      super(width,height);
    }
         /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     */
    public TitleScreen(TitleScreen copyTitleScreen)
    {
      // let the parent class do the copy
      super(copyTitleScreen);
    }
         /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public TitleScreen(BufferedImage image)
     {
        super(image);
      }
    
        
        
    
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
        repaint();
    }
}
