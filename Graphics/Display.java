import java.applet.*;
import java.awt.*;
public class Display  extends Applet
  {
    Image pic;
    public void init()
      {
        pic =getImage(getDocumentBase(),"title.jpg");
      }
    public void paint(Graphics g)
      {
        g.drawImage(pic, 100,30,this);
      }
  }